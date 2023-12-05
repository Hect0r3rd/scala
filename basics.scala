// Define the main object
object Main {
  // Define the main method which serves as the entry point for the program
  def main(args: Array[String]): Unit = {

    // Define and initialize basic types and perform string operations
    val num: Int = 8
    val bool = false
    val str = "This is a string"
    val composedStr = "This" + " " + "is" + "also" + " " + "a" + " " + "string"
    val interpolatedStr = s"My favorite number is $num"

    // Expressions: Anything that can be assigned as long as it can be reduced to a value
    val exp = 2 + 3

    // Conditional expression using 'if'
    val ifExp =
      if (num > 10) {
        21
      } else {
        999
      }

    // Chained conditional expression using 'if-else if-else'
    val chainIfExp =
      if (num > 10) {
        21
      } else if (num < 0) {
        -8
      } else if (num > 999) {
        80
      } else {
        0
      }

    // Code blocks: Similar to expressions, can have values declared inside them
    val cBlock = {
      val localVal = 67
      localVal + 3
    }

    // Define a function (method) called 'myFunc'
    def myFunc(x: Int, y: String): String =
      y + " " + x

    // In Scala, normal iteration is often replaced with functions and recursion
    // Define a recursive function 'fact' to calculate factorial
    def fact(i: Int): Int =
      if (i <= 1) {
        1
      } else {
        i + fact(i - 1)
      }

    // Print the interpolated string
    print(interpolatedStr)
  }
}


/*
Variable Declarations and String Operations:

Declares variables (num, bool, str) with different types (integer, boolean, string).
Performs string operations to concatenate strings (composedStr).
Uses string interpolation to create a string (interpolatedStr) with the value of the num variable.

////////////
Expressions:

Defines an expression (exp) that calculates the sum of two numbers (2 + 3).

//////////////////////
Conditional Statements:

Uses an if-else statement (ifExp) to assign a value based on whether num is greater than 10.
Uses a chained if-else if-else statement (chainIfExp) to assign a value based on different conditions related to the value of num.

//////////////
Code Blocks:

Defines a code block (cBlock) that includes the declaration of a local variable (localVal) and performs an expression (localVal + 3). The result is assigned to cBlock.

///////////
Functions:

Defines a function (myFunc) that takes an integer (x) and a string (y) as parameters and concatenates them.

////////////
Recursion:

Defines a recursive function (fact) to calculate the factorial of a given integer i. The function adds i to the factorial of i-1 until i becomes 1.

///////////
Prints:

Prints the interpolated string (interpolatedStr) using the print function.
*/



/*
The code covers fundamental concepts such as variable declarations, string operations, and expressions, showcasing that even basic types and operations are treated as objects in Scala. The inclusion of conditional statements and code blocks further emphasizes the expression-oriented nature of the language, where conditionals are expressions that yield values. The definition of functions, like 'myFunc', aligns with Scala's functional programming paradigm, treating functions as first-class citizens. Additionally, the recursive function 'fact' demonstrates how even control flow structures are expressed in a way that aligns with the principle of treating everything as an expression. 
*/