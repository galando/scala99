package main.scala


/**
 * Created with IntelliJ IDEA.
 * User: galando
 * Date: 7/20/13
 * Time: 5:25 PM
 * To change this template use File | Settings | File Templates.
 */
object Solutions1To10 {

  def last(list: List[Any]) : Any = list match {
    case List() => Nil
    case x::Nil => x
    case _::xs => last(xs)
  }

  def penultimate(list: List[Any]) : Any = list match {
    case List() => Nil
    case x::_::Nil => x
    case _::xs => penultimate(xs)
  }

  def main(args: Array[String]) = {
    println(Solutions1To10.penultimate(List(1, 1, 2, 3, 5, 8)))
  }
}
