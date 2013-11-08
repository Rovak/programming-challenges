object Main {
  def main(args: Array[String]) {
    Iterator.continually(readLine()).takeWhile(_.toInt != 42).foreach(println(_))
  }
}