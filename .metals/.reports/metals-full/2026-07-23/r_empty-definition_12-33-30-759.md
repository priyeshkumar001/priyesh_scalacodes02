error id: file://<HOME>/Desktop/scala%20program/forloop.scala:
file://<HOME>/Desktop/scala%20program/forloop.scala
empty definition using pc, found symbol in pc: 
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -isPrime.
	 -isPrime#
	 -isPrime().
	 -scala/Predef.isPrime.
	 -scala/Predef.isPrime#
	 -scala/Predef.isPrime().
offset: 1047
uri: file://<HOME>/Desktop/scala%20program/forloop.scala
text:
```scala
import scala.io.StdIn

object forloop{
    def main(agrs : Array[String]): Unit ={
        //for (i<- 1  until 10 ){
        //    println(i) 
        
        
        //for (i<- 1 to 10 by 2 ){ 
         //   println(i)
        
        //for (i<- 1 to 10  ){ 
          //  println(i)
        
        
        
        //for (i<- 10 to 1 by -1 ){ //by ,to
            //println(i)
        //}
        
        /*for(i <- 1 to 4){
            for(j <- 1 to 2){
                println(s" ${i}, ${j}")
            }
        }
        println("enter the number:")
        var num = StdIn.readInt()
        
        println("prime number:")
        for(i<- 1 to num){
            if (i % 2 != 0)
                println(i)
        }*/

        println("Enter The Number:")
        var num = StdIn.readInt()
        var isPrime = true
        
        if (num <= 1){
            var isPrime = false
        }
        else {
            for(i <- 2 Until num){
                if(num % 2 == 0){
                    
                }
                @@isPrime
            }
        }


    }
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: 