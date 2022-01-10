import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class main {
    public static void main(String[] args) throws RemoteException, MalformedURLException, NotBoundException {
        InterfaceMethods d = (InterfaceMethods) Naming.lookup("rmi://127.0.0.1:1500/Test");
        Agent a1 = new Agent("agent", d);
        Enfant test = new Enfant("test", d);
        a1.start();
        test.start();


    }
}
