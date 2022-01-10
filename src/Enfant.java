import java.rmi.RemoteException;

public class Enfant extends Thread {
    private String nameEnfant;
    private InterfaceMethods d;

    public Enfant(String nameEnfant, InterfaceMethods d) {
        this.nameEnfant = nameEnfant;
        this.d = d;
    }

    @Override
    public void run() {
        try{
            for (int i = 0; i < 10; i++) {
                synchronized (d) {
                    while (d.Empty()) {
                        System.out.println("Distributeur Vide, attente de l'ajout des agents");
                        try {
                            d.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    d.retirer();
                    System.out.println("Jeu retiré par l'enfant numero: " + i);
                    d.notifyAll();
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        }

}




