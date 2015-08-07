package org.naasir.algoriddimz

/** The bootstrapper for the app */
object Boot extends App {

  // [Coursera Algo-008: Problemset 1]
  // Counts the number of inversions from a file of 100K numbers
  val filename = "coursera-algo008-problemset1.txt"
  val stream = getClass.getClassLoader.getResourceAsStream(filename)
  val lines = scala.io.Source.fromInputStream(stream).getLines
  val nums = lines.map(line => line.toInt).toArray
  val inversions = InversionCounter.count(nums)
  println(s"size: ${nums.size}, inversions: $inversions")
}
