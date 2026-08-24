class bankAccount(var name:String) {

  private var balance:Double = 14000.68
  def show():Unit={
    println(balance)
  }
}
object bankAccount{
    def create_acc( name :String):bankAccount={
        new bankAccount(name)
    }
    def updatebalance(data:bankAccount, balance:Double):Unit={
    data.balance += balance
    println("balance update")
    }
}

object bank_acc{
    def main(args:Array[String]):Unit={
        var acc = bankAccount.create_acc("ABC")
        var acc2 = bankAccount.create_acc("PQR")

        bankAccount.updatebalance(acc,2000)
        bankAccount.updatebalance(acc2,1400.00)

        acc.show()
        acc2.show()
    }
}
