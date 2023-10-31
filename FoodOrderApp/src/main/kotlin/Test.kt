import java.io.File

fun main(){

    var order= Order()
    order.takeorder()
    var b = File("Test.txt")
    b.createNewFile()
    for(i in order.itemslist.indices){
       b.appendText(" ${order.itemslist[i]} x ${order.qtylist[i]} = Rs.${order.itemtotlist[i]}\n")
        b.appendText("\n")
    }

    }

