package codechef

object TurboSort {

  def main(args: Array[String]) {
    val t = readInt()
    (1 to t).map(x => readInt()).sortBy(x => x)
  }
}