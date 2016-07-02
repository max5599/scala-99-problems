package org.mct.scala

object EasyProblems {

  def last[T](list: List[T]): T = list.last
  def penultimate[T](list: List[T]): T = list.init.last
  def nth[T](index : Int, list: List[T]):T = list(index)
  def length(list: List[Int]) = list.length
}
