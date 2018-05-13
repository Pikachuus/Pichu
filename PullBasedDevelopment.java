/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pullbaseddevelopment;

/**
 *
 * @author sato
 */
import java.util.Scanner;
public class PullBasedDevelopment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Dadu dadu = new Dadu();
       
        
       
        System.out.println("Selamat datang di program lempar dadu");
        Scanner reader = new Scanner(System.in);
        System.out.print("Masukkan jumalh lemparan : ");
        int n = reader.nextInt();
        reader.close();
        
        for(int i =0; i<n; i++){
           System.out.println("Hasil lemparan dadu : \n"+dadu.toString());
       }
               
       
        
    }
    
}
