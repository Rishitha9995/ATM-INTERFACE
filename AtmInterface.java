import java.util.Scanner;
class BankAccount {
    String Number,Name;
    double balance;
    BankAccount(String Number,String Name){
        this.Number = Number;
        this.Name = Name;
        balance = 100000;
    }
    public void withdraw(double amount){
        if(amount <= balance){
            balance -= amount;
            System.out.println("Withdraw Successful");
        }
        else{
            System.out.println("Withdraw UnSuccessful, Insufficient Balance");
        }
    }
    public void deposit(double amount){
        balance += amount;
        System.out.println("Deposit Successful");
    }
    public double checkBalance(){
        return balance;
    }
}
public class AtmInterface {
    public static void main(String[] args) {
            int choice;
            Scanner sc = new Scanner(System.in);
            System.out.printf("Enter Bank Account Number: ");
            String Number = sc.nextLine();
            System.out.printf("Enter User Name: ");
            String Name = sc.nextLine();
            BankAccount ob = new BankAccount(Number,Name);
            System.out.println("0 - Exit");
            System.out.println("1 - Withdraw");
            System.out.println("2 - Deposit");
            System.out.println("3 - Check Balance");
            do {
                System.out.print("Enter your choice: ");
                choice = sc.nextInt();
                switch(choice){
                    case 0 :
                        System.out.println("Thank you for Visiting!");
                        break;
                    case 1 :
                        System.out.printf("Enter amount to be withdrawn: ");
                        double amount  = sc.nextDouble();
                        ob.withdraw(amount);
                        break;
                    case 2 :
                        System.out.printf("Enter amount to be deposited: ");
                        double sum  = sc.nextDouble();
                        ob.deposit(sum);
                        break;
                    case 3 :
                        System.out.println("Balance Amount is: "+ob.checkBalance());
                        break;
                    default :
                        System.out.println("Invalid!,Please enter a valid choice.");
                }
            }while(choice !=0);
    }
}


