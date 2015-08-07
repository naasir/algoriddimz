package org.naasir.algoriddimz.test

import org.scalatest._

/** Base spec class for unit tests. */
abstract class UnitSpec extends FlatSpec
    with Matchers
    with OptionValues
    with Inside
