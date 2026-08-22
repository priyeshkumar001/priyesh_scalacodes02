case class student (var name :String,var age: Int)
object caseclass{
    def main (args:Array[String]):Unit={
        var s = student("Priyesh",25)//to string automatically call ho jata hain 
        var s2 = s.copy(age=28)


        println(s)
        println(s2)
        println(s==s2)
    }
}