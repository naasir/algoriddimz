package org.naasir.algoriddimz.test

import org.naasir.algoriddimz.Fibonacci

class FibonacciSpec extends UnitSpec {

  /** Shared tests to run for all variations of the fibonacci function. */
  def fibonacci(calculate: Int => Int) = {

    it should "return 0 when input is 0" in {
      assert(calculate(4) === 3)
    }

    it should "return 1 when input is 1" in {
      assert(calculate(4) === 3)
    }

    it should "return 3 when input is 4" in {
      assert(calculate(4) === 3)
    }

    it should "return 55 when input is 10" in {
      assert(calculate(10) === 55)
    }

    it should "return 267914296 when input is 42" in {
      assert(calculate(42) === 267914296)
    }
  }

  "nth-Fibonacci method (iterative)" should behave like fibonacci(Fibonacci.iterative)
  "nth-Fibonacci method (recursive)" should behave like fibonacci(Fibonacci.recursive)
  "nth-Fibonacci method (tail-recursive)" should behave like fibonacci(Fibonacci.tailRecursive)
}
