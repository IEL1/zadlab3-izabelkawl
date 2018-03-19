/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.POLab3;

import java.util.Scanner;

/**
 *
 * @author Asia
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Zadanie 1.4
        System.out.println("Zadanie 1.4");
        System.out.println("Podaj liczbę a:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Podaj potęge liczby 2:");
        int b = sc.nextInt();
        int iloczyn = a << b;// Mnożenie wykładników przez 2do n-tej potęgi
        int iloraz = a >> b;//int ponieważ liczby zapisywane sa w systemie binarnym
        int bez = a >>> b;
        System.out.println("Lewe przesunięcie ze znakiem: " + iloczyn);
        System.out.println("Prawe przesunięcie ze znakiem: " + iloraz);
        System.out.println("Prawe przesunięcie bez znaku: " + bez);

        System.out.println();
        // Zadanie 1.7

        System.out.println("Zadanie 1.7");
        byte k = (byte) 1111;
        byte m = (byte) 0101;
        byte xor = (byte) (k ^ m);// XOR Zwraca warość 0 jeżeli oba bity sa jednoczenie 0lub 1.        
        byte n = (byte) ~(k & m);//NOT negacja and
        System.out.println("Wynik: " + xor);
        System.out.println("Wynik: " + n);

        System.out.println();
        //Zadanie 2.2

        System.out.println("Zadanie 2.2");
        //char[] toCharArray()
        String tablo[] = {"Zadanie"};
        for (String tablo1 : tablo) {
            char[] zmiana = tablo1.toCharArray(); //odwołanie do konkretnego znaku,Możliwośc kopiowania, w tym przypadku zamiana znaków.
            char w = zmiana[0];
            zmiana[0] = zmiana[2];
            zmiana[2] = w;
            System.out.println(tablo1 + " - " + String.valueOf(zmiana));
        }
        //byte[] getBytes()
        String zdanie = "abcdef";
        byte[] e = zdanie.getBytes();//Metoda getBytes () zwraca tablicę bajtów ciągu
        for (int f = 0; f < e.length; f++) {
            System.out.println(e[f]);
        }
        //boolean equals(String str)
        //boolean reprezentuje dwie wartości, zwraca "true" lub "false", metoda equals() służy w Javie do porównywania
        System.out.println("Porównanie equals,wynik: " + "test".equals("test"));//prawda
        System.out.println("Porównanie equals,wynik: " + "testy".equals("test"));//fałsz
//boolean equalsIgnoreCase(String str)
//metoda ta porównuje ze sobą znaki ignorując wielkośc lietr
        String male = "abc";
        String duze = "ABC";
        System.out.println(male.equals(duze));//false 
        System.out.println(male.equalsIgnoreCase(duze));//true
//int campareTo(String str)
//Obiekt, który ma zostać porównany z tym wystąpieniem

//int campareToIgnoreCase(String str)
//int indexOf(int i)
//int indexOf(String str)
//int lastIndexOf(int i)
//int lastIndexOf(String str)
//String substring(int startString)
//String substring(int startString, int stopString)
//String replace(char orginal, char zamiennik)
//String trim()
//String toLowerCase()
//String toUpperCase()
//String[] split(String regex, int limit)
//String[] split(String regex)
//Zadanie 3.3
        //rekurencja
//Zadanie 3.4
        System.out.println("Ciąg Fibonacciego");
        int r, y = 1, p = 1;
        for (int v = 1; v > 0; v++) {
            r = y + p;//suma dwóch ostatnich liczb
            y = p;
            p = r;
            System.out.println(r);
        }
    }
}
