object calculatorobject {
    def add(a,b): Int ={
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