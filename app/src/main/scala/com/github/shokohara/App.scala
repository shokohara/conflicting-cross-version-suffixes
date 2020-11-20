package com.github.shokohara

object App {
  def main(args: Array[String]): Unit = {
    println(Core.checkEq(Cat.Lion, Cat.Tiger))
    Cat.values.foreach(println)
  }
}
