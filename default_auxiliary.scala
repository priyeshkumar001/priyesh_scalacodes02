class Circle(var r:Double,var A:Double){
    
    
    def this()={
        this(3,50.24)
        println("run automatically")

        
    } 
    def display():Unit={
        println(s"${r} and ${A}")

    }

} 
object default_auxiliary{
    def main(args:Array[String]):Unit={
        var obj =new Circle()
        obj.display()
    }
}