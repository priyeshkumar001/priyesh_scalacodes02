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
            for(i <- 2 until num){
                if(num % i == 0){
                    isPrime = false
                }
            }
        }
        
        if (isPrime){
            println(num + " is a Prime number")
        }
        else{
            println(num + " is not a Prime")
        }


    }
}