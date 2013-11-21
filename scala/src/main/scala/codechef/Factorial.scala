package codechef

import scala.annotation.tailrec

object Factorial {

  def main(args: Array[String]) {
    val n = readInt()
    (1 to n).foreach { _ => {
        val number = readInt()
        @tailrec
        def go(acc: Int, factor: Int): Int = if (number / factor == 0) acc else go(acc + number / factor, factor * 5)
        println(go(0, 5))
      }
    }
  }
}