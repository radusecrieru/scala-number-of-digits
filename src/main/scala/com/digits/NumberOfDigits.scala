package com.digits

import java.text.DecimalFormat

object NumberOfDigits {
  //replaces the minus and everything after the decimal point with an empty string
//  def calculateNumberOfDigits(input: Number) : Int = input.toString.replace("-", "").replaceFirst("\\..*", "").length

  val format = new DecimalFormat("#") //Trims the decimal point
  format.setNegativePrefix("") //sets the negative sign to an empty string

  def calculateNumberOfDigits(input: Number) : Int = format.format(input).length
}
