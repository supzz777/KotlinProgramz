import java.lang.System.*
import java.util.*
import kotlin.io.readLine as readLine
import kotlin.random.Random

/**********************************************************************************************
 * Author  --> Supriya P Kengar\
 * Description --> Flip Coin and print percentage of Heads and Tails
 * Date --> 26/02/2020

 **********************************************************************************************/
fun main(args :Array<String>) {

    var headCount :Float =0.0f
    var tailCount :Float =0.0f
    var totalCount :Float =0.0f

    var choice:Int
    val reader = Scanner(System.`in`)

    var tailPercent:Float
    var headPercent :Float



    do{
        print("enter 1 to continue and 0 to exit")
         choice= reader.nextInt()
        if(choice == 1){
            var random = Math.random();
            println(random)

            if(random > 0.5)
            {
                headCount++
                totalCount++
                println("the count of heads is ${headCount}")
            }
           else
            {
                tailCount++
                totalCount++
                println("the count of tails is ${tailCount}")
            }

        }
        else if (choice >1)
        {
            println("invalid choice please enter only 0 or 1")
            choice = reader.nextInt()
        }

    }while(choice !=0 )

     tailPercent = tailCount/totalCount*100
     headPercent = headCount/totalCount*100

    println("the total number of filps are ${totalCount}")
    println("the total number of tails are ${tailCount}")
    println("the total number of heads are ${headCount}")

    println(tailPercent)
    println(headPercent)




}