object Binary extends App{

  import scala.annotation.tailrec

  /**
   * Perform a binary search to find the index of a target key in a sorted list.
   *
   * @param list    The sorted list to search in.
   * @param target The target to search for.
   * @param left   The left index of the current search range.
   * @param right  The right index of the current search range.
   * @return The index of the target key in the list, or -1 if not found.
   */
  @tailrec
  private def binarySearch(list: List[Int], target: Int, left: Int, right: Int): Int =
    list match
      case Nil => -1
      case h::t =>
        if (left > right)
          -1
        else
          val mid = left + (right - left) / 2
          val midValue = list(mid)
          if (midValue == target)
            mid
          else if (midValue < target)
            binarySearch(list, target, mid + 1, right)
          else
            binarySearch(list, target, left, mid - 1)

  /**
   * Search for the indexes of keys from list 'b' in list 'a'.
   *
   * @param a      The list in which to search for indices.
   * @param b      The list of keys to search for in list 'a'.
   * @param result The list of indexes found so far (initially empty).
   * @return A list containing the indexes of keys from list 'b' in list 'a'.
   */
  @tailrec
  private def searchIndex(a: List[Int], b: List[Int], result: List[Int] = Nil): List[Int] =
    b match
      case Nil => result
      case head :: tail =>
        val n = a.head // Number of elements in "a"
        val aElements = a.tail // Extract the elements in "a"
        val key = head //Key to search in "a"
        val keyIndex = binarySearch(aElements, key, 0, n - 1)
        searchIndex(a, tail, result ::: List(keyIndex))

  /**
   * Search for the indexes of keys from list 'b' in list 'a'.
   *
   * @param a The list in which to search for indices.
   * @param b The list of keys to search for in list 'a'.
   * @return A list containing the indexes of keys from list 'b' in list 'a'.
   */
  def searchIndexTrigger(a: List[Int], b: List[Int]): List[Int] =
    searchIndex(a, b.tail, Nil)
}