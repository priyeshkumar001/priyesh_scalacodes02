object factorial {

  def fac(n: Int): Int = {
    if (n == 1 || n == 0) {
      1
    } else {
      n * fac(n - 1)
    }
  }

  def main(args: Array[String]): Unit = {
    val n = 5
    println(s"Factorial of $n = ${fac(n)}")
  }
}