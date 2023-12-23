object Q9 {
  def main(args: Array[String]): Unit = {
    //9. Write a program to sum all the numbers from 56 to 153.
    sum_of1()
    def sum_of1():Unit = {
      var sum_of_num = 0
      for(i<- 56 to 153){

        sum_of_num += i
      }
      println(sum_of_num)
    }

  }

}
