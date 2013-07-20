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

  @tailrec
  def last[T](list: List[T]): T = list match {
    case x :: Nil => x
    case _ :: xs => last(xs)
    case _ => throw new NoSuchElementException()
  }

  @tailrec
  def penultimate[T](list: List[T]): T = list match {
    case x :: _ :: Nil => x
    case _ :: xs => penultimate(xs)
    case _ => throw new NoSuchElementException()
  }

  @tailrec
  def nth[T](n: Int, list: List[T]): T = (n, list) match {
    case (0, x :: _) => x
    case (_, _ :: Nil) => throw new NoSuchElementException()
    case (n, _ :: xs) => nth(n - 1, xs)
  }

  def length[T](list: List[T]): Int = list match {
    case Nil => 0
    case _ :: xs => length(xs) + 1
  }

  def reverse[T](list: List[T]): List[T] = list match {
    case Nil => Nil
    case x :: xs => reverse(xs) ::: List(x)
  }
}
