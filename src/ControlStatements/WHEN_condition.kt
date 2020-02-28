package ControlStatements

fun main(args :Array<String>) {

    // here in kotlin switch case is replaced by when.
    //no need of break statemenet here in kotlin
    //default sattemenet of switch case is replaced with the else keyword here


    //WHEN as Exprression

    val x = 17 // (OR) val x=4 // (OR) val x=7 // (OR) val x=8

     when(x)
     {
         1 -> print("value of x is 1")
         2 -> print("value of x is 2 ")

         //you can combine multiple cases as well here in kotlin
         3,4 ,7,8 -> print("value of x is 3 or 4")
         !in 9..20 -> print("value is between 9 and 20 ")
         in 21..30 -> print("value is between 21 and 30 ")
         else -> {
             println("x not defined")
             println("value of x not found.")
         }

     }
    //==============================================//

    val a = 6 // (OR) val x=4 // (OR) val x=7 // (OR) val x=8
    var str :String

    when(a)
    {
        1 -> str = "a is 1"
        2 -> str = "a is 2"

        else -> str = "a is unknown"



    }
    println(str)

    //=================================================//

    val b = 6


    var str1 :String = when(b)
    {
        1 -> "b is 1"
        2 -> "b is 2"

        else ->"b is unknown"



    }
    println(str1)


}