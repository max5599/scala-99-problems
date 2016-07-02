package org.mct.scala

import org.scalatest.{FlatSpec, Matchers}

class WorkingWithListsSpec extends FlatSpec with Matchers {

  "P01: last(List(1, 1, 2, 3, 5, 8))" should "return 8" in {
    WorkingWithLists.last(List(1, 1, 2, 3, 5, 8)) shouldBe 8
  }

  "P02: penultimate(List(1, 1, 2, 3, 5, 8))" should "return 5" in {
    WorkingWithLists.penultimate(List(1, 1, 2, 3, 5, 8)) shouldBe 5
  }

  "P03: nth(2, List(1, 1, 2, 3, 5, 8))" should "return 2" in {
    WorkingWithLists.nth(2, List(1, 1, 2, 3, 5, 8)) shouldBe 2
  }

  "P04: length(List(1, 1, 2, 3, 5, 8))" should "return 6" in {
    WorkingWithLists.length(List(1, 1, 2, 3, 5, 8)) shouldBe 6
  }

  "P05: reverse(List(1, 1, 2, 3, 5, 8))" should "return List(8, 5, 3, 2, 1, 1)" in {
    WorkingWithLists.reverse(List(1, 1, 2, 3, 5, 8)) shouldBe List(8, 5, 3, 2, 1, 1)
  }

  "P06: isPalindrome(List(1, 2, 3, 2, 1))" should "return true" in {
    WorkingWithLists.isPalindrome(List(1, 2, 3, 2, 1)) shouldBe true
  }

}
