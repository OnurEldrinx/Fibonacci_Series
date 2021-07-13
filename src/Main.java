import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int previous,next,currentResult,N;

        System.out.print("How many numbers do you want to see: ");
        N = scanner.nextInt();

        previous = 0;
        next = 1;

        System.out.println("*********************************************************************************************");
        System.out.print("Fibonacci Series with "+N+" elements: 0 1 ");

        for (int i=2;i<N;i++){

            currentResult = previous + next;

            System.out.print(currentResult + " ");

            previous = next;

            next = currentResult;



        }
        System.out.println("\n*********************************************************************************************");










    }
}
