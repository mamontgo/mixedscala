package com.monty.scala

/**
 *
 * Some demonstration functions using the type of "Int"
 * This is
 *
 */
object IntFunctions {

  /**
   * This fold function requires a list of ints as a parameter, and a function
   * that takes two Int parameters and and returns an Int " f: (Int, Int) => Int "
   *
   * data = the int list to be folded
   * f = the function used to fold the list data
   * init = the initial default value to be folded for the list
   */
  def fold[Int](data: List[Int], f: (Int, Int) => Int, init: Int): Int =
    if (!data.isEmpty) {
      fold(data.tail, f, f(data.head, init))
    } else init;

  /**
   * Map for integer.
   * This is going to take a list of integers (data) and apply a function to each of the list elements
   */
  def map[Int](data: List[Int], f: (Int => Int)): List[Int] =
    if (!data.isEmpty) f(data.head) :: map(data.tail, f)
    else List[Int]();

}