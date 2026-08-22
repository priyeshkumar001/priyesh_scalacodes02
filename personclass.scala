/* create person class with name and price 
than create an auxiliary cnstructor that takes no parameter and set price and name fron user. */

class person(var name:String,var price:Double){
    def this()={
        this("Unknowns",0)
    }
    def display():Unit={
        println("product_name:"+name)
        println("product_price:"+price)    
    }
}
object productclass{
    def main(args:Array[String]):Unit={

        var p1 = new person("laptop",123000)
        p1.display()
        
        println()

        var p2 = new person()
        p2.display()
    }
}