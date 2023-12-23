object Q25 {
  def main(args: Array[String]): Unit = {
    //25. Write programs to print the following series. 5*4,5*3,5*2,......5*(-12)
    //(Print in two ways – patter & multiplied value)
    series25()
    def series25(): Unit = {
      for (i<- 4 to -12 by -1){
        println("5*"+i)
      }
    }



  }


  }
