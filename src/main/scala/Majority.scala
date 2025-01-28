

/**
 * Object that contains a method to find the majority element in a list.
 */
object Majority {

  /**
   * This function says if there is a majority element in a list of integers, it returns 1 if it exists otherwise it returns 0
   *
   * A majority element is an element that appears more than half the number of times in the list.
   *
   * @param n The length of the list.
   * @param l The list to search for the majority element in.
   * @return The majority element in the list, or 0 if there is no majority element.
   */
  def majorityElement(n: Int, l: List[Int]): Int =
    /**
     * Recursively finds the majority element in a list.
     *
     * @param lTrigger The list to search for the majority element in.
     * @return The majority element in the list, or 0 if there is no majority element.
     */
    def majorityTrigger(lTrigger: List[Int]): Int = lTrigger match
      case Nil => 0
      case head :: Nil => head
      case head :: tail =>
        val (left, right) = lTrigger.splitAt(lTrigger.length / 2)
        val rightElementMajority = majorityTrigger(right)
        val leftElementMajority = majorityTrigger(left)


        if (rightElementMajority == leftElementMajority)
          leftElementMajority
        else
          val counterLeft = lTrigger.count(_ == leftElementMajority)
          val counterRight = lTrigger.count(_ == rightElementMajority)

          if (counterRight > lTrigger.length / 2) rightElementMajority
          else if (counterLeft > lTrigger.length / 2) leftElementMajority
          else 0


    val majorityElement = majorityTrigger(l)
    if (l.count(_ == majorityElement) > n / 2) 1 else 0
}
