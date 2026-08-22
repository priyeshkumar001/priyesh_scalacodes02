import scala.io.StdIn;

object calculator{
    def main(args: Array[String]): Unit ={
        
        println("Enter The First Number:")
        val a = StdIn.readFloat()

        println("Enter The Second Number:")
        val b = StdIn.readFloat()

        println(" Enter The Operator(+,-,*,/):")
        val c = StdIn.readLine()

        val result = c match{
            case "+" => println(a+b)
            case "-" => println(a-b)
            case "*" => println(a*b)
            case "/" =>
                if(b != 0){
                    println(a/b)
                }
                    else{
                        println("Invalid Input")
                    }
            case _ => println("Invalid operator") //Default case(_)underscore.
            return

                }
                println("result= "+ result)
    }
}