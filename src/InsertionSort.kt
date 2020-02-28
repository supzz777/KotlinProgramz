import java.util.*

fun main(args :Array<String>) {

    var sc = Scanner(System.`in`)
    println("enter the size of the array")
    var size = sc.nextInt()

    var array = IntArray(size)

    println("enter the array elements one by one")
    for (i in 0 until size) {
        array[i] = sc.nextInt();

    }
    println("the array elements are: -->")

    for (i in 0 until size) {
        println(array[i])
    }


    println("the array elements after insertion sort are : -->")
    insertionSort(size, array)
}

fun insertionSort(size: Int, array: IntArray) {

    //insertion sort started

    for(i in 1 until size){

        var index = i
        var value = array[i]

        while (index >0 && array[index-1] >value){

            array[index]= array[index-1]
            index = index -1

        }
        array[index] = value
    }

    for (i in 0 until size){
        print("${array[i]} ,")
    }



}
