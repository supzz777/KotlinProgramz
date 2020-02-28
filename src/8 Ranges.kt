fun main() {


    //ranges
    val r1= 1..5 // this .. means it ranges from 1 to 5 i.e 1,2,3,4,5

    val r2 = 5 downTo 1 // this means it rangs in descending order i.e 5,4,3,2,1


    val r3 =5 downTo 1 step 2 //output ==> 5,3,1

    val r4 = 1 .. 5 step 2 //output ==> 1,3,5

    //===========================================/

    var r5 = "a" .. "z " //output ==> a,b,c,d,.....z
    //to check if "m" is present in r5 or not
    var isPresent = "m" in r5
    print(isPresent)  //this returns true i.e  "m" is pressent inside the r5 variable range

    //=========================================//

    var countDown = 10.downTo(1) //tis ranges from 10,9,8,....1

    var moveup = 1.rangeTo(10) //(same as 1.. 10)  // this ranges to 1,2,3,...10


}