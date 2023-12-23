case object scala_30_problems {
  def main(args: Array[String]): Unit = {
    var x = 0
    while (x < 1) {

      if (x > 10 && x < 40) {
        println("ashok")
      }
      else if (x < 5) {
        println("padala")
      }
      else {
        println("kumar")
      }
      x += 1


    }
  }


  kilo()
  def kilo(): Unit ={
    var kgs= 56
    println(kgs*1000 ,"grams")
  }
  franht_to_cel()
  def franht_to_cel(): Unit ={
    var c = 80
    var f = (c*9/5)+32
    println(f)
  }
  highest()
  def highest(): Unit={
    var x = scala.io.StdIn.readInt
    var y = 80
    var z = 50
    if (x>y & x>z){println(x)}
    else if (y>x & y>z) {println(y)}
    else {println(z)}
  }
  /*4. Write a java program that performs the following tasks.
a. Store a number in a variable
b. If value is not in range (100-1000) prints wrong number else follows
the steps
c. Check even or odd
d. If even divide the number by 3 and print the remainder
e. If odd divide the number by 2 and print the remainder.
*/
  java_p()
  def java_p(): Unit = {
    var num = 15
    if (!(1 to 1000 contains num ) ) {
      println("wrong number")}
    else if (num%2==0){
      println(num%3)}
    else  {println(num%2)}

  }
  /*5. Declare & initialize a number. Check whether the number is in range 0-100
  or not. If not in range print invalid input. Else – if the number is in range 90-
    100 then print Super Smart, 80-90 print Smart,70-80 print smart enough,
  60-70 print just smart, 35-60 print no smart, 0-35 print dump.*/
  five()
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
  seeko()
  def seeko() :Unit = {
    for (i <- 1 to 60){
      println("SEEKHO BIGDATA")
    }
  }
  DIV_BY_11()
  def DIV_BY_11(): Unit = {
    var a = 250
    while (a<=550){
      if (a %11==0){
        println(a)}
      a+=1

    }

  }
  sum_of1()
  def sum_of1():Unit = {
    var sum_of_num = 0
    for(i<- 56 to 153){

      sum_of_num += i
    }
    println(sum_of_num)
  }

  //0. Write a program to print all even numbers in range 700 to 900
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

  odd()
  def odd(): Unit = {
    var max =251
    while (max>=51){
      if (max%2!=0){
        println(max)
      }
      max-=1
    }
  }

  count()
  def count(): Unit={
    var max1 = scala.io.StdIn.readInt()
    var min = scala.io.StdIn.readInt()
    var count1 =0

    while (min!=max1){
      if (min%2==0){
        count1+=1
      }
  min+=1
    }
    println(count1)
  }


  alternate1()
  def alternate1(): Unit= {
    var num = scala.io.StdIn.readInt()
    var max= scala.io.StdIn.readInt()
    if (num%2!=0){
      num+=1
    }
    else{
      while (num!=max){
        println(num)
        num+=4
      }
    }
  }


  alternate1()
  def alternate():Unit = {
    var count = 0
    var min = scala.io.StdIn.readInt()
    var max = scala.io.StdIn.readInt()
    while (min!=max){
      if (min%2==0 & count<=2){
        count+=1
      }
      else{
        print()
      }

    min+=1
    }
  }

//16. Write a program to sum all even numbers between 382 and 582.
  sum_of_even()
  def sum_of_even(): Unit = {
    var min = 382
    var max = 582
    var sum = 0
    while (min!=max){
      if (min%2==0){
        sum+=min
      }
      min+=1
    }
    println(sum)
  }

  //17. Write a Program to print the all alphabets by using character Variable?
  alphabets()
  def alphabets():Unit= {
  var character = Array("a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z")
    for (i<- character){
      print(i+ " ")
    }
  }

  sum_of()
 // 18. Write a program to find the average of 24,26,28,.....100.

  def sum_of(): Unit = {

    var min = 24
    var max = 100
    var sum = 0
    while (min!=max ){

      sum+=min

      min+=2
    }
    println(sum)

  }
  //19. Write programs to sum of the following Series. 52 + 62 + 72
  //+..........+1022.

  sum_of_series()

  def sum_of_series(): Unit = {
    var min = 52
    var max = 1052
    var sum = 0
    while (min != max) {
      sum += min
      min += 10
    }
    println(sum)

  }

  AB()
  def AB():Unit={
    var count= 0
    while (count!=100){
      print("A","B")

      count+=1
    }
  }



  //21. Write a program to print the series : 10@9,9@8,8@7.......-5@-6
  series21()
  def series21():Unit={
    for (i <-10  to -5 by -1){
      println (i+"@"+(i-1))
    }

  }

   //22. Write programs to print the following series. 100,200,300........10000
  series()
  def series(): Unit={
    for (i<-100 to 10000 by 100){
      println(i)
    }
  }

 // 23. Write programs to print the following series. 5^2, 7^2,9^2.....25^2
series1()
  def series1():Unit={
    for (i<-5 to 25 ){
      println(i+"^2")
    }
  }

  //24. Write programs to print the following series. 5,10,5,10,5,10,5 for 7 times

  series2()
  def series2():Unit={
    var c  =0
    while (c!=7){
      println(5)
      println(10)
      c+=1
    }
  }
  //25. Write programs to print the following series. 5*4,5*3,5*2,......5*(-12)
  //(Print in two ways – patter & multiplied value)



  //26. Write programs to print the following series.
  //1,even,3,even,5,even,.......35,even

  series3()
  def series3():Unit = {
    var max = 35
    var min = 1
    while (min!= max){
      println(min+", even")
      min+=2
    }
  }

  //27. Write programs to print the following series. 1,2,factor of three,4,5,factor
  //of three, 7,8,factor of three,..........22,23,factor of three.

  //28. Write programs to print the following series. 1,3, divisible by five, 7,9,
  //11,13, divisible by five,.....21,23, divisible by five

  //29. Write programs to print the following series. 0.5^2, 0.7^2,0.9^2....5.1^2
  series29()
  def series29():Unit={
    var max = 51
    var min = 5
    while (min<=max){
      println((min.toDouble/10)+"^2")
      min+=2
    }
  }

  //30. Write a for loop that never ends?
  loop1()

  def loop1(): Unit = {


    for (i <-  Stream.from(1)) {
       println(i)

    }
  }

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







