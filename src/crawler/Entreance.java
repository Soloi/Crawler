/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crawler;

import java.util.Scanner;

/**
 *
 * @author Daniel Palm
 */
public class Entreance {
    public static void run(){


        System.out.println("Det är en mörk och stormig natt, och du har gått vilse i en vidsträckt skog.\n"
                + "Men se där! Ett underligt fult hus, mitt i ödemarken.\n"
                + "Du skymtar en figur i vindsfönstret - kanske nån som vet vägen ut ur skogen! \n"
                + "När du kommer närmare ser du en skylt på ytterdörren: \n\n"
                + "\" VARNING! Huset spökar. Träd in på egen risk!\" \n\nTryck [a] enter för att träda in på egen risk. \n");
      
        //pause untill user presses enter, after that method ends
        Scanner input = new Scanner (System.in);  
        String whatever;
        whatever = input.next();
        
    }
    
}
