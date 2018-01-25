package com.prezydium;

import java.util.Scanner;

public class Main {

    public static int a, b, c, x;

    public static void main(String[] args) {


        MathSymbol symbol;

	    Scanner sc = new Scanner(System.in);
	    do {
            System.out.println("What operation do you want to preform (1. ADD, 2. SUBTRACT, 3. MULTIPLY, 4. DIVIDE)");
            x = sc.nextInt();
        } while (x<1 || x >4);

	    symbol = MathSymbol.values()[x];

        System.out.println("How many numbers will be used?");
        b = sc.nextInt();
        int[] table = new int[b];

        System.out.println("Enter those numbers: ");

      for (int i = 0; i < b; i++) {
          table[i] = sc.nextInt();
      }

        /*
        Test method displaying all entered numbers
         */
        for (int i = 0; i < b; i++) {
            System.out.println(table[i]);
        }

        System.out.println("And the result is: ");
        if(symbol == MathSymbol.ADD){
            c = resultAdd(table);
            System.out.println(c);
        }

    }


    public static int resultAdd (int[] table){
        int z = 0;
        for (int i = 0; i < b; i++) {
            z = z + table[i];
        }

        return z;
    }

    /*

    Kolejne zadanKO:

- stwórz enum oznaczający operacje matematyczne (+,-,*,/)
- wyświetla na ekranie dostępne opcje w formacie
    1. dodawanie
    2. odejmowanie
    ...
- pobierz opcję z klawiatury
    - jeżeli taki enum nie istnieje to pobierz kolejny raz, dopóki nie zostanie podany poprawny
- pobierz z klawiatury ilość parametrów, którę będą poddawane działaniom
- pobierz tyle liczb ile podano powyżej
- na tych liczbach wykonaj operację wybraną na początku
- wyświetl całe działanie
- wyświetl wynik

przykład:
1. dodawanie
2. odejmowanie
3. mnożenie
4. dzielenie
Wybierz operację: 1
Podaj ilość liczb: 3
Podaj liczby:
1
2
4
Operacja: 1 + 2 + 4
Wynik: 7

    */

}
