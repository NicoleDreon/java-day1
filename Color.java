import java.util.Scanner;

class Color {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("What is your favorite color?");

    String color = input.nextLine();  // Get user input
    System.out.println("Nice, I like " + color + " too");
  }
}

// There are type declarations before each new variable (String, Scanner, etc.)

// This is an object, and it has a lot of similarities to Python classes

// There are a bunch of words (public static void) before the name of the method (main())

// In the parameter space, it seems you also have to declare the type of the parameters

// Lots of semicolons to finish all lines

// Lots of curly braces

// Import statements also look similar to Python

// String concatenation is similar to (one way to do it) in Python