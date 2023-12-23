object Q20 {
  def main(args: Array[String]): Unit = {

//20. Write a program to print A, B alternatively for 100 times. Ex: (A, B, A, B,
    //A,B...)
    AB()
    def AB():Unit={
      var count= 0
      while (count!=100){
        print("A","B")

        count+=1
      }
    }
  }

}
