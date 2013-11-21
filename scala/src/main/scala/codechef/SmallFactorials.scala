package codechef

object SmallFactorials {
  def z(n:BigInt) : BigInt = {
    (n until 0 by -1).foldLeft(BigInt(1))((result, current) => result * current)
  }
  def main(args: Array[String]) {
    (readInt() until 1 by -1).foreach(x => z(readInt()))
  }
}