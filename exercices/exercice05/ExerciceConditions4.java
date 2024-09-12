public class ExerciceConditions4 {

    public static void main(String[] args) {
        int temperature = 2;
    
                if (temperature < -10) {
                        System.out.println("Il très fait froid");
                    
                } else if (temperature >= -10 && temperature
                 < 0 ) {
                            System.out.println("Il fait froid");
                }else if (temperature >= 0 && temperature < 25) {
                    System.out.println("Il fait normal.");
                } else {
                    System.out.println("La température est supérieure ou égale à 25 °C.");
                }
        
    }
}