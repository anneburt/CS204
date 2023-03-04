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
                    //TODO
                    System.out.println("add");
                    break;
                case "subtract":
                    //TODO
                    System.out.println("subtract");
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