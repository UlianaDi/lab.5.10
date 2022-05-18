package com.company;

public class First {
    public static void main(String[] args) {
    for (int n = 500; n <= 650; n += 10) {
        System.out.print(n + " ");}
        //просто щоб вони не були в одному рядку даю нижній рядочок
        System.out.println();
       //зразу не даю println бо дуже довгий стовпець і незручно переглядати
        int i = 500;
        while (i <= 650) {
            System.out.print(i + " ");
            i = i+10;}
        //
        System.out.println();
        //
        int m = 500;
        do {
            System.out.print(m + " ");
            m = m+10;
        }while (m <= 650);}
    }

