object Q12 {
  def main(args: Array[String]): Unit = {
  //12. Write a Program to print the count of the even numbers between the given
    //range?
    count()
    def count(): Unit={
      var max1 = scala.io.StdIn.readInt()
      var min = scala.io.StdIn.readInt()
      var count1 =0

      while (min!=max1){
        if (min%2==0){
          count1+=1
        }
        min+=1
      }
      println(count1)
    }

  }


  }
