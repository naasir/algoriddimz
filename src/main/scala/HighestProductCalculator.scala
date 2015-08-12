package org.naasir.algoriddimz

/** Problem: Given an array A of integers,
  * find the highest product you can get from 3 of the integers.
  *
  * Input: array A of n integers
  * Output: the highest product

  * Example:
  * (input)  [1, 7, 3, 4]
  * (output) 84
  *
  * Example:
  * (input)  [1, -100, 3, -5]
  * (output) 1500
  */
object HighestProductCalculator {

  /** Calculates the products using the brute force method.
    * Complexity: O(n^3)
    * Space: O(1)
    */
  def bruteForce(a: Array[Int]): Long = {
    var maxProduct = 0L

    for (i <- 0 until a.size) {
      for (j <- 0 until a.size) {
        for (k <- 0 until a.size) {
          if (i != j && i != k && j != k) {
            val product = a(i) * a(j) * a(k)
            maxProduct = Math.max(maxProduct, product)
          }
        }
      }
    }

    maxProduct
  }

  /** Calculates the products using the greedy method.
    * Complexity: O(n)
    * Space: O(1)
    */
  def greedy(a: Array[Int]): Long = {
    var highest = 0
    var secondHighest = 0
    var secondLowest = 0
    var lowest = 0
    var maxProduct = 0L

    for (i <- 0 until a.size) {
      val hihi = a(i) * highest * secondHighest
      val hilo = a(i) * highest * lowest
      val lolo = a(i) * lowest * secondLowest

      val newProduct = Math.max(Math.max(hihi, hilo), lolo)
      maxProduct = Math.max(maxProduct, newProduct)

      if (a(i) > highest) {
        secondHighest = highest
        highest = a(i)
      }
      else if (a(i) > secondHighest) {
        secondHighest = a(i)
      }
      else if (a(i) < lowest) {
        secondLowest = lowest
        lowest = a(i)
      }
      else if (a(i) < secondLowest) {
        secondLowest = a(i)
      }
    }

    maxProduct
  }
}
