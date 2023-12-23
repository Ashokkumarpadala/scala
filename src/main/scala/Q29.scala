object Q29 {
  def main(args: Array[String]): Unit = {



    //29. Write programs to print the following series. 0.5^2, 0.7^2,0.9^2....5.1^2
    series29()

    def series29(): Unit = {
      var max = 51
      var min = 5
      while (min <= max) {
        println((min.toDouble / 10) + "^2")
        min += 2
      }
    }
  }
}
