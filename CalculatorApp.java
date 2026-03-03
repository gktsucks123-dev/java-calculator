import java.util.Scanner;
public class CalculatorApp {
    private Calculator calculator;
    private Scanner scanner;

    public CalculatorApp(){
        calculator= new Calculator();
        scanner= new Scanner(System.in);
    }
    private void displayMenu(){
        System.out.println("Welcome to the Calculator App!");
        System.out.println("Please select an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5.Modulus");
        System.out.println("6. Exit");
    }
    public void run(){
        boolean running = true;
        while(running){
            displayMenu();
            int choice = scanner.nextInt();
            if (choice == 6){
                running = false;
                System.out.println("Thank you for using the Calculator App. Goodbye!");
            }
            else if (choice>=1&& choice<=5){
                System.out.println("Enter the first number:");
                double num1= scanner.nextDouble();
                System.out.println("Enter the second number:");
                double num2= scanner.nextDouble();
                double result=0;
                
                if (choice==1){
                    result= calculator.add(num1,num2);
                    System.out.println("Result: "+result);
                }
                else if (choice==2){
                    result= calculator.subtract(num1,num2);
                    System.out.println("Result: "+result);
                }
                else if (choice==3){
                    result= calculator.multiply(num1,num2);
                    System.out.println("Result: "+result);
                }
                else if (choice==4){
                    try{
                        result= calculator.divide(num1,num2);
                        System.out.println("Result: "+result);
                    }catch(IllegalArgumentException e){
                        System.out.println(e.getMessage());
                    }
                    
                }
                else if (choice==5){
                    try{
                        result= calculator.modulus(num1,num2);
                        System.out.println("Result: "+result);
                    }
                    catch(IllegalArgumentException e){
                        System.out.println(e.getMessage());
                    }
            
            }

        }
     } 
}
    public static void main(String[] args){
        CalculatorApp app= new CalculatorApp();
        app.run();
    }

}

