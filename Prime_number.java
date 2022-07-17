package com.classAssignments;

import java.util.Scanner;

public class Prime_number {
    public static void main(String[] args) {
        int n,k=0;
        Scanner sc =new Scanner(System.in);
        n=sc.nextInt();
        for (int i=1;i<=n;i++){
            if (n%i==0)
                k+=1;
        }
        if (k==2)
            System.out.println(n+" is a prime number!");
        else
            System.out.println(n+" is not a prime number!");
    }
}
