import scala.io.StdIn
object function1{
    def even(a:Int): Boolean = {
        a % 2==0
    }
    
    def main(args: Array[String]): Unit={
        println("Enter a Number: ")
        val a=StdIn.readInt()
        
        if (even(a))
            println(s"$a is even")
        else
            println(s"$a in odd")
    }
}

/* import scala.io.StdIn

object EvenNumber {

  def even(a: Int): Boolean = {
    a % 2 == 0
  }

  def main(args: Array[String]): Unit = {
    println("Enter a number:")
    val a = StdIn.readInt()

    if (even(a))
      println(s"$a is Even")
    else
      println(s"$a is Odd")
  }
}*/