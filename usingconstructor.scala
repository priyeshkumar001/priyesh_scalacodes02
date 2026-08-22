class employees(var name:String, var salary:Double){
    def show( bonus:Int):Unit={
        println(s"name:${name} and salary:${salary+bonus}")
    }
}
class manager(name:String,salary:Double,department:String,bonus:Int)extends employees(name,salary){
    def info():Unit={
        show(bonus)
        println(s"department:${department}")
    }
}
object usingconstructor{
    def main(args:Array [String]):Unit={
        
        var e1 =new manager("saniya khan",120000,"BCA",1200)

        e1.info()
       
        
    }
}