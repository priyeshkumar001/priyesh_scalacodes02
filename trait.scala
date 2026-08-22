// experiment 7

trait person{
    def show():Unit={
        println("person triat call")
    }
}
trait animal{
    def dispaly():Unit={
        println("animal triat call")
    }
}
trait birds{
    def saniya():Unit={
        println("Meau Meau Meau")
    }
}
trait sanu{
    def sanu():Unit={
      
    }
}
class main_trait extends person with animal with birds with sanu{
   def aryan():Unit={
    println("main")

   }    
}
object traits{
    def main(args:Array[String]):Unit={
        var obj= new main_trait()
        obj.saniya()
        
    }
}
