// experiment 6

class students{
    def info():Unit ={
        println("Hi")
    }
}
class course extends students{
    def display(): Unit ={
        println("hello")
    }
}
object Main{
    def main(args:Array[String]): Unit ={
        var obj = new course()
        obj.info()
        obj.display()
}

}

