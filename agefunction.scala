import scala.io.StdIn

object agefunction{
    println("Enter The Age")
    var age = StdIn.readInt()

    def main (args : Array [String]) : Unit ={
       // var eligible = (age : Int) => age >= 18
        
        //if(eligible(age)){
        if(age >= 18){
            println("Eligible for DL")
        }else{
            println("not Eligible for DL")    
        }
        //println(eligible(age))



    }
}