package com.monty.scala
/**
 * Demonstration scala functions
 * 
 */
object Util {

  def fold[T, U](data: List[T], f: (T, U) => U, init: U): U =
    if (!data.isEmpty) {
      fold(data.tail, f, f(data.head, init))
    } else init;

  def map[T, U](data: List[T], f: (T => U)): List[U] =
    if (!data.isEmpty) f(data.head) :: map(data.tail, f)
    else List[U]();
    

}