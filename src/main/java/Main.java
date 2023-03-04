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
                    //TODO
                    System.out.println("multiply");
                    break;
                case "divide":
                    //TODO
                    System.out.println("divide");
                    break;
                case "fibonacci":
                    //TODO
                    System.out.println("fibonacci");
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