/*Question:
Create a Student class with name and age as primary constructor parameters. 
Create an auxiliary constructor that accepts only name and sets age = 18.*/


class student(var name:String,var age:Int){
    def this(name: String)={
        this(name,18)
    }
 
    def display(): Unit = {
    println("Name =" +name)
    println("Age =" +age)
    }
 }
 object auxiliarystudent1 {
    def main(args: Array[String]): Unit = {

        var s1 = new student("priyesh",21)
        s1.display()

        println()

        var s2 = new student("saniya")
        s2.display()

    }
 }
 
