import java.util.*

/**********************************************************************************************
 * Author  --> Supriya P Kengar\
 * Description --> Anagram
 * Date --> 26/02/2020

 **********************************************************************************************/
fun main(args :Array<String>) {

    var sc = Scanner(System.`in`)

    /*
        println("enter the number to check the pallindromes")
        var number = sc.nextInt()
        pallindromeNo(number)
    */


    println("enter the String to check the pallindromes")
    var string = sc.next()
    pallindromeString(string)



}

// function to check if the enetered number is pallindrome or not

fun pallindromeNo( number:Int){


    var revNumber = 0

   var temp :Int = number

    var useNumber = number


        while (useNumber != 0)
        {
            var rem = useNumber % 10
            revNumber = revNumber * 10 + rem
            useNumber = useNumber/10


        }

        if (revNumber != temp)

            println("the entered number is not Pallindrome")
        else
            println("the entered number is  a  Pallindrome")




}

// function to check if the enetered string is pallindrome or not

fun pallindromeString (string :String){


   if( reverseStr(string) == string)

        println("the String is a pallindrome")
       else
        println("the String is not a pallindrome")


}

//function to reverse the letters of a word

fun reverseStr(str: String): String{

    if(str.isEmpty())
        return str

    return reverseStr(str.substring(1)) + str[0]


    /*working of reverseStr(str.substring(1)) + str[0]
    *
    *   reverse("tart") + "S"
    *   (reverse("art") + "t") + "S"
    *   ((reverse("rt") + "a") + "t") + "S"
    *   (((reverse("t") + "r") + "a") + "t") + "S"
    *   ((((reverse("") + "t") + "r") + "a") + "t") + "S"
    * */
}
