/*
1. Write a Scala function called calculateAverage that takes a list of temperatures as
input and uses the map function to convert each temperature to Fahrenheit, and then
uses the reduce function to calculate the average Fahrenheit temperature. The
formula to convert Celsius to Fahrenheit is: (C * 9/5) + 32.
Example:
Input: [0, 10, 20, 30]
Output: Average Fahrenheit temperature: 68.0
Implement the calculateAverage function using the map and reduce methods.
 */
object Q_01 {
  def main(args: Array[String]): Unit = {
    val temperatures= List(0, 10, 20, 30)
    println("Average Fahrenheit temperature: " + calculateAverage(temperatures))
  }

  def calculateAverage(temperatures : List[Int]) : Double = {
    val Temp_in_F = temperatures.map(temp => (temp * 9/5) + 32)
    val total_Temp_in_F = Temp_in_F.reduce((Temp_01, Temp_02) =>Temp_01 + Temp_02)
    val Average_Temp_in_F = total_Temp_in_F / temperatures.length
    Average_Temp_in_F
  }

}
