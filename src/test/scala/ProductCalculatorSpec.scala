package org.naasir.algoriddimz.test

import org.naasir.algoriddimz.ProductCalculator

class ProductCalculatorSpec extends UnitSpec {

  /** Shared tests to run for all variations of the calculate method. */
  def calculateBehavior(calculate: Array[Int] => Array[Int]) = {

    it should "return [] when array is empty" in {
      val integers = Array[Int]()
      assert(calculate(integers) === Array())
    }

    it should "return [1] when array has 1 item" in {
      val integers = Array[Int](7)
      assert(calculate(integers) === Array(1))
    }

    it should "return [84, 12, 28, 21] when array is [1, 7, 3, 4]" in {
      val integers = Array[Int](1,7,3,4)
      assert(calculate(integers) === Array(84,12,28,21))
    }
  }

  "Calculate method (brute-force)" should behave like calculateBehavior(ProductCalculator.bruteForce)

  "Calculate method (greedy)" should behave like calculateBehavior(ProductCalculator.greedy)
}
