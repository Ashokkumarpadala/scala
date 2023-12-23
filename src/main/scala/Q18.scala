import scala_30_problems.sum_of

object Q18 {

  def main(args: Array[String]): Unit = {

    sum_of()
    // 18. Write a program to find the average of 24,26,28,.....100.

    def sum_of(): Unit = {

      var min = 24
      var max = 100
      var sum = 0
      while (min != max) {

        sum += min

        min += 2
      }
      println(sum)


    }
  }}
