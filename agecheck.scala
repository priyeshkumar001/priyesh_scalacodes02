case class student(var name : String,var age:Int)
object agecheck{
    def main (args:Array[String]):Unit={
        var s = student("priyesh",24)
        s match{
            case student(name, age) if age>=18 => {
                println("valid")  
            }
            case student(name,age)if age<19 => {
                println("not valid")
            }
            case _ =>{
                println("enter correct age")
            }

        }
            
        
    }
}