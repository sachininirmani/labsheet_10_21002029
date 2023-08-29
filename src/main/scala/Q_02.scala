/*
2. Write a Scala function called countLetterOccurrences that takes a list of words as
  input and uses the map function to transform the words into their respective lengths
  (number of letters), and then uses the reduce function to calculate the total count of
  letter occurrences in all the words combined.
  Example:
  Input: ["apple", "banana", "cherry", "date"]
Output: Total count of letter occurrences: 24
Implement the countLetterOccurrences function using the map and reduce methods
  */
object Q_02 {
  def main(args: Array[String]): Unit = {
    val words = List("apple", "banana", "cherry", "date")
    println("Total count of letter occurrences: " + countLetterOccurrences(words))
  }

  def countLetterOccurrences(words : List[String]) : Int = {
    val number_of_letters = words.map(word => word.length)
    val total_count_of_letters = number_of_letters.reduce((x, y) => x + y)
    total_count_of_letters
  }

}
