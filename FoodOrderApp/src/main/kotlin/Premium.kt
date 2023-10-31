
// This class is not used in the current version of the app
class Premium constructor(custTot: Int,name : String?) : Order() {
    var custTot=custTot
    var points: Int = 0
    var name = name
    init {
        val p_disc = 20
        if(super.ordertot>999) {
            points =100*(super.ordertot/1000)
        }
        super.ordertot = custTot - p_disc * custTot / 100
        //super.display();
        this.custTot = super.ordertot
    }

    fun paybill() {
        println("Total (Premium) = Rs.$custTot")
        if(points>0){
            println("Points added = $points")}
        println("It was a pleasure serving you $name! \nThank you for dining with us.\nPlease visit again.")
    }
}