import scala.io.StdIn
def even (a: Int): Boolean={
    a % 2 == 0
}
def main (agrs: Array[String]): Unit ={
    println("Enter a Number:")
    val a = StdIn.readInt()
   if(even(a))
        println(s"$a is even")
    else
        println(s"$a is odd")
    }
