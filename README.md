# Java Programming Masterclass for Software Developers

## Casting

Converting a number from one type to another

(byte) (myMinByteValye/2);

Other languages have casting too. In short, always use int (integer) to avoid casting issues.

## Float and Double Primitive Type Numbers

Float: Single precision number (32 bits, so has a width of 32 ) - precision upto 7 numbers after decimal point
Double: Double precision number (64 bits, so has a width of 64 ) - precision upto 16 numbers after decimal point

Modern computers at chip level deal with double number faster than equivalent float number although it takes up double amount of space. This is well-thought JAVA developers kept in mind. 

Highly recommeded to use Double as default and not float.


## Char & Boolean

Char is similar to the string, it can only save a single character - it occupies 2 bytes which is 16 bits of width


## Common primitive types

Most common primitive types will be int, double, and a boolean and from time to time will use char. byte, shot, float will be used less.

String - not data type, it's a class
String - Sequence of characters
MAX_VALUE = 2.14 Billion

Strings in JAVA are immutable - you can not change it once it's create, a new string is created once you append it. A new string gets created and an old strign gets discareded.


## Operators, Operands, and Expressions

Operators : Special Symbols that perform specific opetatins in one, two, or more operands.

Operands: Object that is manipulated by an operator

Expression: Formed by combining variables, literals, method return values


## Abbreviating Operators


## if and else statements
A code block allows more than one statement to be executed - a block of code.

Do by adding a set of curly braces

## More Operators
Logical AND Operator --> &&
Bitwise AND Operator  --> &

Logical OR Operator --> ||
Bitwise OR Operator  --> |

Equal to vs Assignment Operator ---> "=" (assignment operator) vs "==" (equal to)

Logical Complement Operator --> NOT Operator (!)

Ternary Operator

Operator Recap and Operator Precedence: 
Sumary of Operators: [https://docs.oracle.com/javase/tutorial/java/nutsandbolts/opsummary.html]

instanceof [Type Comparison Operator]

bitwise AND
bitwise exclusive OR
bitwise inclusive OR


## Expressions, Statements, Code Blocks, Methods and more


## Keywords

IntelliJ highlights keywords in BLUE color
anything in a bracket is an "expression"


int myVariable = 50; // the whole line is a Statement, while the Expression is "myVariable = 50"
myVariable++; // Semicolon is required to make a Statement with some exceptions, and Statements do not have to be in one line


## if/else

Do not put a semicolon after IF statement, it will not execute

## Methods

Cannot create a method within another method

public static void calculateScore() {

}

public static : Always used
void : Do not send any value back (Don't return anything)
## Built-in functions

Math.round() --> Math is a built-in class that comes with Java to do mathematical calculations

psvm = IntelliJ Shortcut for public static void main(String[] args)


## Method Overloading

A feature that allows us to have more than one method with the same name, so long as we use different parameters.

It is the ability to create multiple methods of the same anme with different implemenatations, calls to an overloaded method will runa specific implementation of a method

Use same method name in different places with different parameters
Create a unique method signature, which is the method name and its parameters

To convert metrics:
https://www.metric-conversions.org/conversion-calculators.htm











