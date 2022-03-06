fun main() {

    var numbers = listOf(2, 3, 4, 5)

    println(numbers + 10)

    println(numbers + "newItem")


    var x = Product("a", "2", 4.4)

    var x1 = BankAccount(20.0, "2345")
    x1.accountID = "7890"

    var ali = a("Ali")
    println("$ali" + ali.name)

    println("======================")
    Programmer("JANA", "AlSalem", 24, "232322").doWork()
    Designer("JANA", "AlSalem", 24, "232322").doWork()
    Tester("JANA", "AlSalem", 24, "232322").doWork()
    Emp("JANA", "AlSalem", 24, "232322")

// object
    Print.printFirstName()
    Print.printLastName()
    println(Print.major)

    // companion object
   Manger.accMangerA

}

class Product {
    var name: String = ""
    var category: String = ""

    constructor(name: String, category: String, price: Double)
    constructor(name: String, category: String, price: Double, quantity: Int)
}

class BankAccount(var currentBalance: Double, var accountID: String) {
    init {
        println(" Thank u ")
    }

    fun withdraw(withdrawNeed: Double): Double {
        if (withdrawNeed < currentBalance)
            return currentBalance - withdrawNeed
        else
            return 0.0
    }

    fun deposit(deposit: Double): Double {
        return currentBalance + deposit
    }
}

class a(var name: String) {

}

open class Emp(
    var firstName: String,
    var lastName: String,
    var age: Int,
    var id: String
) {

    open fun doWork() {
    }
}

interface Person {

    open fun doWork() {
    }
}

class Programmer(firstName: String, lastName: String, age: Int, id: String) : Emp(firstName, lastName, age, id),
    Person {

    override fun doWork() {
        println(" I'm a Programmer")
    }
}

class Designer(firstName: String, lastName: String, age: Int, id: String) : Emp(firstName, lastName, age, id) {

    override fun doWork() {
        println(" I'm a Designer")
    }

}

class Tester(firstName: String, lastName: String, age: Int, id: String) : Emp(firstName, lastName, age, id) {

    override fun doWork() {
        println(" I'm a Tester")
    }

}

object Print {
    val major = "android dev"
    fun printFirstName() {
        println("JANA")
    }

    fun printLastName() {
        println("AlSalem")
    }
}

class Manger {

    companion object acc {
        val accMangerA = true
        val accMangerB = true
    }

}