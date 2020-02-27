import java.util.*

/**********************************************************************************************
 * Author  --> Supriya P Kengar\
 * Description --> Anagram
 * Date --> 26/02/2020

 **********************************************************************************************/
fun main(args :Array<String>) {
    var sc = Scanner(System .`in`)

    println("Enter the 1st string")
    var first= sc.next()
    var firstLen = first.length

    println("Enter the 2nd string")
    var second= sc.next()
    var secondLen = second.length

    anagram(first, firstLen ,second ,secondLen)

}

fun anagram(first :String , firstLen :Int ,second : String , secondLen : Int){

    var found =0
    var not_found = 0

    if(firstLen == secondLen){

        for (i in 0 until firstLen){

            for (j in 0 until  secondLen){

                if(first.get(i) == second.get(j)){
                    found =1
                    break
                }
            }

            if (found == 0){
                not_found =1
                break
            }
        }

        if (not_found == 1)
            println("entered strings are not Anangram")
        else
            println("entered strings are Anangram")


    }
    else{
        println("as entered string lengths are not same , they are not anagramzz")
    }

}