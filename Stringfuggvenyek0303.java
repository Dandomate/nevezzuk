
package stringfuggvenyek0303;

import java.util.Scanner;
public class Stringfuggvenyek0303 {

    
    public static void main(String[] args) {
        String elvalaszto="<---------------------------------------------------------------->";
        
        
        System.out.println(elvalaszto);
        
        
        System.out.println("\tMűveletek stringekkel");
        
        
        System.out.println(elvalaszto);
        
        
        Scanner bemenet= new Scanner(System.in);
        System.out.print("Add meg a neved: ");
        String sajatNev=bemenet.nextLine();
        System.out.println(elvalaszto);
        System.out.print("Adj meg egy keresztnevet: ");
        String kNev=bemenet.nextLine();
        
        
        System.out.println(elvalaszto);
        
        
        System.out.println("Nagybetűs írásmód: "+sajatNev.toUpperCase());
        System.out.println(elvalaszto);
        
        System.out.println("Szókezdők nagybetűsek: ");
        System.out.println(elvalaszto);
        
        System.out.println("Név kisbetűkkel: "+sajatNev.toLowerCase());
        System.out.println(elvalaszto);
        
        System.out.println("Hány karakterből áll a neved?: "+sajatNev.length());
        System.out.println(elvalaszto);
        
        int szokozindex1 = sajatNev.indexOf(' ');
        System.out.println("A névben az 1.  szóköz helye: "+szokozindex1);
        System.out.println(elvalaszto);
        
        int szokozindex2 = sajatNev.indexOf(' ');
        System.out.println("A névben a 2. szóköz helye: "+szokozindex2);
        System.out.println(elvalaszto);
        
        String[] parts = sajatNev.split(" ");
        String kvNev = parts[0];
        String kkNev = parts[1];
        System.out.println("1. keresztnév kezdő pozíciója: ");
        System.out.println(elvalaszto);
        
        System.out.println("2. keresztnév kezdő pozíciója: ");
        System.out.println(elvalaszto);
        
        System.out.println("Vezetékneved: "+kvNev);
        System.out.println(elvalaszto);
        
        System.out.println("Keresztneved : "+kkNev);
        System.out.println(elvalaszto);
        
        System.out.println("Vezetékneved hossza: "+kvNev.length());
        System.out.println(elvalaszto);
        
        System.out.println("Keresztneved hossza: "+kkNev.length());
        System.out.println(elvalaszto);
        
        System.out.println("Névegyesítés (vezetéknév+keresztnév): ");
        System.out.println(elvalaszto);
        
        System.out.println("Új név: ");
        System.out.println(elvalaszto);
        
        System.out.println("Monogram: ");
        System.out.println(elvalaszto);
        
        
        bemenet.close();
    }
    
}