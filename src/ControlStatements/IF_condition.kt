package ControlStatements

fun main() {

    val a = 5;
    val b = 8;

    var maxValue:Int

    if (a > b)
        maxValue= a
    else
        maxValue = b

    println(maxValue)

    //=======================================//
    //IF as expression

    var minValue: Int = if  (a<b)
                            a
                        else
                            b

    print(minValue)



}