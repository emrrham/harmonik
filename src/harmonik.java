 import java.util.Scanner;
public class harmonik {
    public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.println("n sayısını girin : ");
        double result = 0.0 ;
    int n = s.nextInt();
    for (int i = 1; i <=n; ++i){
    result += (1.0/i);
    }

    System.out.println(result);
    }



}
