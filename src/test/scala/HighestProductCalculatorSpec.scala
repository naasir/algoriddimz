package org.naasir.algoriddimz.test

import org.naasir.algoriddimz.HighestProductCalculator

class HighestProductCalculatorSpec extends UnitSpec {

  /** Shared tests to run for all variations of the calculate method. */
  def calculateBehavior(calculate: Array[Int] => Long) = {

    it should "return 0 when array is empty" in {
      val integers = Array[Int]()
      assert(calculate(integers) === 0)
    }

    it should "return 6 when array is [1, 2, 3]" in {
      val integers = Array[Int](1,2,3)
      assert(calculate(integers) === 6)
    }

    it should "return 6000 when array is [1, -200, -3, 10]" in {
      val integers = Array[Int](1,-200,-3,10)
      assert(calculate(integers) === 6000)
    }

    it should "return 5000 when array is [1, 10, -5, 1, -100]" in {
      val integers = Array[Int](1,10,-5,1,-100)
      assert(calculate(integers) === 5000)
    }
  }

  "Calculate method (brute-force)" should behave like calculateBehavior(HighestProductCalculator.bruteForce)

  "Calculate method (greedy)" should behave like calculateBehavior(HighestProductCalculator.greedy)
}
