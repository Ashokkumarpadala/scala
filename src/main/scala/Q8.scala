object Q8 {
  def main(args: Array[String]): Unit = {
    //8. Write a program to print all numbers which are divisible by 11 from 250 to
    //550.
    DIV_BY_11()

    def DIV_BY_11(): Unit = {
      var a = 250
      while (a <= 550) {
        if (a % 11 == 0) {
          println(a)
        }
        a += 1

      }


    }

  }
}
