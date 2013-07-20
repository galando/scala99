import main.scala.Solutions1To10
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner


/**
 * Created with IntelliJ IDEA.
 * User: galando
 * Date: 7/20/13
 * Time: 5:58 PM
 * To change this template use File | Settings | File Templates.
 */
  class Tests1To10 extends FunSuite {
    test("P01 -- last element of list") {
      assert(Solutions1To10.last(List(1,2,3)) == 3)
      assert(Solutions1To10.last(List('x')) == 'x')
      assert(Solutions1To10.last(List(1, 1, 2, 3, 5, 8)) == 8)
    }

 /*   test("P02 -- penultimate element of list") {
      assert(penultimate(List(1, 1, 2, 3, 5, 8)) == 5)
    }

    test("P03 -- nth element of list") {
      assert(nth(0, List(1, 1, 2, 3, 5, 8)) == 1)
      assert(nth(1, List(1, 1, 2, 3, 5, 8)) == 1)
      assert(nth(2, List(1, 1, 2, 3, 5, 8)) == 2)
    }

    test("P04 -- length of a list") {
      assert(length(List(1, 1, 2, 3, 5, 8)) == 6)
    }

    test("P05 -- reverse a list") {
      assert(reverse(List(1, 1, 2, 3, 5, 8)).equals(List(8, 5, 3, 2, 1, 1)))
    }

    test("P06 -- isPalindrome ") {
      assert(isPalindrome(List(1, 2, 3, 2, 1)) == true)
      assert(isPalindrome(List(1, 2, 3, 2, 2)) == false)
      assert(isPalindrome(List(1, 2, 2, 1)) == true)
      assert(isPalindrome(List(1, 2, 1, 1)) == false)
    }

    test("P07 -- recursive flatten"){
      assert(flatten(List(List(1, 1), 2, List(3, List(5, 8)))) == List(1, 1, 2, 3, 5, 8))
    }

    test("P08 -- compress"){
      assert(compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) == List('a, 'b, 'c, 'a, 'd, 'e))
    }

    test("P09 -- pack"){
      assert(pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) == List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e)))
    }

    test("P10 -- encode"){
      assert(encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) == List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e)))
    }*/
}
