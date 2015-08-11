package org.naasir.algoriddimz

/** Problem: Given an array A of integers,
  * return an array of product such that the product at each index,
  * is the product of of every integer in A EXCEPT the integer at that index.
  *
  * Input: array A of n integers
  * Output: array B of products

  * Example:
  * (input)  [1, 7, 3, 4]
  * (output) [7*3*4, 1*3*4, 1*7*4, 1*7*3] = [84, 12, 28, 21]
  */
object ProductCalculator {

  /** Calculates the products using the brute force method.
    * Complexity: O(n^2)
    * Space: O(n)
    */
  def bruteForce(a: Array[Int]): Array[Int] = {
    val results = new Array[Int](a.size)

    for (i <- 0 until a.size) {
      var product = 1
      for (j <- 0 until a.size) {
        if (i != j) product *= a(j)
      }
      results(i) = product
    }

    results
  }

  /** Calculates the products using the greedy method.
    * Complexity: O(n)
    * Space: O(n)
    */
  def greedy(a: Array[Int]): Array[Int] = {
    // observation: products of all except at index =
    // array of products BEFORE index multiplied with array of products AFTER index
    val results = new Array[Int](a.size)

    // run through the list forward
    // to compute products before index
    // and store those in the results array
    var productSoFar = 1
    for (i <- 0 until a.size) {
      results(i) = productSoFar
      productSoFar *= a(i)
    }

    // run through the list again but in reverse
    // to compute products after index
    // and multiply with cached products before index
    productSoFar = 1
    for (i <- a.size - 1 to 0 by -1) {
      results(i) = results(i) * productSoFar
      productSoFar *= a(i)
    }

    results
  }
}
