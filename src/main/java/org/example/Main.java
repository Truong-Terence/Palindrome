package org.example;

import java.util.Scanner;

// Créer un projet java qui demande à l'utilisateur de saisir un mot ou une phrase. Indiquez ensuite si la saisie est un Palindrome.
public class Main {
    public static void main(String[] args) {
        char ch;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir un mot ou une phrase :");
        String str = scanner.next();
        str += scanner.nextLine();

        System.out.println(str);

        String strNoBlanc = str.replaceAll("\\s+", "");
        System.out.println(strNoBlanc);
        String strNoBlancReverse = "";
        for(int i=0; i<strNoBlanc.length(); i++)
        {
            ch = strNoBlanc.charAt(i);
            strNoBlancReverse = ch + strNoBlancReverse;
        }
        if (strNoBlanc.equals(strNoBlancReverse)) {
            System.out.println("Votre saisie est un palindrome " + strNoBlanc + " <--> " + strNoBlancReverse);
        }else {
            System.out.println("Votre saisie n'est pas un palindrome " + strNoBlanc + " <--> " + strNoBlancReverse);
        }
    }
}