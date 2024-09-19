package ex03;
 public class exerciceTableaux03 {
 
    public static void main(String[] args) {

                
        int[] tableauNotes;
        tableauNotes = new int[10];
        
        Random notes = new Random();
                
        for (int i = 0; i < tableauNotes.length; i++) {
        tableauNotes[i] = notes.nextInt(6) + 1;
        
        }
        
        for (int i = 0; i < tableauNotes.length; i++){
                System.out.println("Notes élève " + i + " : " + tableauNotes[i]);
            
        }
    

    }
 }