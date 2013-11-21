package codechef


object HolesInTheText {

  val one = List('A','D','O','P','R','Q')
  val two = List('B')

  def main(args: Array[String]) {
    val n = readInt()
    (1 to n).map { x =>
      readLine().foldLeft(0) { case (result, current) => current match {
          case y if one.contains(y) => result + 1
          case y if two.contains(y) => result + 2
          case y => result
        }
      }
    }.foreach(x => println(x))
  }
}