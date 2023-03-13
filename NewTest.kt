fun main(args: Array<String>) {
  Thread.sleep(5000)
  try 
  {
    throw Exception("Hi lets disco")
  }
  catch(e: Exception)
  {
    println(e)
  } 
}
