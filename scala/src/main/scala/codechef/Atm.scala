package codechef

/**
 * http://www.codechef.com/problems/HS08TEST
 */
object Atm {
  def main(args: Array[String]) {
    val input = readLine.split(" ")
    val w = input(0).toInt
    val b = input(1).toFloat
    val t = b - w - 0.50
    println(if ((w % 5 == 0) && t >= 0) "%.2f".format(t) else b)
  }
}