package Exercise11;

import java.util.Map;

public class FinalGrades {
    public static void main(String[] args) {
       Map<String, Integer> oldGrades=TestResults.getOriginalGrades(); //Richiama la prima mappa
       Map<String, Integer> newGrades=TestResults.getMakeUpGrades(); //Richiama la seconda mappa

        //Scegli la mappa da trasformare in set per il loop
       for(var student:newGrades.entrySet()){
           Integer firstGrades= oldGrades.get(student.getKey()); //Prendi i valori dei voti per ogni studente dalla prima mappa
           Integer secondGrades= newGrades.get(student.getKey()); //Prendi i valori dei voti per ogni studente dalla seconda mappa

           if (secondGrades > firstGrades) { //confronta i valori
               oldGrades.put(student.getKey(), secondGrades); //sovrascrivi (put) nella prima mappa se il secondo valore è più alto
           }
       }

       oldGrades.forEach((
               studente, voto
               )->System.out.println("Student:"+studente+" Grade:"+voto));
    }


}
