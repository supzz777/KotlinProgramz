import java.util.*

/**********************************************************************************************
 * Author  --> Supriya P Kengar\
 * Description --> Binarysearch
 * Date --> 26/02/2020

 **********************************************************************************************/
fun main(args: Array<String>) {
    println("enter the size of the array")
    val sc = Scanner(System.`in`)
    var arraySize = sc.nextInt()


    var array = IntArray(arraySize) //same as in java--> int arr = new int[size];

    println("enter the array elements one by one")
    for (i in 0 until arraySize ) {
        array[i] = sc.nextInt();

    }
    println("the array elements are: -->")

    for (i in 0 until arraySize) {
        println(array[i])
    }


    print("enter the number from array you want to search for : -->")
   var numSearch = sc.nextInt()

    //provide sorted array ......
    binarySearch(arraySize , array ,numSearch)

}

fun binarySearch(arraySize :Int , array: IntArray ,numSearch :Int) {

    var start= 0;
    var end = arraySize -1
    var middle :Int =start+end /2

   while (start <= end)
   {


       if (numSearch == array[middle])
       {
           println("the $numSearch is found at $middle")
           break
       }
       else if (numSearch < array[middle]){

           end  = middle -1

       }
       else{
           start = middle +1
       }

       middle = start+end /2


       if (start > end)
       {
           println("number not found")
       }

     }





}