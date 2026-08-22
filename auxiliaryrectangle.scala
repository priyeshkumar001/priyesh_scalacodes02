//Create a rectangle class with length and breath use an auxiliary constractor to handle the missing parametres dynamically.

class rectangle(var length:Double,var breadth:Double){
    def this(length:Double) = {
        this(length,length)
    }
    def area():Double ={
        length * breadth
    }
    def display (): Unit ={
        println("length="+length)
        println("breadth="+breadth)
        println("area="+area())
    }
}
object auxiliaryrectangle{
    def main (args: Array[String]): Unit={

        var r1 = new rectangle(10,5)
        r1.display()

        println()

        var r2 = new rectangle(8)
        r2.display()
    }
}
// class Rectangle(var length: Double, var breadth: Double) {

//   // Auxiliary constructor: if breadth is missing,
//   // set breadth equal to length
//   def this(length: Double) = {
//     this(length, length)
//   }

//   def area(): Double = {
//     length * breadth
//   }

//   def display(): Unit = {
//     println("Length = " + length)
//     println("breadth = " + breadth)
//     println("area = " + area())
//   }
// }

// object auxiliaryRectangle {
//   def main(args: Array[String]): Unit = {

//     // Using primary constructor
//     var r1 = new Rectangle(10, 5)
//     r1.display()

//     println()

//     // Using auxiliary constructor
//     var r2 = new Rectangle(8)
//     r2.display()
//   }
// }