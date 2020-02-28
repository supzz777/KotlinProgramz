package Iterators

// Break statements

// Continue Statements

// Return Statements

fun main(args :Array<String>) {

 //=====================================================================================================//
 // break statement breaks only the nearer loop

  /*
    for ( i in 1.. 3)
    {
            for ( j in 1 .. 3)
            {
                println("$i , $j")
                if(i==2 && j == 2 )
                    break  //this breaks only j loop and not the i loop
            }
    }

   */
        /*  output of this code--->
          * 1 , 1
            1 , 2
            1 , 3
            2 , 1
            2 , 2
            3 , 1
            3 , 2
            3 , 3
          */


  //Ex 2-->       // specify name for the outer loop and then apply break to break the whole loop

    /*
             supzzloop@    for (  a in 1.. 3)
             {
                    kumzloop@ for (b in 1..3){

                                for ( c in 1..2)
                                {

                                    if(c==b){

                                        println(" $a , $b , $c")
                                        break@kumzloop

                                    }
                                    if (b==a)

                                        break@supzzloop
                                }

                    }

            }

     */

    //===============================================================================================//

        //Continue statement is used to skip 1 or 2 values

    for ( x in 1..10)
    {
        if (x == 5)
        {
            continue
        }

        if (x == 9)
        {
            continue
        }


        print("$x ,")

        /*output of this -->
        *  1 ,2 ,3 ,4 ,6 ,7 ,8 ,10   // 5 and 9 are skipped
        * */

    }

}