object FormatString {
  def main(args: Array[String]) {
    var floatVar = 12.456
    var intVar = 2000
    var stringVar = "StringVar!"
    var fs = printf("浮点型变量为 " +
                      "%f, 整型变量为 %d, 字符串为 " +
                      " %s", floatVar, intVar, stringVar)
    println(fs)
  }
}
