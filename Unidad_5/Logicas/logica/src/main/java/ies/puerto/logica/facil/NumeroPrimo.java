package ies.puerto.logica.facil;

/**
 *
 * @author josem
 */
public class NumeroPrimo {
    //scribe un programa que se encargue de comprobar si un número es o no primo. 
    //Hecho esto, imprime los números primos entre 1 y 100

    public boolean numeroPrimmo(int n){
        boolean primo = true; 
        for(int i=2;i<n;i++) {
            if(n%i==0)
                return false;
        }
    return true;
    }
}
