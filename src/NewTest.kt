fun main(args: Array<String>) {
  Thread.sleep(5000)
  var count = 0
  while (count < 5)
  {
    try 
    {
      throw Exception("Hi lets disco")
    }
    catch(e: Exception)
    {
      println(e)
    }
    count++
  }
}
