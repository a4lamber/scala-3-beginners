package com.rockthejvm.part1basics

object ValuesAndTypes {
  // type inference: determine
  val meaningOfLife: Int = 42

  // type inference, just like type hinting in python. Compiler interprets it
  val anInteger = 67

  // primitive types
  val aBoolean: Boolean = true
  val aByte: Byte = 1;// byte
  val aShort: Short = 5263 // 2 bytes
  val anInt: Int = 1 //4 bytes
  val aLong: Long = 2312414242424L //8 bytes
  val aFloat: Float = 2.4f // 4 bytes
  val aDouble: Double = 3.14 // 8 bytes
  val aChar: Char = 'a'
  // new type
  val aString: String = "Scala"

  def main(args: Array[String]): Unit = {
  }
}
