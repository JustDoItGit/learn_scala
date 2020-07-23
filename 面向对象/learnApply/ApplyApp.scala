package learnApply

object ApplyApp {
  def main(args: Array[String]): Unit = {
    for (i <- 1 to 10) {
      println(ApplyTest.incr)
    }
    println(ApplyTest.count) // object本身就是一个单例对象
    val b = ApplyTest() // ===> object.apply
    println("b = " + b + " is int: " + b.isInstanceOf[Int])

    println("####################")
    val c = new ApplyTest() // class
    println(c)
    c()
    // 类名() ==> object.apply
    // 对象() ==> class.apply // new
  }
}

class ApplyTest {

  def apply() = {
    println("class ApplyTest apply...")
  }
}

object ApplyTest {
  println("object ApplyTest enter...")
  var count = 0

  def incr : String = {
    count += 1
    return "aa" + count
  }

  // 最佳实践：在object的apply方法中去 new class
  def apply() = {
    println("object ApplyTest apply...")

    new ApplyTest
  }

  println("object ApplyTest leave...")

}