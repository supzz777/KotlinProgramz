
/**********************************************************************************************
 * Author  --> Supriya P Kengar\
 * Description --> User Input and Replace String Template “Hello <<UserName>>, How are you?”
 * Date --> 26/02/2020

**********************************************************************************************/

fun main(args: Array<String>) {

    println("enter your name here")
    val username = readLine()

    if (username != null)
    {
        if(username.length >= 3) {
            println("Hii ${username} , How Are You? ")
        }
        else
        {
            println("please enter the name properly")
        }
    }

}