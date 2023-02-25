package AsalSayi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int num = scan.nextInt();
        boolean isPrime = true;

        for (int i=2; i<num; i++){
            if (num%i==0){
                isPrime = false;
                break;
            }
        }
        if (isPrime){
            System.out.println(num + " sayısı asaldır.");
        }else {
            System.out.println(num + " sayısı asal değildir.");
        }
    }
}

