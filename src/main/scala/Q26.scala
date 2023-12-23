object Q26 {
  def main(args: Array[String]): Unit = {


    //26. Write programs to print the following series.
    //1,even,3,even,5,even,.......35,even

    series3()

    def series3(): Unit = {
      var max = 35
      var min = 1
      while (min <= max) {
        println(min + ", even")
        min += 2
      }
    }

  }
}
