fun main() {

    var choice = 1



    while (choice != 0 ) {

        println("==================================================")
        println(
            "Select 1 to swap numbers WIT temp\n" +
                    "Or 2 to swap numbers WITHOUT temp\n" +
                    "0 EXit"
        )
        print("Your choice is:")
        choice = readLine()?.toInt()!!

        when (choice) {
            0 -> println("See You")
            1 -> swapWithTemp(getInput())
            2 -> swapWithoutTemp(getInput())
            else -> println("Your choice is not valid. Try again !!")

        }

    }


}

fun swapWithoutTemp(number: List<Int>) {


    var num1 = number.first()
    var num2 = number.last()

    num1 = num1 + num2
    num2 = num1 - num2
    num1 = num1 - num2

    println("The numbers after swap is : [ $num1 , $num2 ]")

}

fun swapWithTemp(number: List<Int>) {

    var num1 = number.first()
    var num2 = number.last()

    var temp = num1
    num1 = num2
    num2 = temp


    println("The numbers after swap is : [ $num1 , $num2 ]")
}

fun getInput(): List<Int> {

    var numbers = mutableListOf<Int>()

    print("Please Enter The First Number:")
    var numer = readLine()?.toInt()
    numbers.add(numer!!)

    print("Please Enter The Second Number:")
    numer = readLine()?.toInt()
    numbers.add(numer!!)

    println("The numbers before swap is : [ ${numbers.first()} , ${numbers.last()} ]")


    return numbers
}

