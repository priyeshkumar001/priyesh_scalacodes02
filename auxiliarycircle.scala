class circle (var r: Double,var A: Double){
    def this( r:Double)={
        this(r, 3.14*r*r)
        println("run automatically")
    }
    def display(): Unit={
        println(s"${r} and ${A}")
    }
}
object auxiliary {
    def main (args:Array[String]):Unit={
        var obj =new circle(4)
        obj.display()

    }
}