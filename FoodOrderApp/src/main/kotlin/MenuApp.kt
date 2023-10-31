import java.util.*

public class Menu {
    val ns_id = intArrayOf(101, 102, 103)
    val n_starter = arrayOf("Chicken 65", "Apollo Fish", "Butter Garlic Prawns")
    val ns_price = intArrayOf(200, 400, 350)
    val vs_id = intArrayOf(201, 202, 203)
    val v_starter = arrayOf("Paneer Tikka", "Creamy Mushroom Masala", "Potato Fingers")
    val vs_price = intArrayOf(150, 300, 140)
    val drinks_id = intArrayOf(301, 302, 303)
    val drinks = arrayOf("Fruit Punch", "Gimlet", "Water")
    val drinks_price = intArrayOf(110, 200, 20)

    fun display() {
        println("MENU CATEGORIES: \n 1. Non-Vegetarian \n 2. Vegetarian \n 3. Drinks \nPlease enter the number corresponding to the menu you wish to be displayed:  ")
        var flag: Boolean = true;
        while (flag) {
            var menuType: Int = Integer.valueOf(readln())
            if (menuType == 1) {
                println("NON-VEGETARIAN MENU:")
                for (i in n_starter.indices) {
                    println("Item ${ns_id[i]} : ${n_starter[i]}  Price: Rs.${ns_price[i]}")
                }
            } else if (menuType == 2) {
                println("VEGETARIAN MENU:")
                for (i in v_starter.indices) {
                    println("Item ${vs_id[i]} : ${v_starter[i]}  Price: Rs.${vs_price[i]}")
                }
            } else if (menuType == 3) {
                println("DRINKS MENU:")
                for (i in drinks.indices) {
                    println("Item ${drinks_id[i]} : ${drinks[i]}  Price: Rs.${drinks_price[i]}")
                }
            } else if (menuType == 4) {
                println("MENU EXITED")
                break
            } else {
                println("Please enter a valid number")
            }
            println()
            var wait = sc.next()
            println("If you wish to see the menu again or exit, please choose a category: \nACTIONS: \n 1. Open Non-Vegetarian Menu \n 2. Open Vegetarian Menu \n 3. Open Drinks Menu \n 4. Exit Menu \nPlease enter the number corresponding to the action to be performed:  ")
        }
    }
}










