// Copyright (C) 2011-2012 the original author or authors.
// See the LICENCE.txt file distributed with this work for additional
// information regarding copyright ownership.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
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
