package com.jm2dev.kata.bddkata

import org.scalatest.FunSpec

class Decimal2RomanSpec extends FunSpec {
  describe("Decimal to Roman numbers transformer") {
   it("transforms 1 to I") {
     val decimal = 1
     val expected = "I"
     val actual = new Decimal2Roman(decimal).transform
     assert(actual == expected)
   }
  }
}

class Decimal2Roman(val decimal: Int) {
  def transform: String = "I"
}
