package org.mct.scala

import org.scalatest.{FlatSpec, Matchers}

class EasyProblemsSpec extends FlatSpec with Matchers {

  "P01: last(List(1, 1, 2, 3, 5, 8))" should "return 8" in {
    EasyProblems.last(List(1, 1, 2, 3, 5, 8)) shouldBe 8
  }

  "P02: penultimate(List(1, 1, 2, 3, 5, 8))" should "return 5" in {
    EasyProblems.penultimate(List(1, 1, 2, 3, 5, 8)) shouldBe 5
  }

  "P03: nth(2, List(1, 1, 2, 3, 5, 8))" should "return 2" in {
    EasyProblems.nth(2, List(1, 1, 2, 3, 5, 8)) shouldBe 2
  }

  "P04: length(List(1, 1, 2, 3, 5, 8))" should "return 6" in {
    EasyProblems.length(List(1, 1, 2, 3, 5, 8)) shouldBe 6
  }

  "P05: reverse(List(1, 1, 2, 3, 5, 8))" should "return List(8, 5, 3, 2, 1, 1)" in {
    EasyProblems.reverse(List(1, 1, 2, 3, 5, 8)) shouldBe List(8, 5, 3, 2, 1, 1)
  }

}
