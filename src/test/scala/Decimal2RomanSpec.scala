package com.jm2dev.kata.bddkata

import org.scalatest.{GivenWhenThen, FunSpec}
import org.scalatest.matchers.ShouldMatchers
import org.scalatest.prop.TableDrivenPropertyChecks

class Decimal2RomanSpec extends FunSpec with GivenWhenThen with ShouldMatchers with TableDrivenPropertyChecks {
  val numbers =
    Table(
      ("decimal", "roman"),
      (1, "I"),
      (2, "II"),
      (3, "III")
    )

  describe("Convert decimal numbers to roman numerals") {
    forAll (numbers) { (decimal: Int, roman: String) =>
      Given("a decimal number equal to %s".format(decimal))
      When("the roman numeral is generated")
      val romanNumeral = DecimalNumber(decimal).toRoman
      Then("roman numeral should be %s".format(roman))
      romanNumeral should be (roman)

      DecimalNumber(decimal).toRoman should be (roman)
    }
  }
}

case class DecimalNumber(val value: Int) {
  def toRoman = value match {
    case 1 => "I"
    case 2 => "II"
    case 3 => "III"
    case _ => "Not a number"
  }
}
