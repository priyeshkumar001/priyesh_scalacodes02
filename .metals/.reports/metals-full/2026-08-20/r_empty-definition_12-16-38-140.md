error id: file://<HOME>/Desktop/scala%20program/caseclass.scala:scala/Predef.println(+1).
file://<HOME>/Desktop/scala%20program/caseclass.scala
empty definition using pc, found symbol in pc: 
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -println.
	 -println#
	 -println().
	 -scala/Predef.println.
	 -scala/Predef.println#
	 -scala/Predef.println().
offset: 200
uri: file://<HOME>/Desktop/scala%20program/caseclass.scala
text:
```scala
case class student (var name :String,var agr: Int)
object caseclass{
    def main (args:Array[String]):Unit={
        var s = student("Priyesh",25)//to string automatically call ho jata hain 
        @@println(s)
        var s2 = s.copy(age=28)
        
        println(s2)
        println(s==s2)
    }
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: 