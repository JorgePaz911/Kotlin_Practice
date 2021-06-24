

class Employee2(var fName: String, private var lName: String) {

    fun fullName(){
        println("$fName $lName")
    }

}

fun main(){
    var emp = Employee2("Jorge", "Paz")
    emp.fullName()
    emp.fName = "Jimmy"
    emp.fullName()
}