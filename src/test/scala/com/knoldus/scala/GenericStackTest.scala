package com.knoldus.scala

import org.scalatest.flatspec.AnyFlatSpec

class GenericStackTest extends AnyFlatSpec {
  val nonEmptyStack = new GenericStack[Int](List(17, 1, 16, 3))
  val emptyStack = new GenericStack[Nothing](List())

  "A Condition" should "give false if stack is not Empty" in {
    assert(nonEmptyStack.isEmpty == false)
  }
  "A Condition" should "Push an element in the stack" in {
    assert(List(52, 17, 1, 16, 3) == nonEmptyStack.push(52))
  }
  "A Condition" should "give top element from the stack" in {
    nonEmptyStack.push(14)
    nonEmptyStack.push(8)
    assert(nonEmptyStack.top == 8)
  }
  "A Condition" should "Pop an element from the stack" in {
    nonEmptyStack.push(22)
    nonEmptyStack.push(66)
    assert(nonEmptyStack.pop == 66)
  }
  "A Condition" should "give true if stack is Empty" in {
    assert(emptyStack.isEmpty == true)
  }
  "A condition" should "throw an exception when we pop an element from an empty list" in {
    val error = "Can't fetch.Stack is empty"
    val thrown = intercept[Exception] {
      emptyStack.pop
    }
    assert(thrown.getMessage == error)
  }
  "A condition" should "throw an exception when we try to find top element from an empty list" in {
    val error = "Stack is empty"
    val thrown = intercept[Exception] {
      emptyStack.top
    }
    assert(thrown.getMessage == error)
  }
}
