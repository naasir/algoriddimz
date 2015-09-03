package org.naasir.algoriddimz

/** Encodes and decodes a string representing a numerical value from one base to another.
  *
  * Example (conversion):
  * (input) input: "1010", baseFrom: 2, baseTo: 10
  * (output) "10"
  */
object BaseEncoder {

  /** The default character set to use for encoding/decoding. */
  val ALPHABET = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz"

  /** Converts the input string encoded in one base to another.
    *
    * @note the character set for encoding is defined above and limited to max base of 62
    *
    * @param input the input string
    * @param baseFrom the base of the input string
    * @param baseTo the base to convert to
    * @return the converted string
    */
  def convert(input: String, baseFrom: Int, baseTo: Int): String = {
    val sb = new StringBuilder()
    var decoded = toBase10(input, baseFrom)
    while (decoded > 0) {
      val r = decoded % baseTo
      sb.append(ALPHABET.charAt(r))
      decoded /= baseTo
    }
    sb.reverse.toString
  }

  /** Decodes the encoded input string to base 10.
    *
    * @note the character set for decoding is defined above and limited to max base of 62
    *
    * @param input the input string to decode
    * @param baseFrom the base of the input string
    * @return the base 10 integer value of the original string.
    */
  def toBase10(input: String, baseFrom: Int): Int = {
    var result = 0
    for (i <- 0 until input.size) {
      val x = ALPHABET.indexOf(input.charAt(i))
      result *= baseFrom
      result += x
    }
    result
  }
}
