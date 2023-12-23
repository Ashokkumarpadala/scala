object Q31 {
  def main(args: Array[String]): Unit = {
    //31. Write a Loop inside other loop and observe the execution flow?
    loop2()
    def loop2(): Unit={
      for (i<- 1 to 5){
        for (j <-(1 to i)){
          print("SB ")
        }
        println("")
      }
    }
  }
    }


