package Controller;

import View.Main;

public class threadSapo extends Thread {

    private int distanciamax;
    private int distanciapulo;
    private int colocacao;
    private int numsapo;


    public threadSapo(int distanciamax, int distanciapulo, int colocacao, int numsapo){
        this.distanciamax= distanciamax;
        this.distanciapulo= distanciapulo;
        this.colocacao= colocacao;
        this.numsapo= numsapo;
    }

    @Override
    public void run() {
        corrida();
    }

    public void corrida(){
        int pulo= 0;
        int sapo= 0;

        while (sapo<distanciamax) {
            pulo = (int) (Math.random() * distanciapulo)+ 1;
            sapo+= pulo;
            System.out.println("O sapo " + numsapo + " pulou " + pulo + " metros e percorreu " + sapo + " metros");
        }
        System.out.println("O sapo "+ numsapo + " chegou ao final na "+ colocacao + " colocação");

    }
}
