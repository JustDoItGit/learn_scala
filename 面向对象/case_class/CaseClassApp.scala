package case_class

// 通常用在模式匹配
object CaseClassApp {
  def main(args: Array[String]): Unit = {
    println(Dog("wang cai").name)
  }
}

// case class 不用new
case class Dog(name: String)
