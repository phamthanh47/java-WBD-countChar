package com.company;

import java.util.Scanner;

class Main {
   public static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("nhap chuoi : ");
        String str=scanner.next();
        System.out.println("nhap ky tu : ");
        char c=scanner.next().charAt(0);

        countChar(str,c);
        System.out.println("so lan xuat hien cua ky tu "+c+" la "+ countChar(str,c));
    }
    public static int countChar(String str,char c){
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == c ){
               count++;
            }
        }
        return count;
    }
}
