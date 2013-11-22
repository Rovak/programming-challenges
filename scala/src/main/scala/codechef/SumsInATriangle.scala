package codechef

object SumsInATriangle {

  def main(args: Array[String]) {

    // Retrieve all lines
    //val numbers = Iterator.continually(readLine()).toList
    var numbers = """2
3
1
2 1
1 2 3
4
1
1 2
4 1 2
2 3 1 1""".split("\n").toList

    // Total number of tests
    val tests = numbers.head.toInt
    numbers = numbers.drop(1)
    (1 to tests).foreach { t =>
      var memo = Map[Int, List[Int]]()
      val treeSize = numbers.head.toInt
      val tree = numbers.tail.take(treeSize).reverse
      memo += 0 -> tree.head.split(" ").map(_.toInt).toList
      tree.tail.zipWithIndex.foreach { case (lvl, i) =>
        val prev = memo(i)
        val current = i + 1
        memo += current -> lvl.split(" ").zipWithIndex.map { case (item, itemIndex) =>
          val a = prev(itemIndex)
          val b = prev(itemIndex + 1)
          item.toInt + (if (a > b) a else b)
        }.toList
      }

      println(memo(treeSize - 1).head)

      numbers = numbers.tail.drop(treeSize)
    }
  }
}