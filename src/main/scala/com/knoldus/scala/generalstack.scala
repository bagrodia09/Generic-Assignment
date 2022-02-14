package com.knoldus.scala

trait Stack[A] {
  def push(element: A): List[A]
  def top(): A
  def pop(): A
  def isEmpty: Boolean
}


