package org.naasir.algoriddimz.test

import org.naasir.algoriddimz.BaseEncoder

class BaseEncoderSpec extends UnitSpec {

  "toBase10 method" should "return 10 when input is '1010' in base 2" in {
    val output = BaseEncoder.toBase10("1010", 2)
    assert(output == 10)
  }

  it should "return 167 when input is 'A7' in base 16" in {
    val output = BaseEncoder.toBase10("A7", 16)
    assert(output == 167)
  }

  "convert method" should "return '10' when converting from base 2 to 10 for '1010'" in {
    val output = BaseEncoder.convert("1010", 2, 10)
    assert(output == "10")
  }

  it should "return '18' when converting from base 2 to 32 for '101000'" in {
    val output = BaseEncoder.convert("101000", 2, 32)
    assert(output == "18")
  }
}
