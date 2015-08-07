package org.naasir.algoriddimz.test

import org.naasir.algoriddimz.InversionCounter

class InversionCounterSpec extends UnitSpec {

  "Count method" should "return 0 when collection is empty" in {
    val collection = IndexedSeq.empty
    assert(InversionCounter.count(collection) == 0)
  }

  it should "return 0 when collection has 1 item" in {
    val collection = IndexedSeq(1)
    assert(InversionCounter.count(collection) == 0)
  }

  it should "return 0 when collection has n items sorted in ascending order" in {
    val collection = IndexedSeq(1, 2, 3, 4, 5, 6)
    assert(InversionCounter.count(collection) == 0)
  }

  it should "return n*(n-1)/2 when collection has n items sorted in descending order" in {
    val collection = IndexedSeq(6, 5, 4, 3, 2, 1)
    assert(InversionCounter.count(collection) == 15)
  }

  it should "return 3 when collection is [1,3,5,2,4,6]" in {
    val collection = IndexedSeq(1, 3, 5, 2, 4, 6)
    assert(InversionCounter.count(collection) == 3)
  }

  it should "return 3 when collection is [1,3,5,2,4,6,7] (odd size)" in {
    val collection = IndexedSeq(1, 3, 5, 2, 4, 6)
    assert(InversionCounter.count(collection) == 3)
  }
}
