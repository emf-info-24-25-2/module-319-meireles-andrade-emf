public class ExerciceBoucles1 {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue; 
            }
            System.out.println("Boucle for, itération " + i);
        }    

        System.out.println(); 

        int m = 1;
        while (m <= 5) {
            System.out.println("Boucle while, itération " + m);
            if (m == 3) {
                break; 
            }
            m++;
        }
        
        System.out.println(); 
        
        int k = 1;
            do {
                System.out.println("Boucle do-while, itération " + k);
                k++;
            } while (k <= 5);
       

    }
}



