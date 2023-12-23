object Q11 {
  def main(args: Array[String]): Unit = {

    //11. Write a program to print all odd numbers from 251 to 51. like (251,
    //249,...51)
    odd()

    def odd(): Unit = {
      var max = 251
      while (max >= 51) {
        if (max % 2 != 0) {
          println(max)
        }
        max -= 1
      }
    }

  }
}
