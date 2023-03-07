package View;

import Controller.threadSapo;

public class Main {
    public static void main(String[] args) {
        int distanciamax= (int) (Math.random()*100) + 1;
        int sapo[]= new int[5];

        System.out.println("Distancia Máxima: "+distanciamax);

        while (sapo[0]<distanciamax || sapo[1]<distanciamax || sapo[2]<distanciamax || sapo[3]<distanciamax || sapo[4]<distanciamax) {
            threadSapo salto = new threadSapo(distanciamax, sapo);
            salto.start();
        }


    }
}
