object Q13 {
  def main(args: Array[String]): Unit = {
    //13. Write a program to print alternate even numbers from 20 to 140. Like
    //(20,24,28...)

    alternate1()

    def alternate1(): Unit = {
      var num = scala.io.StdIn.readInt()
      var max = scala.io.StdIn.readInt()
      if (num % 2 != 0) {
        num += 1
      }
      else {
        var x = num
        while (x != max) {
          println(x)
          x += 4
        }
      }
    }

  }

}
