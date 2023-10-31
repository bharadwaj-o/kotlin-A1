
// This class is not used in the current version of the app
class Guest constructor(custTot: Int) : Order() {
    var custTot: Int
    init {
            val delivery = 100
            super.ordertot = custTot + delivery
            //super.display();
            this.custTot = super.ordertot
        }

        fun paybill() {
            println("Press Y if you have a coupon code\nPress N if you do not have a coupon code")
            var coupon :Char = sc.next().single()
            if(coupon =='Y' || coupon =='y'){
                println("Please enter coupon code: ")
                var couponcode = sc.next()
                if(couponcode.endsWith("TROC")){
                    var start = couponcode.substring(IntRange(0,2)).toInt()
                    println("Total (Guest with Coupon) = ${this.custTot-start}")}
                else
                {
                    println("Invalid Coupon Code")
                    println("Total (Guest) = Rs.${this.custTot}")
                }
            }
            else {
                println("Total (Guest) = Rs.${this.custTot}")
                println(" Thank you for dining with us. \n Please visit again.")

            }
        }
    }
