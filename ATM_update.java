package repo4;

import java.util.Scanner;

public class ATM_update {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in); //i am creating a
        Scanner reader2 = new Scanner(System.in);
        Scanner reader3 = new Scanner(System.in);
        Scanner reader4 = new Scanner(System.in);
        Scanner reader5 = new Scanner(System.in);
        String Username = "Stanley";
        double accountBal = 500000000; //creating the available balance in the account
        String pin = "1914"; //creating the default pin
        System.out.println("Input your pin"); // asking the user to input pin
        String inputPin = reader.nextLine(); //allows the user to input the pin
        System.out.println("Authenticating..........");
        if (inputPin.equals(pin)) ;
        {//writing process to do if the user inputs the correct pin
            System.out.println("Welcome " + Username);
            System.out.println("What would you like do today?");
            System.out.println("1. Withdraw");
            System.out.println("2. Check Balance");
            System.out.println("3. Transfer funds");
            System.out.println("4. Buy airtime");
            System.out.println("5. Change pin");
            String userOption = reader.nextLine();
            switch (userOption) {
                case "1" -> {
                    System.out.println("Enter an amount");
                    double withdrawalAmount = reader2.nextDouble();
                    if (withdrawalAmount <= accountBal) {//if the withdrawal amount is less than the account balance code should proceed
                        System.out.println("Withdrawal Successful");
                        System.out.println("Collect your $ " + withdrawalAmount);
                        accountBal -= withdrawalAmount;
                    } else {
                        System.out.println("Insufficient Balance");
                    }
                }
                case "2" -> {
                    System.out.println("Your new account balance is " + accountBal);
                }
                case "3" ->{

                }
            }
        }
    }
}