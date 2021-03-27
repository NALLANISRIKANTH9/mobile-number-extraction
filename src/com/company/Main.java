package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
       /* Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number ");
        int n = sc.nextInt();
        System.out.println(fib(n));*/
       MobileNumberExtraction mn = new MobileNumberExtraction();
       mn.call();
    }
}
