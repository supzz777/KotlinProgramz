import java.util.*

/**********************************************************************************************
 * Author  --> Supriya P Kengar\
 * Description --> Factors of a number
 * Date --> 26/02/2020

 **********************************************************************************************/
fun main(args :Array<String>) {

println("enter a number you want to find prime factor of")

    val reader = Scanner(System.`in`)
    var num= reader.nextInt()

    for(i in 2.. num )
    {
            while(num % i == 0)
            {

                print( "$i , ")
                num = num / i
            }

    }
}