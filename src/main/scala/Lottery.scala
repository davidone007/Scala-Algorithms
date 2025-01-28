object Lottery {
  import scala.annotation.tailrec

  /**
   * Counts the number of occurrences of an integer within a list of integers.
   *
   * @param acc Accumulator for counting occurrences.
   * @param n   The integer to count.
   * @param l   The list of integers to search in.
   * @return The number of occurrences of `n` in the list `l`.
   */
  @tailrec
  private def countNumber(acc: Int, n: Int, l: List[Int]): Int =
    l match
      case Nil => acc
      case h :: t =>
        var left = h
        var right = t.head
        if (left <= n && n <= right) countNumber(acc + 1, n, l.tail.tail)
        else countNumber(acc, n, l.tail.tail)

  /**
   * Repeat the process of counting numbers for a list of integers and accumulate the results.
   *
   * @param r      The list of integers to search in.
   * @param n      The list of integers to count in the `r` list.
   * @param result The accumulator for the results.
   * @return A list containing the count of occurrences for each element in the `n` list.
   */
  @tailrec
  private def repeat(r: List[Int], n: List[Int], result: List[Int]): List[Int] =
    n match
      case Nil => result
      case h :: t =>
        val search = n.head
        val count = countNumber(0, search, r)
        repeat(r, n.tail, result ::: List(count))

  /**
   * Perform a lottery-like operation by counting occurrences of integers in two lists.
   *
   * @param r The first list of integers.
   * @param n The second list of integers to count occurrences for in the first list.
   * @return A list containing the count of occurrences for each element in the `n` list within the `r` list.
   */
  def lottery(r: List[Int], n: List[Int]): List[Int] =
    repeat(r.tail, n.tail, Nil)
}
