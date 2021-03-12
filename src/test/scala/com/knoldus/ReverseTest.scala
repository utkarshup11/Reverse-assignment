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


import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class ReverseTest extends AnyFlatSpec with Matchers {

  val reverseImpl = new ReverseImpl

  "A reverse of list " should "return correctly after reversing reverse  " in {
    assert(reverseImpl.reverseList(List(1, 2, 3)) == List(3, 2, 1))
  }

  "Reverse of empty list" should "return empty list " in {
    assert(reverseImpl.reverseList(List()) == List())
  }

  "Reverse of list having different data type values  " should "return reverse of list correctly   " in {
    assert(reverseImpl.reverseList(List(1, "Hello", 3)) == List(3, "Hello", 1))
  }


  // scalastyle:off magic.number



  // negative test case for reverseList method
  "Reverse of list   " should "not be incorrect  " in {
    assert(reverseImpl.reverseList(List("32", 43, "44")) != List(43, "44", "32"))
  }


  "reverse of empty string " should "return empty string " in {
    assert(reverseImpl.reverseString("") == "")
  }


  "reverse of a string " should "return reverse value " in {
    assert(reverseImpl.reverseString("Hello") == "olleH")
  }

  // negative test case for reverseString method
  "reverse of a string " should "not incorrect " in {
    assert(reverseImpl.reverseString("Hello") != "Olleh")
  }


}
