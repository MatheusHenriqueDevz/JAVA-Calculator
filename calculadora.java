import java.util.Scanner;

public class calculadora{
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        boolean valid = true;
        int num1;
        int num2;
        int operation;
        try{

            while(valid){
                System.out.println("Welcome to JAVA calculator!");
                System.out.println();
                System.out.println("           Menu");
                System.out.println();
                System.out.println("Choise your operation");
                System.out.println();
                System.out.println("0 - Close");
                System.out.println("1 - Addition");
                System.out.println("2 - Subtraction");
                System.out.println("3 - Multiplication");
                System.out.println("4 - Division");
                System.out.println();

                System.out.print("Enter your operation: ");
                operation = scanner.nextInt();

                if (operation == 0){
                    System.out.println("Goodbye!");
                    valid = false;
                    break;
                }
                else {
                    System.out.print("Enter the first number: ");
                    num1 = scanner.nextInt();
                    
                    System.out.print("Enter the second number: ");
                    num2 = scanner.nextInt();
                }
                switch (operation) {
                    case 1:
                        System.out.println("Result: " + (num1+num2));
                        break;
                    case 2:
                        System.out.println("Result: " + (num1-num2));
                        break;
                    case 3:
                        System.out.println("Result: " + (num1*num2));
                        break;
                    case 4:
                        if (num2 != 0){
                            System.out.println("Result: " + (num1/num2));
                            break;
                        }
                        else{
                            System.out.println("Error! Division by zero is not allowed!");
                            break;
                        }
                    default:
                        System.out.println("Error! Invalid operation!");
                        break;
                }
            }
        }
        catch(Exception e){
            System.out.println("Error! Invalid input!");
        }
        finally{
            scanner.close();
        }
    }
}