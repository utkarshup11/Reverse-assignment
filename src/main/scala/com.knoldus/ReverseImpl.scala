package com.knoldus

import scala.collection.immutable.List


// a class to implement reverse of a list and String using Tail recursion method
class ReverseImpl {

  //this method is for reversing  a list of elements
  def reverseList[R](list: List[R]): List[R] = {
    list match {
      case Nil => list
      case firstElement :: remainingList => reverseList(remainingList) ::: List(firstElement)
      // operator ::: simply concatenate  two list
    }
  }


    //this method is for reversing String
  def reverseString(inputString: String): String =
    inputString match {
      case "" => ""
      case _ => reverseString(inputString.tail) + inputString.head
    }
}
