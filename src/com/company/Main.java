package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int tarih,mat,fizik,kimya,turkce;
        Scanner scanner =new Scanner(System.in);
        System.out.print("Tarih notunu giriniz:");
        tarih = scanner.nextInt();
        System.out.print("Matematik notunu giriniz:");
        mat = scanner.nextInt();
        System.out.print("Fizik notunu giriniz:");
        fizik=scanner.nextInt();
        System.out.print("Kimya notunu giriniz:");
        kimya=scanner.nextInt();
        System.out.print("Türkçe notunu giriniz:");
        turkce=scanner.nextInt();
        double sonuc= (tarih+mat+fizik+kimya+turkce)/6.0;
        System.out.print("Ortalamanız: "  + sonuc);
        boolean gecti = sonuc>=60;
        boolean kaldı = sonuc<=60;
        boolean sonuc2 = gecti;
        String str = (sonuc2) ? " GEÇTİNİZ TEBRİKLER": " KALDINIZ DAHA ÇOK ÇALIŞINIZ";
        System.out.println(str);
    }
}
