package com.scala.basics

object ArithmeticOperations extends App{
 
	  
    var a = 30; 
    var b = 10; 
    var c = 50; 
    var d = 50; 
    println("a + b = " + (a + b)); 
    println("a - b = " + (a - b)); 
    println("a * b = " + (a * b)); 
    println("b / a = " + (b / a)); 
    println("b % a = " + (b % a));
    println("c % a = " + (c % a));
	  
	 	  
	  c += a ; 
	  println("c += a = " + c );
	 
	  c -= a ; 
	  println("c -= a = " + c ); 
	  
	  c *= a ; 
	  println("c *= a = " + c );
	  
	  c = 15; c /= a ; 
	  println("c /= a = " + c ); 
	  
	
}