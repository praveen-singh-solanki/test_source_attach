// Superclass
open class MyParentClass {
  val x = 5
}

// Subclass
class MyChildClass: MyParentClass() {
  fun myFunction() {
	Thread.sleep(4000)
    println(x) // x is defined in the superclass
    try { throw Exception("Hi There!") } catch (e: Exception) { println(e) }
	Thread.sleep(5000)
  }
}

// Create an object of the MyChildClass and call myFunction
fun main() {
  val myObj = MyChildClass()
  myObj.myFunction()
}
