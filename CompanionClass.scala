// 私有构造方法
class CompanionClass private(val color:String) {
  println("创建" + this)
  override def toString(): String = "颜色标记："+ color
}

// 伴生对象，与类共享名字，可以访问类的私有属性和方法
object CompanionClass{
  private val companionClasses: Map[String, CompanionClass] = Map(
    "red" -> new CompanionClass("red"),
    "blue" -> new CompanionClass("blue"),
    "green" -> new CompanionClass("green")
  )

  def apply(color:String) = {
    if(companionClasses.contains(color)) companionClasses(color) else null
  }


  def getCompanionClass(color:String) = {
    if(companionClasses.contains(color)) companionClasses(color) else null
  }
  def main(args: Array[String]) {
    println(CompanionClass("red"))
    // 单例函数调用，省略了.(点)符号
    println(CompanionClass getCompanionClass "blue")
  }
}
