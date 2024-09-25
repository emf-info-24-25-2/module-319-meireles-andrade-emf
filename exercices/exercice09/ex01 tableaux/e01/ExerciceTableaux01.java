package e01; 
public class ExerciceTableaux01 {

    public static void main(String[] args) {
        
        int[] tableauEntier;
        tableauEntier = new int[3];
        
        tableauEntier[0] = 20;
        tableauEntier[1] = 21;
        tableauEntier[2] = 22;

        for(int i=0; i < tableauEntier.length; i++){
            System.out.println(tableauEntier[i]);
        }

        String[] tableauStrings;
        tableauStrings = new String[2];
        
        tableauStrings[0] = "Bonjour";
        tableauStrings[1] = "Bonsoir";

        for(int j = 0; j < tableauStrings.length; j++){
            System.out.println(tableauStrings[j]);

        }


        //le tableau string on doit mettre des mots ou lettres et le tableau Entier on peut mettre des numeros entiers
    }
}
