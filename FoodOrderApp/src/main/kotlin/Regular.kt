
// This class is not used in the current version of the app
class Regular constructor(custTot: Int,name: String?) : Order() {
    var custTot=custTot
    var name = name
    init {
        val r_disc = 10
        super.ordertot = custTot - r_disc * custTot / 100
        //super.display();
        this.custTot = super.ordertot
    }

    fun paybill() {
        println("Total (Regular) = Rs.$custTot")
        println(" To avail special discounts and be a part of our PREMIUM POINTS club with assured gifts for every 10000 points earned, sign up with us to become a PREMIUM member\n You can also avail special discounts by signing up to become a REGULAR MEMBER\n To sign up as a member, please find us at The Royal Oak (Help Desk)\n Thank you for dining with us $name! \n Please visit again.")
    }
}