import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        int sayi = scanner.nextInt();
        

        if (sayi<2){
            System.out.println("Incalid number");
            return;
        }

        boolean asalMı = true;

        for (int i = 2;i < sayi; i++){
            if (sayi % i == 0){
                asalMı = false;
                break;
            }
        }

        if(asalMı){
            System.out.println("The number is prime.");
        }else{
            System.out.println("The number is not prime.");
        }

        scanner.close();





    }

}