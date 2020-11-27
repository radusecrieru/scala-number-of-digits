package com.digits

import org.scalatest._
import flatspec._
import matchers._
import com.digits.NumberOfDigits._

class NumberOfDigitsSpec extends AnyFlatSpec with should.Matchers {

  "Number of digits" should "get the correct number of digits for an integer" in {
    calculateNumberOfDigits(100) should be (3)
  }

  it should "get the correct number of digits for a negative integer" in {
    calculateNumberOfDigits(-100) should be (3)
  }

  it should "get the correct number of digits for a long" in {
    calculateNumberOfDigits(1234567890123456789L) should be (19)
  }

  it should "get the correct number of digits for a negative long" in {
    calculateNumberOfDigits(-1234567890123456789L) should be (19)
  }

  it should "get the correct number of digits for a double" in {
    calculateNumberOfDigits(1123.36) should be (4)
  }

  it should "get the correct number of digits for a negative double" in {
    calculateNumberOfDigits(-22345.978) should be (5)
  }

  it should "get the correct number of digits for a BigDecimal" in {
    calculateNumberOfDigits(BigDecimal("123456789012345678901234567890.567")) should be (30)
  }

  it should "get the correct number of digits for a negative BigDecimal" in {
    calculateNumberOfDigits(BigDecimal("-1234567890123456789012.913513")) should be (22)
  }

  it should "return 1 for the number 0" in {
    calculateNumberOfDigits(0) should be (1)
  }
}
