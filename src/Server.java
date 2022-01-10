import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class Server {
    public static void main(String[] args) throws RemoteException, MalformedURLException {
        Distributeur d = new Distributeur(0);
        LocateRegistry.createRegistry(1500);
        Naming.rebind("rmi://127.0.0.1:1500/Test",d);
        System.out.println("Attente des invocations des clients.");

    }
}
