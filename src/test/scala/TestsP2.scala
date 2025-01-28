import org.scalatest.flatspec._
import org.scalatest.matchers.should.Matchers
import  scala.*

/**
 * This class contains unit tests for the MajorityElement function.
 */
class TestsP2 extends AnyFlatSpec with Matchers {
  //Majority.majorityElement()
  /**
   * Test to check if the MajorityElement function returns 1 for a sequence with a majority element.
   */
  "Majority" should "returns 1 for a sequence with a majority element" in{
    val n = 5
    val sequence = List(2, 3, 9, 2, 2)
    val result = Majority.majorityElement(n, sequence)
    result shouldEqual 1
  }

  /**
   * Test to check if the MajorityElement function returns 0 for a sequence without a majority element.
   */
  it should "returns 0 for a sequence without a majority element" in{
    val n = 4
    val sequence = List(1, 2, 3, 4)
    val result = Majority.majorityElement(n, sequence)
    result shouldEqual 0
  }

  /**
   * Test to check if the MajorityElement function returns 1 for a sequence with a majority element (repeated).
   */
  it should "returns 1 for a sequence with a majority element (repeated)" in{
    val n = 4
    val sequence = List(1, 2, 3, 1)
    val result = Majority.majorityElement(n, sequence)
    result shouldEqual 0
  }

  /**
   * Test to check if the MajorityElement function returns 0 for a sequence with a single element.
   */
  it should "returns 0 for a sequence with a single element" in{
    val n = 1
    val sequence = List(5)
    val result = Majority.majorityElement(n, sequence)
    result shouldEqual 1
  }

  /**
   * Test to check if the MajorityElement function returns 1 for a large sequence with a majority element.
   */
  it should "returns 1 for a large sequence with a majority element" in{
    val n = 10
    val sequence = List(1, 2, 3, 4, 4, 4, 4, 4, 5, 6)
    val result = Majority.majorityElement(n, sequence)
    result shouldEqual 0
  }
}
