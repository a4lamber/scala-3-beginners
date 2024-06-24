package com.rockthejvm.part1basics

object Functions {
  // string is one and only one expression
  def aFunction(a: String, b:Int): String = {
    a + " " + b
  }
  // function invocation
  aFunction("scala",1000)

  // no arg function
  def aNoArgFunction(): Int = 45
  def anotherNoArgFunction: Int = 45;

  // functions can be recursive
  def stringConcatenation(str : String, n: Int): String = {
    if (n == 0) ""
    else if (n == 1) str
    else str + stringConcatenation(str,n-1)
  }
  /*
  exercises:
    1. greeting function (name, age) => "My name is $name and i am *age years old"
    2. factorial
    3. fib
    4. a function isPrime
  */
  def greeting(name:String, age: Int): String = {
    s"My name is $name and i am $age years old"
  }

  def factorial(n:Int): Int = {
    if (n == 0 || n == 1) 1
    else n * factorial(n-1)
  }

  def fib(n:Int): Int = {
    if (n == 1 || n == 2) 1
    else fib(n-1) + fib(n-2)
  }
  def main(args: Array[String]): Unit = {
    println(greeting("adam",5))
    println(factorial(1))
    println(fib(1))
    println(fib(2))
    println(fib(3))
    println(fib(4))
  }
}
