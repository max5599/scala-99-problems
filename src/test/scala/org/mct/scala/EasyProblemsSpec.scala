package org.mct.scala

import org.scalatest.{FlatSpec, Matchers}

class EasyProblemsSpec extends FlatSpec with Matchers {

  "P01: last(List(1, 1, 2, 3, 5, 8))" should "return 8" in {
    EasyProblems.last(List(1, 1, 2, 3, 5, 8)) shouldBe 8
  }

}
