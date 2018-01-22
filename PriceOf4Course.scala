package PF

class PriceOf4Course {
  def matchCourses(x: String): Int = x.toUpperCase() match {
    case "ANDROID" => 12999
    case "BIG DATA DEVELOPMENT" => 17999
    case "SPARK" => 19999
    case _ => 0
  }
}

//Main object

object MainDemo {
  def main(args: Array[String]) {
    while (true) {
      val input: String = readLine("enter course ---> ");
      var obj = new PriceOf4Course();
      var price: Int = obj.matchCourses(input);
      if (price == 0) {
        println("Course not found.");
        return ;
      } else {
        println("Price of " + input + " is " + price);
      }
    }
  }

}