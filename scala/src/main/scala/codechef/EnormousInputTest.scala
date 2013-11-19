package codechef

object EnormousInputTest {
  def main(args: Array[String]) {
    val input = readLine.split(" ")
    val n = input(0).toInt
    val k = input(1).toInt
    println((1 to n).count(x => readInt % k == 0))
  }
}