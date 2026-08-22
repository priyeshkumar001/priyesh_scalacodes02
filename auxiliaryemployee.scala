/* Create an Employee class with name, salary, and department. 
Create an auxiliary constructor that accepts only name and sets salary to 200000 and department to "IT" */

class Employee(
    var name: String,var salary: Double,var department: String) {

  def this(name: String) = {
    this(name, 200000, "IT")
  }

  def display(): Unit = {
    println("Name = " + name)
    println("Salary = " + salary)
    println("Department = " + department)
  }
}

object auxiliaryemployee {
  def main(args: Array[String]): Unit = {

    var e1 = new Employee("Aryan", 500000, "HR")
    e1.display()

    println()

    var e2 = new Employee("Saniya Khan")
    e2.display()
  }
}