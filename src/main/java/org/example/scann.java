package org.example;

import java.util.Scanner;

public class scann {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        System.out.println("hi"+Integer.valueOf(a).toString());
        scan.close();
    }


}
