object Q30 {
  def main(args: Array[String]): Unit =

    //30. Write a for loop that never ends?
    loop1()

  def loop1(): Unit = {


    for (i <- Stream.from(1)) {
      println(i)

    }
  }
  }





