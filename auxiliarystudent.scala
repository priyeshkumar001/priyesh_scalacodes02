/*create student class with name ,rollno and marks also 
create an auxiliary constructor that excepts name and roll no and set marks to o .
Than using method print student detail*/

class student(var name:String, var rollno:Int,var marks:Double){
    def this(name:String,rollno:Int)={
        this(name,rollno,0)
    }
    def studentdetail():Unit={
        println("name ="+name)
        println("rollno ="+rollno)
        println("marks ="+marks)
    }
}
object auxiliarystudent{
    def main (args: Array[String]):Unit={
        
        var s1 = new student("priyesh",21,90)
        s1.studentdetail()
        println()

        var s2 = new student("saniya",68)
        s2.studentdetail()
    }
}
