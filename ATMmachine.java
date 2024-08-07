import java.util.*;

class ATM {

    float Balance;
    int pin = 1234;

    public void checkpin(){
        System.out.println("Enter Your Pin : ");
        Scanner sc = new Scanner(System.in);
        int enteredpin = sc.nextInt();
        if(enteredpin==pin){
            menu();
        }
         else {
            System.out.println("Enter a valid pin");
            menu();
        }
    }
     
    public void menu(){
        System.out.println("Enter Your Choice : ");
        System.out.println("1. Check A/C Balance ");
        System.out.println("2. Withdraw Money ");
        System.out.println("3. Deposit Money ");
        System.out.println("4. Exit ");

        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();

        if(option == 1){
            checkBalance();
        }
        else if(option == 2){
            WithdrawMoney();
        }
        else if(option == 3){
            DepositMoney();
        }
        else if(option== 4){
            return;
        }
        else{
            System.out.println("Enter a valid choice : ");
        }
        
    }

    public void checkBalance(){
        System.out.println("Balance: " + Balance);
        menu();
    }

    public void  WithdrawMoney(){
        System.out.println("Enter Amount to Withdraw: ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        if(amount > Balance){
            System.out.println("InSufficient Balance");
        }
        else{
            Balance = Balance - amount;
            System.out.println("Money withdrawl successfully");
        }
        menu();
    }

    public void DepositMoney(){
        System.out.println("Enter the Amount: ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        Balance = Balance + amount;
        System.out.println("Money deposit successfully");
        menu();
    }

}

public class ATMmachine{
    public static void main(String[] args){
  
        ATM obj = new ATM();
        obj.checkpin();
    }
}