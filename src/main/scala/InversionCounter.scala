package org.naasir.algoriddimz

/** Counts the number of inversions in an array of integers.
  * Inversions are pairs (i,j) of array indices
  * such that i < j and A[i] > A[j]
  */
object InversionCounter {

  /** Counts the number of inversions in an array of integers.
    *
    * @param a the array of integers
    * @return the number of inversions
    */
  def count(a: IndexedSeq[Int]): Long = {
    sortAndCountInv(a)._2
  }

  /** Sorts and counts the number of inversions in an array of integers.
    *
    * @param a the array of integers
    * @return a tuple of the sorted array and the number of inversions
    */
  private def sortAndCountInv(unsorted: IndexedSeq[Int]): (IndexedSeq[Int], Long) = {
    if (unsorted.size <= 1) (unsorted, 0)
    else {
      val (left, right) = unsorted.splitAt(unsorted.size / 2)
      val (sortedLeft, countLeft) = sortAndCountInv(left)
      val (sortedRight, countRight)  = sortAndCountInv(right)
      val (merged, countSplit) = mergeAndCountSplitInv(sortedLeft, sortedRight)

      (merged, countLeft + countRight + countSplit)
    }
  }

  /** Merges two arrays and counts the number of split inversions within them.
    *
    * @param left the left array
    * @param right the right array
    * @return a tuple of the sorted, merged array and the number of split inversions
    */
  private def mergeAndCountSplitInv(left: IndexedSeq[Int], right: IndexedSeq[Int]): (IndexedSeq[Int], Long) = {
    val size = left.size + right.size
    val merged = new Array[Int](size)

    var i = 0
    var j = 0
    var inversions = 0L

    for (k <- 0 until size) {
      if (j == right.size || (i < left.size && left(i) < right(j))) {
        merged(k) = left(i)
        i += 1
      }
      else {
        merged(k) = right(j)
        j += 1

        // increment split inversion count by number of items left in left array
        if (i < left.size) inversions += (left.size - i)
      }
    }

    (merged, inversions)
  }
}
