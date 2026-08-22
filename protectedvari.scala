class employee(protected var salary:Double)
class manager(salary:Double)extends employee(salary){
    def hike():Unit={

        val update_salary= salary*0.20
        println(salary+update_salary)

    }
    override def toString(): String ={
        s"${salary}"
    }
}
class developer(salary:Double)extends employee(salary){
    def increasesalary():Unit={
        val update_salary= salary*0.030
        println(salary+update_salary)
    }
}
object Main extends App{
    val manager = new manager(500000)
    val developer = new developer(200000)
    val  obj2 = new manager(50000)
    println(manager==obj2)

    manager.hike()
    developer.increasesalary()
    println(manager.hashCode())//Hash Address hota hain
    println(manager)// Class ko yeak object ke tarah dekh rhe hain 
}
