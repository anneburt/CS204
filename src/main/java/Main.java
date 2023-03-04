import java.util.Scanner;

class Main {

    public static void main(String args[]) {
        System.out.println("Welcome to the Calculator! (type \"quit\" to exit);");

        Scanner scanner = new Scanner(System.in);

        while(true) {
            String input = scanner.nextLine();
            String[] splitInput = input.split("\\s+");

            switch (splitInput[0]) {
                case "add":
                    System.out.println(Calculator.add(
                            Integer.parseInt(splitInput[1]),
                            Integer.parseInt(splitInput[2])));
                    break;
                case "subtract":
                    System.out.println(Calculator.subtract(
                            Integer.parseInt(splitInput[1]),
                            Integer.parseInt(splitInput[2])));
                    break;
                case "multiply":
                    System.out.println(Calculator.multiply(
                            Integer.parseInt(splitInput[1]),
                            Integer.parseInt(splitInput[2])));
                    break;
                case "divide":
                    System.out.println(Calculator.divide(
                            Integer.parseInt(splitInput[1]),
                            Integer.parseInt(splitInput[2])));
                    break;
                case "fibonacci":
                    System.out.println(Calculator.fibonacciNumberFinder(
                            Integer.parseInt(splitInput[1])));
                    break;
                case "binary":
                    //TODO
                    System.out.println("binary");
                    break;
                case "quit":
                    return;
                default:
                    System.out.println("Invalid command");
            }
        }
    }
}