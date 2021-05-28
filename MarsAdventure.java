import java.util.Scanner;

class MarsAdventure {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("What is your name?");

    String name = input.nextLine();
    System.out.println("Hello " + name + " are you ready for your adventrue to Mars?");

    String answer = input.nextLine();
    System.out.println("Great! What's color do you want space suite to be?");

    String color = input.nextLine();
    System.out.println("Ooo, " + color + " will really pop on Mars. Who will you bring with you?");

    String friend = input.nextLine();
    System.out.println("Excellent, we'll get " + friend + " a matching space suit!");
  }
}