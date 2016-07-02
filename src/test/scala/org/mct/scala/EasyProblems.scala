package org.mct.scala

object EasyProblems {
  def last[T](list: List[T]): T = list.last

  def penultimate[T](list: List[T]): T = list.init.last

}
