import java.io.File
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class FoodOrderApp{

}
fun main() {
    var rest = Restaurant()
    rest.displayfull()
    var customer = Customer()
    //edit here
    customer.getPh()
    Members.input()
    for(p in MembersData.pMembers){
        if(customer.phone_no == p.phno){
            customer.premium(p.id,p.name,p.address,p.emailID,p.location)
            break
        }
        else{
            continue
        }
    }
    for(r in MembersData.rMembers){
        if(customer.phone_no == r.phno){
            customer.regular(r.id,r.name,r.address,r.emailID,r.location)
            break
        }
        else{
            continue
        }
    }
    if(customer.name==null) {
        customer.getData()
        customer.display()
        if (customer.c_id?.startsWith("g")==false){
            throw MemberException("Invalid Customer ID")
        }
    }
   /* Details Confirmation
    var custconfirm : Char = sc.next().single()
    if(custconfirm=='Y' || custconfirm=='y'){
        println("Noted.")
    }
    else if (custconfirm=='N' || custconfirm=='n'){
        while(custconfirm=='N' || custconfirm=='n') {
            customer.getData()
            customer.display()
            custconfirm = sc.next().single()
        }
        println("Noted.")
    }
    */
    println("---------------------------------------------------------------")
    var wait1 = sc.next()

    rest.displaymain()
    var menu = Menu()
    menu.display()
    println("---------------------------------------------------------------")
    var wait2 = sc.next()

    rest.displaymain()
    var order = Order()
    order.takeorder()
    println("---------------------------------------------------------------")
    var wait3 = sc.next()
    /* Without using interface:
    var paybill = Paybill(customer.c_id)

    paybill.total(order.ordertot,customer.name)
     */
    //rest.displaymain()
    val current = LocalDateTime.now()
    val formatter = DateTimeFormatter.ofPattern("dd-MM-yyy -- HH:mm:ss")
    val date_time = current.format(formatter)

    if(customer.c_id?.startsWith("p")==true){
        //PremiumNew.paybill(order.ordertot,customer.name)
        var prem = File("Premium Reciept.txt")
        if(prem.exists()){
            prem.writeText("")
            rest.recieptfull(prem)
            prem.appendText("Date -- Time:$date_time\n\n")
            prem.appendText("Item x Quantity = Amount\n")
            for(i in order.itemslist.indices) {
                prem.appendText("${order.itemslist[i]} x ${order.qtylist[i]} = Rs.${order.itemtotlist[i]}\n")
            }
            PremiumNew.paybill(order.ordertot,customer.name,prem)
        }
        else{
            prem.createNewFile()
            prem.writeText("")
            rest.recieptfull(prem)
            prem.appendText("Date -- Time:$date_time\n\n")
            prem.appendText("Item x Quantity = Amount\n")
            for(i in order.itemslist.indices) {
                prem.appendText("${order.itemslist[i]} x ${order.qtylist[i]} = Rs.${order.itemtotlist[i]}\n")
            }
            PremiumNew.paybill(order.ordertot,customer.name,prem)

        }
    }
    else if (customer.c_id?.startsWith("r")==true){
        var reg = File("Regular Reciept.txt")
        if(reg.exists()){
            reg.writeText("")
            rest.recieptfull(reg)
            reg.appendText("Date -- Time:$date_time\n\n")
            reg.appendText("Item x Quantity = Amount\n")
            for(i in order.itemslist.indices) {
                reg.appendText("${order.itemslist[i]} x ${order.qtylist[i]} = Rs.${order.itemtotlist[i]}\n")
            }
            RegularNew.paybill(order.ordertot,customer.name,reg)
        }
        else{
            reg.createNewFile()
            reg.writeText("")
            rest.recieptfull(reg)
            reg.appendText("Date -- Time:$date_time\n\n")
            reg.appendText("Item x Quantity = Amount\n")
            for(i in order.itemslist.indices) {
                reg.appendText("${order.itemslist[i]} x ${order.qtylist[i]} = Rs.${order.itemtotlist[i]}\n")
            }
            RegularNew.paybill(order.ordertot,customer.name,reg)
        }


    }
    else if (customer.c_id?.startsWith("g")==true){
        //GuestNew.paybill(order.ordertot,null)
        var guest = File("Guest Reciept.txt")
        if(guest.exists()){
            guest.writeText("")
            rest.recieptfull(guest)
            guest.appendText("Date -- Time:$date_time\n\n")
            guest.appendText("Item x Quantity = Amount\n")
            for(i in order.itemslist.indices) {
                guest.appendText("${order.itemslist[i]} x ${order.qtylist[i]} = Rs.${order.itemtotlist[i]}\n")
            }
            GuestNew.paybill(order.ordertot,customer.name,guest)
        }
        else{
            guest.createNewFile()
            guest.writeText("")
            rest.recieptfull(guest)
            guest.appendText("Date -- Time:$date_time\n\n")
            guest.appendText("Item x Quantity = Amount\n")
            for(i in order.itemslist.indices) {
                guest.appendText("${order.itemslist[i]} x ${order.qtylist[i]} = Rs.${order.itemtotlist[i]}\n")
            }
            GuestNew.paybill(order.ordertot,customer.name,guest)
        }
    }
    println()
    println("---------------------------------------------------------------")
    println()
    rest.exitMessage()
}