import java.io.File

class Restaurant{
    var restName = "The Royal Oak"
    var restAdd = "Road No.45, Jubilee Hills, Hyderabad"
    var restPh = 1202301
    var restIG = "theroyaloak"
    var restEmail = "info@theroyaloak.in"
    fun displayfull(){
        println()
        println("        $restName \n          Restobar")
        println(" $restAdd")
        println("       Ph no.: $restPh")
        println("   IG Handle : @$restIG")
        println()
    }
    fun recieptfull(textFile:File){
        textFile.appendText("        $restName \n          Restobar\n" +
                " $restAdd\n" +
                "       Ph no.: $restPh\n" +
                "   IG Handle : @$restIG\n\n")
    }
    fun displaymain(){
        println(" $restName \n   Restobar")

    }
    fun exitMessage(){
        println("Contact us at: ${restPh}  OR  Reach out to us on our email ID: $restEmail")
        println("For updates regarding coupons to be availed for special discounts and Happy Hours: \nFollow us on IG @${restIG}")
    }
}