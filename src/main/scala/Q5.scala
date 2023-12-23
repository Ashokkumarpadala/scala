object Q5 {

  //5. Declare & initialize a number. Check whether the number is in range 0-100
  //or not. If not in range print invalid input. Else – if the number is in range 90-
  //100 then print Super Smart, 80-90 print Smart,70-80 print smart enough,
  //60-70 print just smart, 35-60 print no smart, 0-35 print dump.

  def main(args: Array[String]): Unit = {
    five()
  }
    def five():Unit ={
      var num1  = scala.io.StdIn.readInt
      if (!(1 to 100 contains num1)) {
        println("invalid input")}
      else if (90 to 100  contains num1 ){
        println("super smart")}
      else if (80 to 90  contains num1 ){
        println("smart  ")}
      else if (70 to 80  contains num1 ){
        println("smart enough ")}
      else if (60 to 70  contains num1 ){
        println("just smart")}
      else if (35 to 60  contains num1 ){
        println("no  smart")}
      else if (0 to 35  contains num1 ){
        println("dump")}


    }

}
