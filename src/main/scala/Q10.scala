object Q10 {
  def main(args: Array[String]): Unit = {
    //10. Write a program to print all even numbers in range 700 to 900.
    even()
    def even():Unit={
      var min = 700
      while (min<=900){
        if (min%2==0){
          println(min)
        }
        min+=1
      }

    }
  }


}
