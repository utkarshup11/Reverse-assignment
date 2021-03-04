package com.knoldus

import scala.collection.immutable.List
import scala.io.StdIn._

object ReverseApi {
  def main(args: Array[String]): Unit = {


    println("Enter four elements to the List ")
    val inputList = List.fill(4) {
      readLine()
    }


    //creating object of reverseImpl class
    val reverse = new ReverseImpl()

    println("After Reversing the inputList")
    println(reverse.reverseList(inputList))


    println("Enter a string to reverse ")
    val inputString = readLine()
    println("After reversing the String ")
    println(reverse.reverseString(inputString))

  }

}
