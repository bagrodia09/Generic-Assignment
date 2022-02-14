package com.knoldus.scala

class GenericStack[A](var stack: List[A]) extends Stack[A] {
  override def push(element: A): List[A] = {
    stack = element +: stack
    stack
  }

  override def pop: A =
    stack match {
      case List() => throw new Exception("Can't fetch.Stack is empty")
      case _ =>
        val popElem = stack.head
        stack = stack.tail
        popElem
    }

  override def top: A = if (stack.isEmpty) throw new Exception("Stack is empty") else stack.head

  override def isEmpty: Boolean =
    if (stack == List()) true else false
}