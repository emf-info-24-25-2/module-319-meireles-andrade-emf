package ex02;

import java.util.Random;

class exerciceTableaux02 {

    public static void main(String[] args) {
        
        int[] tableauStrings;
        tableauStrings = new int[10];
    
        Random valeurAleatoire = new Random();
        
       for (int i = 0; i < tableauStrings.length; i++) {
        tableauStrings[i] = valeurAleatoire.nextInt(6) + 1;

    }

    for (int i = 0; i < tableauStrings.length; i++){
        System.out.println("Cellule " + i + " : " + tableauStrings[i]);
    
    }
}}