import java.util.*

/**********************************************************************************************
 * Author  --> Supriya P Kengar\
 * Description --> Leap Year
 * Date --> 26/02/2020

 **********************************************************************************************/
fun main(args:Array<String>) {

    println("enter a year")

    val reader = Scanner(System.`in`)
    var year= reader.nextInt()

   var len = year.toString().length
    println(len)

    if(len == 4) {

        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            println("the entered year is a leap year")
        } else {
            println("the entered year is not a leap year")
        }
    }
    else{
        println("please enter a proper year again")
        year= reader.nextInt()


    }

}


