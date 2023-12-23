object Q22 {
  def main(args: Array[String]): Unit = {
    //22. Write programs to print the following series. 100,200,300........10000
    series()
    def series(): Unit={
      for (i<-100 to 10000 by 100){
        println(i)
      }
    }
  }

}
