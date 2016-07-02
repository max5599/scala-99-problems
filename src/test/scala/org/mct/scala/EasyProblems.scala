package org.mct.scala

object EasyProblems {

  def last[T](list: List[T]): T = list.last
  def penultimate[T](list: List[T]): T = list.init.last
  def nth[T](index : Int, list: List[T]):T = list(index)
  def length[T](list: List[T]) : Int = list.length
  def reverse[T](list: List[T]): List[T] = list.reverse
}