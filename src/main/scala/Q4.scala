object Q4 {

  //4. Write a java program that performs the following tasks.
  //a. Store a number in a variable
  //b. If value is not in range (100-1000) prints wrong number else follows
  //the steps
  //c. Check even or odd
  //d. If even divide the number by 3 and print the remainder
  //e. If odd divide the number by 2 and print the remainder.
  def main(args: Array[String]): Unit = {
    java_p()
    def java_p(): Unit = {
      var num = 15
      if (!(1 to 1000 contains num ) ) {
        println("wrong number")}
      else if (num%2==0){
        println(num%3)}
      else  {println(num%2)}

    }
  }
}
