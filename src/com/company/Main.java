package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Not Hesaplama
        Scanner scanner=new Scanner(System.in);
        System.out.print("Vize 1 notunuzu giriniz :");
        int a=scanner.nextInt();
        System.out.print("Vize 2 notunuzu giriniz :");
        int b=scanner.nextInt();
        System.out.print("Final notunuzu giriniz :");
        int c=scanner.nextInt();
        System.out.print("Okul ortalamanızı giriniz :");
        double ort=scanner.nextDouble();

        double toplam=a*(3/10.0)+b*(3/10.0)+c*(4/10.0);
        if (toplam>=90)
        {
            System.out.println("Harf notunuz AA");
        }
        else if (toplam>=85)
        {
            System.out.println("Harf notunuz BA");
        }
        else if (toplam>=80)
        {
            System.out.println("Harf notunuz BB");
        }
        else if (toplam>=75)
        {
            System.out.println("Harf notunuz CB");
        }
        else if (toplam>=70)
        {
            System.out.println("Harf notunuz CC");
        }
        else if (toplam>=65)
        {
            System.out.println("Harf notunuz DC");
        }
        else if (toplam>=60)
        {
            System.out.println("Harf notunuz DD");
            if (ort<2.50)
            {
                System.out.println("DD aldınız bu dersi tekrar almayı düşünebilirsiniz ");
            }
        }
        else if (toplam>=55)
        {
            System.out.println("Harf notunuz FD ");
        }
        else
        {
            System.out.println("Harf notunuz FF kaldınız");
        }
    }
}
