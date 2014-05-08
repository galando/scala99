import java.util.NoSuchElementException
import main.scala.Solutions1To10
import org.scalatest.matchers.ShouldMatchers
import org.scalatest.{Matchers, FlatSpec, FunSuite}
import org.scalatest.junit.JUnitRunner


/**
 * Created with IntelliJ IDEA.
 * User: galando
 * Date: 7/20/13
 * Time: 5:58 PM
 * To change this template use File | Settings | File Templates.
 */
class Tests1To10 extends FlatSpec with Matchers {
  "P01" should "returns last element of list" in {
    Solutions1To10.last(List(1, 2, 3)) should equal(3)
    Solutions1To10.last(List('x')) should equal('x')
    Solutions1To10.last(List(1, 1, 2, 3, 5, 8)) should equal(8)
  }

  "P02" should "penultimate element of list" in {
    Solutions1To10.penultimate(List(1, 1, 2, 3, 5, 8)) should equal(5)
  }

  "P03" should "nth element of list" in {
    Solutions1To10.nth(0, List(1, 1, 2, 3, 5, 8)) should equal(1)
    Solutions1To10.nth(1, List(1, 1, 2, 3, 5, 8)) should equal(1)
    Solutions1To10.nth(2, List(1, 1, 2, 3, 5, 8)) should equal(2)
  }
  it should "throw NoSuchElementException if n > num of elements in list" in {
    evaluating {
      Solutions1To10.nth(2, List(1, 1))
    } should produce[NoSuchElementException]
  }

  "P04" should "length of a list" in {
    Solutions1To10.length(List(1, 1, 2, 3, 5, 8)) should equal(6)
  }

  "P05" should "reverse a list" in {
    Solutions1To10.reverse(List(1, 1, 2, 3, 5, 8)) should equal(List(8, 5, 3, 2, 1, 1))
  }

  "P06" should "isPalindrome" in {
    Solutions1To10.isPalindrome(List(1, 2, 3, 2, 1)) should equal (true)
    Solutions1To10.isPalindrome(List(1, 2, 3, 2, 2)) should equal (false)
    Solutions1To10.isPalindrome(List(1, 2, 2, 1)) should equal (true)
    Solutions1To10.isPalindrome(List(1, 2, 1, 1)) should equal (false)
  }

  "P07" should "recursive flatten" in {
    Solutions1To10.flatten(List(List(1, 1), 2, List(3, List(5, 8)))) should equal (List(1, 1, 2, 3, 5, 8))
  }

  "P08" should "compress" in {
    Solutions1To10.compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) == List('a, 'b, 'c, 'a, 'd, 'e)
  }

  /*test("P09 -- pack") {
    assert(pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) == List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e)))
  }

  test("P10 -- encode") {
    assert(encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) == List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e)))
  } */
}
