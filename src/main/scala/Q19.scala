object Q19 {  def main(args: Array[String]): Unit = {
  //19. Write programs to sum of the following Series. 52 + 62 + 72
  //+..........+1022.
  sum_of_series()

  def sum_of_series(): Unit = {
    var min = 52
    var max = 1052
    var sum = 0
    while (min != max) {
      sum += min
      min += 10
    }
    println(sum)

  }


}

}
