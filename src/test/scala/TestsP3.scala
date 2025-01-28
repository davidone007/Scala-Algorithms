import org.scalatest.flatspec._
import org.scalatest.matchers.should.Matchers
import  scala.*
/**
 * This class contains unit tests for the CalculateSegmentCounts function.
 */
class TestsP3 extends AnyFlatSpec with Matchers {
  //Lottery.lottery()
  /**
   * Test to check if the CalculateSegmentCounts function returns the correct list of segment counts
   * for a set of segments and points.
   */
  "Lottery" should "returns the correct list of segment counts for a set of segments and points" in {
    val segments = List(2, 0, 5, 7, 10)
    val points1 = List(3, 1, 6, 11)
    val expected = List(1, 0, 0)
    val result1 = Lottery.lottery(segments, points1)
    result1 shouldEqual expected
  }
  it should "returns the correct list of segment counts for a set of segments and points (2)" in{
    val segments2 = List(1, -10, 10)
    val points2 = List(3, -100, 100, 0)
    val expected = List(0, 0, 1)
    val result2 = Lottery.lottery(segments2, points2)
    result2 shouldEqual expected
  }
  it should "returns the correct list of segment counts for a set of segments and points (3)" in{
    val segments3 = List(3, 0, 5, -3, 2, 7, 10)
    val points3 = List(2, 1, 6)
    val expected = List(2, 0)
    val result3 = Lottery.lottery(segments3, points3)
    result3 shouldEqual expected
  }
  it should "returns the correct list of segment counts for a set of segments and points (4)" in{
    val segments4 = List(3, 0, 0, 0, 0, 0, 0)
    val points4 = List(3, 0, 0, 0)
    val expected = List(3, 3, 3)
    val result4 = Lottery.lottery(segments4, points4)
    result4 shouldEqual expected
  }
  it should "returns the correct list of segment counts for a set of segments and points (5)" in{
    val segments5 = List(4, -10, 0, 0, 10, 5, 15, -5, 5)
    val points5 = List(4, -5, 0, 5, 10)
    val expected = List(2, 3, 3, 2)
    val result5 = Lottery.lottery(segments5, points5)
    result5 shouldEqual expected
  }
}
