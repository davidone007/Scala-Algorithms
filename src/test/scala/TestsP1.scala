import org.scalatest.flatspec._
import org.scalatest.matchers.should.Matchers
import  scala.*

/**
 * This class contains unit tests for the BinarySearch function.
 */
class TestsP1 extends AnyFlatSpec with Matchers {

  /**
   * Test to check if binary search returns the correct indices for elements found in the sequence.
   */
  "BinarySearch" should "find numbers in a sorted list" in {
    //Binary.searchIndexTrigger()
    val sequence = List(5, 1, 5, 8, 12, 13)
    val keys = List(5, 8, 1, 23, 1, 11)
    val expectedIndices = List(2, 0, -1, 0, -1)
    val actualIndices = Binary.searchIndexTrigger(sequence, keys)
    actualIndices shouldEqual expectedIndices
  }

  /**
   * Test to check if binary search returns -1 for elements that are not present in the sequence.
   */
  it should "returns -1 for elements that are not present in the sequence" in{
    val sequence = List(5, 1, 5, 8, 12, 13)
    val keys = List(1, 7)
    val expectedIndices = List(-1)
    val actualIndices = Binary.searchIndexTrigger(sequence, keys)
    actualIndices shouldEqual expectedIndices
  }

  /**
   * Test to check if binary search returns the correct indices for multiple elements found in the sequence.
   */
  it should "returns the correct indices for multiple elements found in the sequence" in{
    val sequence = List(5, 1, 5, 8, 12, 13)
    val keys = List(3, 5, 12, 1)
    val expectedIndices = List(1, 3, 0)
    val actualIndices = Binary.searchIndexTrigger(sequence, keys)
    actualIndices shouldEqual expectedIndices
  }

  /**
   * Test to check if binary search returns -1 for an empty sequence.
   */
  it should "returns -1 for an empty sequence" in{
    val sequence = List(0)
    val keys = List(3, 5, 12, 1)
    val expectedIndices = List(-1, -1, -1)
    val actualIndices = Binary.searchIndexTrigger(sequence, keys)
    actualIndices shouldEqual expectedIndices
  }

  /**
   * Test to check if binary search returns -1 for a key that is greater than all elements in the sequence.
   */
  it should "returns -1 for a key that is greater than all elements in the sequence" in{
    val sequence = List(5, 1, 3, 5, 7, 9)
    val keys = List(1, 10)
    val expectedIndices = List(-1)
    val actualIndices = Binary.searchIndexTrigger(sequence, keys)
    actualIndices shouldEqual expectedIndices
  }
}
