import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.*


open class Order(){
    var sc = Scanner(System.`in`)
    var menuO = Menu()
    var itemID = 0
    var quantity = 0
    var additem = 1
    var ordertot = 0
    var price = 0
    var items : String? = null
    var itemtot:Int = 0
    var itemslist = mutableListOf<String>()
    var qtylist = mutableListOf<Int>()
    var itempricelist = mutableListOf<Int>()
    var itemtotlist = mutableListOf<Int>()
    fun takeorder(){
        var flag: Boolean = true;
        println()
        println("ORDER: \nWelcome. Please place your order here:")
        do{
            if(additem==1){
                println("Please enter Item ID: ")
                this.itemID = sc.nextInt()
                if(this.itemID !in 101..103 && this.itemID !in 201..203 && this.itemID !in 301..303){
                    throw ItemIDException("Invalid Item ID. Item ID entered is not present in the menu.")
                }
                println("Please enter quantity: ")
                this.quantity = sc.nextInt()

                if(itemID/100==1){
                    price = menuO.ns_price[menuO.ns_id.indexOf(itemID)]
                    this.ordertot+=(quantity*price)
                   println("You have ordered: ${menuO.n_starter[menuO.ns_id.indexOf(itemID)]} x $quantity")
                    items = menuO.n_starter[menuO.ns_id.indexOf(itemID)]
                    itemtot= quantity*price
                }
                else if (itemID/100==2){
                    price = menuO.vs_price[menuO.vs_id.indexOf(this.itemID)]
                    this.ordertot += (quantity * price)
                    println("You have ordered: ${menuO.v_starter[menuO.vs_id.indexOf(itemID)]} x $quantity")
                    items = menuO.v_starter[menuO.vs_id.indexOf(itemID)]
                    itemtot= quantity*price
                }
                else if (itemID/100==3){
                    price = menuO.drinks_price[menuO.drinks_id.indexOf(itemID)]
                    this.ordertot += (quantity * price)
                    println("You have ordered: ${menuO.drinks[menuO.drinks_id.indexOf(itemID)]} x $quantity")
                    items = menuO.drinks[menuO.drinks_id.indexOf(itemID)]
                    itemtot= quantity*price
                }
                items?.let { itemslist.add(it) }
                itempricelist.add(price)
                qtylist.add(quantity)
                itemtotlist.add(price*quantity)
            }
            else if (additem==2){
                println()
                val current = LocalDateTime.now()
                val formatter = DateTimeFormatter.ofPattern("dd-MM-yyy -- HH:mm:ss")
                val date_time = current.format(formatter)
                println("Date and Time: $date_time")
                println("Order taken successfully \nYour bill will be generated soon")
                break
            }
            println()
            println("1 - Add item\n2 - Finish ordering\nPlease enter the number corresponding to the action: ")
            additem = sc.nextInt()

        }while (flag)


    }


}