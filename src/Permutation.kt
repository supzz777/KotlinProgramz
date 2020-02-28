import java.util.*

/**********************************************************************************************
 * Author  --> Supriya P Kengar\
 * Description --> PERMUTATIONS
 * Date --> 26/02/2020

 **********************************************************************************************/
fun main(args :Array<String>) {

    var sc = Scanner(System.`in`)

    println("enter the string of your choice")
    var string = sc.next()





    println("permutations of the $string are")

    permute(string , 0 , string.length)

    println("the total possible combinations are $count")

}

fun swap (string :String ,x:Int , y:Int) : String {



    var charArray =string.toCharArray()

    var temp = charArray[x]
    charArray[x] = charArray[y]
    charArray[y] = temp

    return charArray.joinToString (separator = "" )
    return string

}
var count =0

fun permute(string :String , i:Int , n:Int ): String {

    var word = string



     if(i == n )
     {
            println(string)
              count++

     }
    else{

             for (j in i until n ){

                 word = swap(word , i ,j)
                 permute(word, i+1, n)
                 count++


                 word = swap(word , i ,j)



             }
     }


    return string



}