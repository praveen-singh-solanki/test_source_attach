// Superclass
open class MyParentClass {
  val x = 5
}

// Subclass
class MyChildClass: MyParentClass() {
  fun myFunction() {
    var count = 0
    Thread.sleep(4000)
    while(count < 5)
    {
      println(x) // x is defined in the superclass
      try
      { 
        throw Exception("Hi There!") 
      }
      catch (e: Exception)
      {
        println(e)
      }
      Thread.sleep(1000)
      count++
    }
  }
}

// Create an object of the MyChildClass and call myFunction
fun main() {
  val myObj = MyChildClass()
  myObj.myFunction()
}
