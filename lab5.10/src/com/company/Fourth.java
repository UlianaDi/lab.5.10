package com.company;

public class Fourth {
    public static void main(String[] args){
        int i, f = 1;
        int n = 10;
        for (i = 1; i <= n; i = i+1){
            f =  f*i;}
        System.out.println("Факторіал десяти(1):" + f);
        //
        while(i <= n){
            f = f*i;}
        System.out.println("Факторіал десяти(2)" + f);
    }
}
