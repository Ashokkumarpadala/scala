object Q14 {
  def main(args: Array[String]): Unit = {
    //14. Write a program to print alternate even numbers from 20 to 140. Like
    //(22,26,30...)

    alternate1()

    def alternate1(): Unit = {
      var count = 0
      var min = scala.io.StdIn.readInt()
      var max = scala.io.StdIn.readInt()

      while (min <= max) {
        var x = min-2
        if (x%2==0){
          println(x)
          min+=4

        }


      }
    }
  }
}


