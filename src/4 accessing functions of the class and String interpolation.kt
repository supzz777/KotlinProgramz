

fun main() {

    var name = "supzz"


    //creating the object of the Student Class
    var studentObj = Student() //here no new keyword is used for creating the objects.



     studentObj.display(name);

    studentObj.fathername = " P J Kengar"
    studentObj.mothername = " Sunita P Kengar"
    println("the name of Students father is"   +studentObj.fathername)
                    //(OR)
    println("the name of Students father is ${studentObj}");

//   println(" the object is  ${studentObj.moth}")

/* String interpolation ===>  $ character to interpolate a variable and ${} to interpolate an expression.
 Kotlin string formatting is more powerful than basic interpolation. */


    var s = 10;
    var g = 7;
     print("the su of $s and $g is ${s+g}")
}


class Student{

 var fathername :String = ""
 var mothername :String = ""

 fun display(namezz: String ){
     println(namezz)
 }

    override fun toString(): String {
        return "Student(fathername='$fathername', mothername='$mothername')"
    }


}