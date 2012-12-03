package com.jm2dev.kata.bddkata

case class DecimalNumber(val value: Int) {
  def toRoman = value match {
    case 1 => "I"
    case 2 => "II"
    case 3 => "III"
    case _ => "Not a number"
  }
}
