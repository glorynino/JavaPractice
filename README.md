# JavaPractice
*this exercice is for parctise in exception*
# exercice 1 : 
Create a program that prompts the user to enter an integer. If the user enters a
non-integer value, catch the exception and display an appropriate error message.
Keep prompting the user until a valid integer is entered.
For example, if the user enters ”abc” instead of an integer, the program should
display an error message like ”Invalid input. Please enter a valid integer.” and
prompt the user again.



# exercice 2 :
Write a program that reads a file named ”input.txt” and counts the number of
lines in the file. If the file doesn’t exist, catch the exception and display an error
message. If the file exists but is empty, display a message indicating that the file
is empty.
Consider the following scenarios:
- If the file ”input.txt” does not exist in the current directory, the program
should display an error message like ”File not found: input.txt”.
- If the file ”input.txt” exists but is empty, the program should display a
message like ”The file is empty.”
- If the file ”input.txt” exists and contains lines of text, the program should
display the number of lines in the file, for example, ”Number of lines in the 
f
ile: 10”
# exercice 3 :
Implement a custom exception called ”InvalidMatrixException”. Create a method
that takes a 2D integer array as input and throws an InvalidMatrixException if
the array is not a square matrix (i.e., the number of rows and columns are not
equal). The method should return the sum of all elements in the matrix if it is a
valid square matrix.
In the main method, prompt the user to enter the number of rows and columns
for a matrix. Create a 2D integer array of the specified size and fill it with user
input values. Use the custom method to calculate the sum of the matrix elements
and display the result. Handle the InvalidMatrixException and display an appro
priate error message telling the user how many rows they should add/remove of
the matrix in order to be square.
