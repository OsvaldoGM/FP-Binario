/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fp.numerobinario;
import java.util.*;
/**
 *
 * @author Alumno
 */
public class FPNumeroBinario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        String r;
        n = pedirNumero();
        r = calcularBin(n);
        muestraBin(r);
    }
    public static int pedirNumero(){
        int n;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Intrdouzca el numero que quiere convertir a binario ");
        return n=entrada.nextInt();
        /*
        Random numAleatorio = new Random();
        a = numAleatorio.nextInt();
        */
    }
    public static String calcularBin(int n){
        String r="";
        int residuo=0;
        while(n!=0){
            residuo=n%2;
            n=n/2;
            r = r + residuo;   
                }
        return r;
    }
    public static void muestraBin(String b){
        char cad[];
        int a=0;
        cad = b.toCharArray();
        b="";
        a = cad.length-1;
        while(a>0){
            b=b+cad[a];
            a--;
        }
        System.out.println("El numero binario es :  "  +b);
    }
}
