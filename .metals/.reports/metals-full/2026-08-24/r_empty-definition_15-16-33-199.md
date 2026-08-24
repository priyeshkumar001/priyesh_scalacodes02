error id: file://<HOME>/Desktop/scala%20program/calculatorobject.scala:scala/Int#
file://<HOME>/Desktop/scala%20program/calculatorobject.scala
empty definition using pc, found symbol in pc: scala/Int#
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -Int#
	 -scala/Predef.Int#
offset: 49
uri: file://<HOME>/Desktop/scala%20program/calculatorobject.scala
text:
```scala
object calculatorobject {
    def add(a:Int,b:Int@@): Int ={
        a+b
    }
    def subtract(a,b): Int ={
        a-b
    }
    def multiply(a,b): Int ={
        a*b
    }
    def division(a,b): Float={
        a/b
    }
}
object test {
    def main (args: Array [String]): Unit ={
        println(calculatorobject.add(2,3))
        println(calculatorobject.subtract(6,3))
        println(calculatorobject.multiply(3,3))
        println(calculatorobject.division(6,2))
    }
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: scala/Int#