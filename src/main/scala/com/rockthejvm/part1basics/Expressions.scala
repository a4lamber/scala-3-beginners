package com.rockthejvm.part1basics

object Expressions {
  // expression is evaluated and
  val meaningOfLife = 40 + 2
  // math expression: +, -, *, /
  val mathExpression = 10/5

  // comparision expression: <, <=, >, >=, == and !=
  val equalityTest = 1 == 2
  // boolean expression: !, ||, &&
  val nonEqualityTest = !equalityTest

  // instructions vs expression

  // ifs are expression (kinda like python)
  val aIfExpression = if (equalityTest) 1 else 2
  // code blocks {} is a expression
  val aCodeBlock = {
    // local values
    val localValue = 78

    // expressions

    // last expression = value of the block
    val anotherLocalValue = 100
    anotherLocalValue
  }
  /*
  exercises:
  without running the code, what do you think these values will print out?
   */
  // 1
  val someValue = {
    2 < 3
  }
  // 2
  val someOtherValue = {
    if (someValue) 200 else 99
    42
  }
  // 3
  val yetAnotherValue = println("Scala")

  def main(args: Array[String]): Unit = {
    println(aCodeBlock)
    println(equalityTest)
    println(someValue)
    println(someOtherValue)
    println(yetAnotherValue)
  }
}
