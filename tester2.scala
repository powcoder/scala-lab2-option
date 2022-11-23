https://powcoder.com
代写代考加微信 powcoder
Assignment Project Exam Help
Add WeChat powcoder
case class Node(first: Option[Node], op: Either[String,Double], second: Option[Node])

object Tester extends App {

  println("Q1")
  val result1 = Lab2.upper(Vector("hello", "world"))
  print("Expecting: ")
  println(Vector("HELLO", "WORLD"))
  print("Received: ")
  println(result1)


  println("Q2")
  val result2 = Lab2.su(Vector("hello", "psu", "and", "osu"))
  print("Expecting: ")
  println(Vector("psu", "osu"))
  print("Received: ")
  println(result2)
  
  println("Q3")
  val result3 = Lab2.tot(Vector("hello", "psu", "and", "osu"))
  println("Expecting: 14")
  print("Received: ")
  println(result3)

  println("Q4")
  val leaf1 = Node(None, Right(1), None)
  val leaf2 = Node(None, Right(2), None)
  val leaf3 = Node(None, Right(3), None)
  val leaf4 = Node(None, Right(4), None)
  val inner1 = Node(Some(leaf1), Left("+"), Some(leaf2))
  val inner2 = Node(Some(leaf3), Left("+"), Some(leaf4))
  val root = Node(Some(inner1), Left("*"), Some(inner2))
  
  val result4a = Lab2.evaluate(leaf1)
  println(s"Expecting 1.0, got $result4a")

  val result4b = Lab2.evaluate(leaf3)
  println(s"Expecting 3.0, got $result4b")

  val result4c = Lab2.evaluate(inner1)
  println(s"Expecting 3.0, got $result4c")

  val result4d = Lab2.evaluate(root)
  println(s"Expecting 21.0, got $result4d")



}

