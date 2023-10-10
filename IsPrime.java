import java.util.Scanner;

public class IsPrime{
    public static void main(String[] args){
        int num;
        int count = 0;
        Scanner console = new Scanner(System.in);
        System.out.println("Enter a number");
        num = console.nextInt();
        for(int i = 2; i < num/2; i++){
            if(num % i == 0){
                count++;
                break;
            }

        }
        if(count == 0 && num != 1){
            System.out.println("The number is prime");
        }else{
            System.out.println("The number is not prime");
        }
    }
}
