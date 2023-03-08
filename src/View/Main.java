package View;

import Controller.threadSapo;

public class Main {
    public static void main(String[] args) {
        int distanciamax= 20;
        int distanciapulo= 5;
        int colocação= 1;
        int numsapo= 1;

        System.out.println("Distancia Máxima: "+distanciamax);

        for (int i=0; i<5; i++){
            threadSapo sapo = new threadSapo(distanciamax, distanciapulo, colocação, numsapo);
            sapo.start();
            colocação++;
            numsapo++;
        }





    }
}
