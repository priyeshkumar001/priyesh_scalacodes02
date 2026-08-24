error id: file://<HOME>/Desktop/scala%20program/bank_acc.scala:bank_accatebalance.
file://<HOME>/Desktop/scala%20program/bank_acc.scala
empty definition using pc, found symbol in pc: 
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -bank_accatebalance.
	 -bank_accatebalance#
	 -bank_accatebalance().
	 -scala/Predef.bank_accatebalance.
	 -scala/Predef.bank_accatebalance#
	 -scala/Predef.bank_accatebalance().
offset: 512
uri: file://<HOME>/Desktop/scala%20program/bank_acc.scala
text:
```scala
class bankAccount {

  private var balance:Double = 14000.68
  def show():Unit={
    println(balance)
  }
}
object bankAccount{
    def create_acc(var name :String):bankAccount={
        new bankAccount(name)
    }
    def updatebalance(data:bankAccount, balance:Double):Unit={
    data.balance += balance
    println("balance update")
    }
}

object bank_acc{
    def main(args:Array[String]):Unit={
        var acc = bankaccount.create_acc("ABC")
        var acc2 = bankaccount.create_acc("PQR")

       .upd @@bank_accatebalance(acc,2000)
        bank_acc.updatebalance(acc2,1400.00)

        acc.show()
        acc2.show()
    }
    }
//     class BankAccount(val name: String) {

//   private var balance: Double = 14000.68

//   def show(): Unit = {
//     println("Account Name: " + name)
//     println("Balance: " + balance)
//   }

//   def updateBalance(amount: Double): Unit = {
//     balance += amount
//     println("Balance updated")
//   }
// }

// object BankAccount {

//   def create_acc(name: String): BankAccount = {
//     new BankAccount(name)
//   }
// }

// object Main {

//   def main(args: Array[String]): Unit = {

//     val acc = BankAccount.create_acc("ABC")
//     val acc2 = BankAccount.create_acc("PQR")

//     acc.updateBalance(2000)
//     acc2.updateBalance(1400.00)

//     acc.show()
//     acc2.show()
//   }
// }
```


#### Short summary: 

empty definition using pc, found symbol in pc: 