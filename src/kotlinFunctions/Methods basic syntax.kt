package kotlinFunctions

fun main(args :Array<String>) {


    //function body

     // keyword funName  parameters returntype

    fun area(len:Int , breadth: Int) :Int{

        return len * breadth
    }

    // this function returns void // instead of void we use unit in kotlin.
    fun area1(len1 :Int , breadth1: Int) :Unit{

        println( " ${len1 * breadth1 }" )
    }


}