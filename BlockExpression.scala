package com.scala.basics


object BlockExpression extends App{
  
  
      var myBlock = {val a=10;val b=20;b-a}
            
    println("Printing myBlock :: "+myBlock)
    
    val myBlock1 = {val a=10;val b=20;b-a;b+a}
    println("Printing myBlock1 :: "+myBlock1)
    
        var myBlock11 = {val a=10;val b=20;b+a;b-a;}
    println("Printing myBlock11 :: "+myBlock11)
    
    var myBlock2 = {val a=10;val b=20}  // (tuple)
    println("Printing myBlock1 :: "+myBlock2)
    
        var myBlock3 = {val a=10;val b=20;b}//20
    println("Printing myBlock1 :: "+myBlock3)
    
        var myBlock4 = {val a=10;val b=20;val res1 = b-a;val res2 = b+a;res1} //10
    println("Printing myBlock1 :: "+myBlock4)
    
    
    println("Printing myBlock3 :: "+ {val a=10;val b=20;b}) //20
    
}