package org.naasir.algoriddimz

/** Problem: Write a function to get the nth Fibonacci number.
  * The first two Fibonacci numbers are 0 and 1.
  * The nth number is always the sum of the previous two -- the sequence begins 0, 1, 1, 2, 3, 5.
  *
  * Input: the index at which to retrive the fibonacci number
  * Output: the value of the fibonacci number

  * Example:
  * (input)  4
  * (output) 3
  *
  * (input) 10
  * (output) 55
  */
object Fibonacci {

  /** Calculates the nth fibonacci number using a local tail recursive function.
    * Complexity: O(n)
    * Space: O(1)
    */
  def tailRecursive(n: Int): Int = {
    @annotation.tailrec
    def fibIter(prev: Int, current: Int, n: Int): Int = {
      if (n == 0) current
      else fibIter(current, prev + current, n - 1)
    }

    if (n > 1) fibIter(1, 1, n - 2)
    else n
  }

  /** Calculates the nth fibonacci number recursively.
    * Complexity: O(2^n)
    * Space: O(n)
    */
  def recursive(n: Int): Int = {
    if (n > 1) recursive(n - 1) + recursive(n - 2)
    else n
  }

  /** Calculates the nth fibonacci number iteratively.
    * Complexity: O(n)
    * Space: O(1)
    */
  def iterative(n: Int): Int = {
    if (n <= 1) return n;

    var i = 2;
    var prev = 1;
    var current = 1;
    while (i < n) {
      val next = prev + current;
      prev = current;
      current = next;
      i += 1;
    }

    current;
  }
}
