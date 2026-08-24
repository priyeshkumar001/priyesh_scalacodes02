object calculatorobject {
    def add(a:Int,b:Int): Int ={
        a+b
    }
    def subtract(a:Int,b:Int): Int ={
        a-b
    }
    def multiply(a:Int,b:Int): Int ={
        a*b
    }
    def division(a:Int , b:Int): Double={
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