package Controller;

public class threadSapo extends Thread {

    private int distanciamax;
    private int[] sapo= new int[5];

    public threadSapo(int distanciamax, int[] sapo){
        this.distanciamax= distanciamax;
        this.sapo= sapo;
    }

    @Override
    public void run() {
        corrida();
    }

    public void corrida(){
        int n=0;
        int salto= 0;
        int colocacao= 0;
        int contador= 0;
        for (int i=0; i<5; i++){
            if (sapo[i]<distanciamax) {
                salto = (int) (Math.random() * distanciamax);
                sapo[i] += salto;
                n= i + 1;
                System.out.println("O sapo número " + n + " pulou " + salto + " metros.");
                System.out.println("O sapo número "+ n +" já percorreu "+ sapo[i] + " metros");
                if(sapo[i]>= distanciamax) {
                    colocacao++;
                    System.out.println("O sapo número "+ n +" Chegou ao final na "+ colocacao + " colocação");
                }
            }
        }

    }
}
