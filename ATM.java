package repo4;

import java.util.Scanner;

public class ATM {
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
        if (inputPin.equals(pin)) ;{//writing process to do if the user inputs the correct pin
            System.out.println("Welcome " + Username);
            System.out.println("What would you like do today?");
            System.out.println("1. Withdraw");
            System.out.println("2. Check Balance");
            System.out.println("3. Transfer funds");
            System.out.println("4. Buy airtime");
            System.out.println("5. Change pin");
            String userOption = reader.nextLine();
            if (userOption.equals("1")) {//if the user chooses option 1
                System.out.println("Enter an amount");
                double withdrawalAmount = reader2.nextDouble();
                if (withdrawalAmount <= accountBal) {//if the withdrawal amount is less than the account balance code should proceed
                    System.out.println("Withdrawal Successful");
                    System.out.println("Collect your $ " + withdrawalAmount);
                    accountBal -= withdrawalAmount;//then the account balance will have a new balance
                } else {
                    System.out.println("Insufficient Balance");
                }
            } else if (userOption.equals("2")) {//if the user selects option 2
                System.out.println("Your new account balance is " + accountBal);//print
            } else if (userOption.equals("3")) {
                System.out.println("Enter recipients account number");
                String recipientsAccount = reader2.nextLine();
                if (recipientsAccount.length() == 10) {
                    System.out.println("Enter amount");
                    double transferAmount = reader3.nextDouble();
                    if (transferAmount <= accountBal) {

                    } else {

                    }
                } else {

                }
            } else if (userOption.equals("4")) {//if the user input option 4
                System.out.println("Enter Phone number");
                String phoneNumber = reader3.nextLine();
                if ((phoneNumber.startsWith("0") || phoneNumber.startsWith("+"))
                        && (phoneNumber.length() == 11 || phoneNumber.length() == 14)) {
                    System.out.println("Enter amount");
                    double airtimeAmount = reader4.nextDouble();
                    if (airtimeAmount <= accountBal) {
                        System.out.println("Airtime sent successfully");
                    }
                } else {
                    System.out.println("invalid phone number");
                }
            } else if (userOption.equals("5")) {
                System.out.println("Confirm old pin");
                String oldPinCheck = reader4.nextLine();
                if (oldPinCheck.equals(pin)) {
                    System.out.println("Enter new pin");
                    String newPin1 = reader5.nextLine();
                    System.out.println("Confirm new pin");
                    String newpin2 = reader5.nextLine();
                    if (newPin1.equals(newpin2)) {
                        pin = newPin1;
                        System.out.println("Pin changed sucessfully");
                        System.out.println("Your new pin is ***" + pin.charAt(-1));
                    }
                } else {
                    System.out.println("Incorrect old pin");
                }
        }
        else {
            System.out.println("Incorrect Pin");
            }
        }
    }
}