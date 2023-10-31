import java.util.*

var sc = Scanner(System.`in`).useDelimiter("\n")
open class Customer  {
    var name: String? = null
    var c_id: String? = null
    var address: String? = null
    var phone_no =0
    var email_id: String? = null
    var location: String? = null
    fun getPh() {
        println("Enter your phone number:")
        this.phone_no = sc.nextInt()
    }
    fun getData() {
        println("Please provide the following details:")
        println("Enter your Customer ID:")
        this.c_id = sc.next()
        println("Enter your name:")
        this.name = sc.next()
        println("Enter your Email ID:")
        this.email_id = sc.next()
        println("Enter your Address:")
        this.address = sc.next()
        println("Enter your location:")
        this.location = sc.next()
        println()
    }

    fun display() {
        println("Customer Details: ")
        println("Phone Number: $phone_no")
        println("Customer ID: $c_id")
        println("Name: $name")
        println("Email ID: $email_id")
        println("Address: $address")
        println("Location: $location")
        println()
        //println("Confirm if the above details are true (Y/N): ")
    }
    fun premium( id : String, name:String, address:String, emailID :String, location:String){
        this.c_id = id
        this.name = name
        this.address = address
        this.email_id = emailID
        this.location = location
        println("Welcome, Premium Member\nHere are your Details: ")
        println("Phone Number: ${this.phone_no}")
        println("Customer ID: ${this.c_id}")
        println("Name: ${this.name}")
        println("Email ID: ${this.email_id}")
        println("Address: ${this.address}")
        println("Location: ${this.location}")
        println()
    }
    fun regular( id : String, name:String, address:String, emailID :String, location:String){
        this.c_id = id
        this.name = name
        this.address = address
        this.email_id = emailID
        this.location = location
        println("Welcome, Regular Member\nHere are your Details: ")
        println("Phone Number: ${this.phone_no}")
        println("Customer ID: ${this.c_id}")
        println("Name: ${this.name}")
        println("Email ID: ${this.email_id}")
        println("Address: ${this.address}")
        println("Location: ${this.location}")
        println()
    }
}