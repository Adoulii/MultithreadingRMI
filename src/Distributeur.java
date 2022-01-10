import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

public class Distributeur extends UnicastRemoteObject implements InterfaceMethods {
    private String namejouet;
    private final int max = 20;
    private int nbjouet;

    public Distributeur(int nbjouet) throws RemoteException {
        super();
        this.nbjouet = nbjouet;

    }

    public int getNbjouet() {
        return nbjouet;
    }

    public boolean fullMax() {
        return getNbjouet() == max;
    }

    public boolean notFullMax() {
        return getNbjouet() < 20;
    }

    public boolean notEmpty() {
        return getNbjouet() > 0;
    }

    public boolean Empty() {
        return getNbjouet() == 0;
    }

    public void ajouter() {
        this.nbjouet++;
    }

    public void retirer() {
        this.nbjouet--;
    }

}
