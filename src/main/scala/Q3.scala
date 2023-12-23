object Q3 {
  def main(args: Array[String]): Unit = {
    //3. Declare and initialize 3 three variable and print the biggest number.

    highest()
    def highest(): Unit={
      var x = scala.io.StdIn.readInt
      var y = scala.io.StdIn.readInt
      var z = scala.io.StdIn.readInt
      if (x>y & x>z){println(x)}
      else if (y>x & y>z) {println(y)}
      else {println(z)}
    }
  }

}
