import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("input 5 numbers ()");
        int number =sc.nextInt();
        int A=number/10000;
        int B=(number/1000)%10;
                int C =(number%1000)/100;
                        int D=(number%100)/10;
                                int E=number%10;
                                System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        System.out.println(D);
        System.out.println(E);


    }
}
