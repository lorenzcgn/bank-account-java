/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interrogazione;

import java.util.Scanner;
import java.io.*;
import java.util.*;

/**
 *
 * @author 75844087
 * Conto è un oggetto: somma presso la banca (saldo(), preleva(), versa() con menu)
 */
public class Interrogazione {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
        System.out.println("Il tuo conto inizialmente a quanto ammonta");
        int importoiniziale=s.nextInt();
        conto p1=new conto(importoiniziale);
                
        System.out.println("Cosa vuoi fare? Per visualizzare il conto premi 1, per prelevare premi 2, per versare premi 3");
        int t=1;
        do{
        int l;
        do {
          l=s.nextInt();
        }
        while(0<l && l>3);

        switch (l) {
        case 1:  l = 1;
                p1.saldo();
                 break;
        case 2:  l = 2;
        System.out.println("Inserisci l'importo da prelevare");
                int imppreleva=s.nextInt();
                p1.preleva(imppreleva);
                 break;
        case 3:  l = 3;
        System.out.println("Inserisci l'importo da versare");
                int impversa=s.nextInt();
                p1.versa(impversa);
                 break;
        }
        System.out.println("Hai finito? Premi 0 se hai finito, 1 se vuoi fare altre operazioni");
        int scelta=s.nextInt();
        t=scelta;
        }while(t>=1);

    }

  
    
}
