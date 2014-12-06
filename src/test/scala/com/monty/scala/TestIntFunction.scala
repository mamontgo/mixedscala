package com.monty.scala

object TestIntFunction extends App {
  
  def add = (x:Int, y:Int) => x + y;
  
  println("Add Function : " + add);
  
  val mylist = List.range(0, 100, 2)
  println("My List : " + mylist)
  
  val result:Int = IntFunctions.fold(mylist, add, 0);
  println("My Result : "+ result);
  
}


object TestIntMapFunction extends App {
  
  def add = (x:Int, y:Int) => x + y;
  
  println("Add Function : " + add);
  
  val mylist = List.range(0, 20, 2)
  println("My List : " + mylist)
  
  var add5 = add(5, _:Int)
  val result = IntFunctions.map(mylist, add5);
  println("My Result : "+ result);
  
  
  println(IntFunctions.map(mylist, add(3, _:Int)))
  
  
}