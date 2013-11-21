package codechef

object LifeTheUniverseAndEverything {
  def main(args: Array[String]) {
    Iterator.continually(readInt()).takeWhile(_ != 42).foreach(println(_))
  }
}