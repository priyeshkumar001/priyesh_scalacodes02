// CREATE A PERSON CLASS WITH PRIVATE VARIABLE VARIABLE NAME ALSO CERATE A COMPANION OBJECT THAT ACCESS AND DISPLAY THE PRIVATE VARIABLE 



class Person {
  private var name = "Priyesh"
}



object Person {
  def displayName(person:Person): Unit = {    //Data type ka name class ke name se hota Hain.
    println("Name: " + person.name)
  }
}

object pvtvarialble {
  def main(args:Array[String]):Unit ={
    var obj = new Person()
    Person.displayName(obj)
  }
}




