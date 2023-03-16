// Superclass
open class MyParentClass {
  val x = 5
  fun myFunctionP() {
    println(x) // x is defined in the superclass
    try
    {
      throw Exception("Hi from parent !")
    }
    catch (e: Exception)
    {
      println(e)
    }
  }
}

// Subclass
class MyChildClass: MyParentClass() {
  fun myFunctionC() {
    println(x) // x is defined in the superclass
    try
    {
      throw Exception("Hi from Child Class !")
    }
    catch (e: Exception)
    {
      println(e)
    }
  }
}

// Create an object of the MyChildClass and call myFunction
fun main() {
  Thread.sleep(10000)
  val myObj = MyChildClass()
  myObj.myFunctionC()
  myObj.myFunctionP()
}
