object Q16 {
  def main(args: Array[String]): Unit = {
    //16. Write a program to sum all even numbers between 382 and 582.
    sum_of_even()
    def sum_of_even(): Unit = {
      var min = 382
      var max = 582
      var sum = 0
      while (min!=max){
        if (min%2==0){
          sum+=min
        }
        min+=1
      }
      println(sum)
    }
  }

}
