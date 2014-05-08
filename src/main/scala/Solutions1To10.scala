package main.scala

import java.util.NoSuchElementException
import scala.annotation.tailrec


/**
 * Created with IntelliJ IDEA.
 * User: galando
 * Date: 7/20/13
 * Time: 5:25 PM
 * To change this template use File | Settings | File Templates.
 */
object Solutions1To10 {

  // P01
  @tailrec
  def last[T](list: List[T]): T = list match {
    case x :: Nil => x
    case _ :: xs => last(xs)
    case _ => throw new NoSuchElementException()
  }

  // P02
  @tailrec
  def penultimate[T](list: List[T]): T = list match {
    case x :: _ :: Nil => x
    case _ :: xs => penultimate(xs)
    case _ => throw new NoSuchElementException()
  }

  // P03
  @tailrec
  def nth[T](n: Int, list: List[T]): T = (n, list) match {
    case (0, x :: _) => x
    case (_, _ :: Nil) => throw new NoSuchElementException()
    case (n, _ :: xs) => nth(n - 1, xs)
    case (_, _) => throw new NoSuchElementException()
  }

  // P04
  def length[T](list: List[T]): Int = list match {
    case Nil => 0
    case _ :: xs => length(xs) + 1
  }

  // P05
  def reverse[T](list: List[T]): List[T] = list match {
    case Nil => Nil
    case x :: xs => reverse(xs) ::: List(x)
  }

  // P06
  @tailrec
  def isPalindrome[T](list: List[T]) : Boolean = list match {
    case x::Nil => true
    case x::xs => if (x == last(xs)) isPalindrome(reverse(xs).tail) else false
    case Nil => true
      // other solution => list == list.reverse
  }

  // P07
  def flatten(list: List[_]) : List[_] = list flatMap {
    case xs: List[_] => flatten(xs)
    case x => List(x)
  }

  // P08
  def compress[T](list: List[T]) : List[T] = list match {
    case Nil => Nil
    case x :: xs => x :: compress(xs.dropWhile(_ == x))
  }
}
