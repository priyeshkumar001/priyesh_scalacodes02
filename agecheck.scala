//Question: Age Validation using Case Classes and Pattern Matching....////...///..//./?

case class student(var name : String, var age:Int)
object agecheck{
    def main (args:Array[String]):Unit={
        var s = student("priyesh",24)
        s match{
            case student(name, age) if age >= 18 => 
                println("valid")  
            
            case student(name,age)if age<19 => 
                println("not valid")
            
            case _ =>
                println("enter correct age")
            

        }
            
        
    }
}
// case class Student(name: String, age: Int)

// object AgeCheck {
//   def main(args: Array[String]): Unit = {
//     val s = Student("priyesh", 24)
//     s match {
//       case Student(_, age) if age >= 18 =>
//         println("valid")
//       case Student(_, age) if age >= 13 =>
//         println("not valid")
//       case _ =>
//         println("enter correct age")
//     }
//   }
// }