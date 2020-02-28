package kotlinFunctions

fun main(args:Array<String>) {

    var a = 3
    var b = 5;

    var largeval =largeValue(a,b)

    println("the largest no between $a and $b is ${largeval}")

    var maxval = maxNum(a,b)
    println("the largest no between $a and $b is ${maxval}")

}

fun largeValue(a:Int , b:Int) :Int{

    if(a>b)
        return a
    else
        return b
}

//====================================================================================//

// function as expression ==> used in reducing the code...

fun maxNum (a:Int , b :Int):Int =if(a>b) {a} else {b}




