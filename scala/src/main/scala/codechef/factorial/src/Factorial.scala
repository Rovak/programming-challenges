package codechef

/**
The most important part of a GSM network is so called
Base Transceiver Station (BTS). These transceivers form the
areas called cells (this term gave the name to the cellular phone)
and every phone connects to the BTS with the strongest signal (in
a little simplified view). Of course, BTSes need some attention and
technicians need to check their function periodically.



The technicians faced a very interesting problem recently. Given a set of
BTSes to visit, they needed to find the shortest path to visit all of the
given points and return back to the central company building. Programmers
have spent several months studying this problem but with no results. They
were unable to find the solution fast enough. After a long time, one of the
programmers found this problem in a conference article. Unfortunately, he
found that the problem is so called "Traveling Salesman Problem" and it is
very hard to solve. If we have N BTSes to be visited, we can visit them in
any order, giving us N! possibilities to examine. The function expressing
that number is called factorial and can be computed as a product
 */
object Factorial {
  def main(args: Array[String]) {
    Iterator.continually(readLine()).takeWhile(_.toInt != 42).foreach(println(_))
  }
}