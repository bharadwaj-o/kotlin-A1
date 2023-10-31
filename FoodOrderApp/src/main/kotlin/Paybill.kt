// This class is not used in the current version of the app
class Paybill(cust_id: String?){

    var cust_id = cust_id
    var order = Order()

    fun total(tot: Int, name: String?){
        var regular = Regular(tot,name)
        var guest = Guest(tot)
        var premium = Premium(tot,name)
        println()
        println("BILL: ")
        if(cust_id?.startsWith("r")==true){
            regular.paybill()
        }
        else if (cust_id?.startsWith("p")==true){
            premium.paybill()
        }
        else if(cust_id?.startsWith("g")==true){
            guest.paybill()
        }

    }
}