import java.util.*

/**********************************************************************************************
 * Author  --> Supriya P Kengar\
 * Description --> Prime numbers display
 * Date --> 26/02/2020

 **********************************************************************************************/
fun main(args :Array<String>) {
    var sc = Scanner(System.`in`)
    println(" enter the number till which you want to show the prime numbers ")
    var limit = sc.nextInt()

    primeDisplay(limit)
}

fun primeDisplay(limit: Int){

    println("the prime numbers from 0 to $limit are ; -->")

    var primeCount =0

    for (i in 0 .. limit){

        var factorCount =0

        for (num in  i downTo 1 )
        {
            if (i % num == 0 ){
                factorCount++
            }
        }

        if (factorCount <= 2){
            print("$i ,")
            primeCount++
        }


    }
    println()

    println("the total prime numbers between 0 to $limit are $primeCount")
}