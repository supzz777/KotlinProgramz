import java.util.*

/**********************************************************************************************
 * Author  --> Supriya P Kengar\
 * Description --> BubbleSort
 * Date --> 26/02/2020

 **********************************************************************************************/
fun main(args :Array<String>) {

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


    print("the array elements after bubble sort are : -->")
     bubbleSort(arraySize,array)

}

fun bubbleSort(arraySize :Int , array: IntArray){

    for(i in 0 until arraySize){
        for (j in i+1 until arraySize)
        {
            if(array[j] > array[i]){
                var temp = array[j]
                array[j] = array[i]
                array[i] = temp
            }
        }

    }


    for (i in 0 .. arraySize-1)
    {
        print(" ${array[i]} , ")
    }

}
