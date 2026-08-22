import scala.io.StdIn

object Test {
    def main(args :Array[String]): Unit = {
        println("Enter units:")
        var unit = StdIn.readFloat()

        if (unit>=0 && unit <= 10){
            println("Free unit")
        }
        else if (unit>10 && unit <= 100){
            println("two times of the unit")
        }
        else if (unit >100 && unit <=200 ){
            println("three times of unit")
        }
        else {
            println("unit consumer")
            }            
    }
}