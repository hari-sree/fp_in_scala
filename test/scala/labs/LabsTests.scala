object LabsTests extends Labs{
  def main(args: Array[String]): Unit = {
    val result = add(1,2)
    println(result)

    val account = Account(100, "John")
    val greeting = greetAccountHolder(account)
    println(greeting)
  }
}