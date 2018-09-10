trait Labs {
  def add(x:Int, y: Int):Int = {
    return x + y
  }

  case class Account(number: Int, name: String)

  def greetAccountHolder(account: Account):String = {
    account match {
      case Account(a,b) => "Hello Mr."+b
    }
  }
}
