class addition{
    def add(a:Int,b:Int):Unit={
    }
}
class calculatorss extends addition{
    override def add(a:Int,b:Int):Unit={
        println(a+b)
    }
}
object abstraction{
    def main(args:Array[String]):Unit={
        var obj =new calculatorss()
        obj.add(3,2)
    }
}