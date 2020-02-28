package Iterators

fun main(args :Array<String>) {

    var i :Int = 0 //initalize first with some number before putting the condition...
    while (i <= 10)
    {
        if(i %2 ==0) {
            println(" ${i}")

        }
        i++
    }
}