data class MembersData(val phno : Int, val id : String,val name:String,val address:String,val emailID :String,val location:String ){

    companion object{
        val pMembers = arrayListOf<MembersData>()
        val rMembers = arrayListOf<MembersData>()

    }

}
object Members {
    fun input(){
        //Add Premium Members here
        val p1 = MembersData(9111111, "p001", "Shashank", "Road No.1, Lotus Pond", "shashi@gmail.com", "Banjara Hills")
        val p2 = MembersData(9222222, "p002", "Gautam","Road no. 5, KBR Park", "gautam@gmail.com","Jubilee Hills")
        MembersData.pMembers.add(p1)
        MembersData.pMembers.add(p2)

        //Add Regular Members here
        val r1 = MembersData(9333333, "r001","Nithin", "Lansum Etania, KPHB", "nidin@gmail.com","Kukkatpally")
        val r2 = MembersData(9444444,"r002","Manas","Block C, Lanco Hills","menas@gmail.com","Khajaguda")
        MembersData.rMembers.add(r1)
        MembersData.rMembers.add(r2)
    }

}
fun main() {
}