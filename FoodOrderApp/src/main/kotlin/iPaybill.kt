import java.io.File

interface iPayBill{
    fun paybill(tot:Int,name:String?,filename:File)
    companion object{}
}

object GuestNew : iPayBill{
    var order = Order()
    override fun paybill(tot: Int, name: String?, filename: File) {
        println("Press Y if you have a coupon code\nPress N if you do not have a coupon code")
        var coupon :Char = sc.next().single()
        if(coupon =='Y' || coupon =='y'){
            println("Please enter coupon code: ")
            var couponcode = sc.next()
            if(couponcode.endsWith("TROC")){
                var start = couponcode.substring(IntRange(0,2)).toInt()
                println("Total (Guest with Coupon) = ${tot-start}")
                println()
                println("Thank you for dining with us. \n Please visit again.")
            }
            else
            {
                println("Invalid Coupon Code")
                println("Total (Guest) = Rs.${tot}")
            }
        }
        else {
            println("Total (Guest) = Rs.${tot}")
            println()
            println(" To avail special discounts and be a part of our PREMIUM POINTS club with assured gifts for every 10000 points earned, sign up with us to become a PREMIUM member\n" +
                    " You can also avail special discounts by signing up to become a REGULAR MEMBER\n" +
                    " Thank you for dining with us. \n Please visit again.")

        }
        filename.appendText("\nGrand Total = Rs.${tot}\n\nTo avail special discounts and be a part of our PREMIUM POINTS club with assured gifts for every 10000 points earned, sign up with us to become a PREMIUM member\n" +
                "You can also avail special discounts by signing up to become a REGULAR MEMBER.\n" +
                "Thank you for dining with us. \nPlease visit again.")

    }
}

object RegularNew: iPayBill{
    override fun paybill(tot: Int, name: String?, filename: File) {
        val rdisc = 10
        val regbillCalc :(Int,Int)->Int = {total:Int,discount:Int->total - (discount * total/ 100)}
        val regbill = regbillCalc(tot,rdisc)
        filename.appendText("\nGrand Total = Rs.$tot\n\nAmount Due (With Regular Member Discount of 10% applied) = Rs.$regbill\n\nThank you for dining with us ${name}! \nPlease visit again.")
    }

}

object PremiumNew: iPayBill{
    override fun paybill(tot: Int, name: String?, filename: File) {
        val p_disc = 20
        var points = 0
        if(tot>999) {
             points =100*(tot/1000)
        }
        val prembillCalc :(Int,Int)->Int = {total:Int,discount:Int->total - (discount * total/ 100)}
        val prembill = prembillCalc(tot,p_disc)
        filename.appendText("\nGrand Total = Rs.$tot\n\nAmount Due (With Premium Member Discount of 20% applied) = Rs.$prembill\n")
        if(points>0){
            filename.appendText("Points added = $points\n\n")}
        println()
        filename.appendText("It was a pleasure serving you $name! \nThank you for dining with us.\nPlease visit again.")
    }

}
