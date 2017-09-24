/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gcd;

import java.util.Scanner;

/**
 *
 * @author tripi
 */
public class GCD {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(true)
        {
        System.out.println("Geben Sie bitte zwei Zahlen ein von denen Sie den größten Gemeinsamenteiler wissen wollen.");
        System.out.print("Zahl1: ");
        int nr1 = scan.nextInt();
            
        System.out.print("Zahl2: ");
        int nr2 = scan.nextInt();
        
        gcdPrimeFactors(nr1,nr2);
        gcdEucledian(nr1,nr2);
          
        }
    }
    
    public static void gcdPrimeFactors(int nr1, int nr2)
    {
        int gcd = 1;
        int[] divNr1 = new int [50];
        int[] divNr2 = new int[50];
        int counterForArrayPos1 = 0 , counterForArrayPos2 = 0;
        
        for(int i = 1; i <= nr1 && i <= nr2; i++)
        {
            if(nr1%i == 0)
            {
                divNr1[counterForArrayPos1] = i;
                counterForArrayPos1++;
            }
            if(nr2%i == 0)
            {
                divNr2[counterForArrayPos2] = i;
                counterForArrayPos2++;
            }
        }
        
        if(counterForArrayPos1 > counterForArrayPos2)
        {
            for(int i = 0; i < counterForArrayPos2; i++)
            {
                for(int j = 0; j <= counterForArrayPos1;j++)
                {                   
                    if(divNr2[i] == divNr1[j])
                    {
                        gcd = divNr2[i];
                    }
                }
            }
        }
        else
        {
            for(int i = 0; i < counterForArrayPos1; i++)
            {
                for(int j = 0; j <= counterForArrayPos2;j++)
                {                   
                    if(divNr1[i] == divNr2[j])
                    {
                        gcd = divNr1[i];
                    }
                }
            }
        }
        System.out.println("[PrimeFactors]: "+gcd +" ist der Größtegemeinsameteiler.");      
        
    }
    
    public static void gcdEucledian (int nr1, int nr2)
    {
        while(nr1 != nr2)
        {
            if(nr1 > nr2)
            {
                nr1 = nr1 - nr2;
            }
            else
            {
                nr2 = nr2 - nr1;
            }
        }
        System.out.println("[Eucledian]: "+nr1 +" ist der Größtegemeinsameteiler.\n");
    }
    
}
