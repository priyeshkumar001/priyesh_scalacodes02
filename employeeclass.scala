/* create an employee class with parameter 
Id,name and salary now create an auxiliary conatructor
that excepts only id and name and set salary to 25000. */

class employees(var id:Int,var name:String,var salary:Double){
    def this(id:Int,name:String)={
        this(id,name,25000)
    }
    def display():Unit={
        println("id:"+id)
        println("name:"+name)
        println("salary:"+salary)
    }
}
object employeeclass{
    def main(args:Array[String]):Unit={

        var e1 = new employees(101,"Priyesh Kumar",500000)
        e1.display()
        
        println()

        var e2 = new employees(111,"Aryan")
        e2.display()
    }
} 

