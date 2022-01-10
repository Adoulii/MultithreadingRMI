import java.rmi.RemoteException;

public class Agent extends Thread {
    private String nameAgent;
    //private Distributeur d;
    private InterfaceMethods d;


    public Agent(String nameAgent, InterfaceMethods d) {
        this.nameAgent = nameAgent;
        this.d = d;
    }

    @Override
    public void run() {
        try{
            for (int i = 0; i < 2; i++) {
                synchronized (d) {
                    while (d.fullMax()) {
                        try {
                            d.wait();
                            System.out.println("Distributeur Complet");

                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                    }
                    d.ajouter();
                    System.out.println("Jeu numero " + d.getNbjouet() + " ajouté par l'agent " + nameAgent);
                    d.notifyAll();
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        }

}


