class addition{
    def add(a:Int,b:Int):Unit={
    }
}
class calculator extends addition{
    override def add(a:Int,b:Int):Unit={
        println(a+b)
    }
}
object abstraction{
    def main(args:Array[String]):Unit={
        var obj =new calculator()
        obj.add(3,2)
    }
}