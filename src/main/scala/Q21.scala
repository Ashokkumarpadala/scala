object Q21 {
  def main(args: Array[String]): Unit = {
    //21. Write a program to print the series : 10@9,9@8,8@7.......-5@-6
    series21()
    def series21():Unit={
      for (i <-10  to -5 by -1){
        println (i+"@"+(i-1))
      }

    }
  }


  }
