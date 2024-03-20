package ies.puerto.logica.facil;

/**
 *
 * @author josem
 */
public class FizzBuzz {
    
    public void Fizz(int numero){
        String resultado="";
        if (numero % 3 == 0 && numero % 5 == 0) {
                  resultado=("fizzbuzz");
            } else if (numero % 3 == 0) {
                resultado=("fizz");
            } else if (numero % 5 == 0) {
                resultado=("buzz");
        }
    }
}
