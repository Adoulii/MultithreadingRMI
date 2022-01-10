import java.rmi.Remote;
import java.rmi.RemoteException;

public interface InterfaceMethods extends Remote {
    public void ajouter() throws RemoteException;
    public void retirer() throws RemoteException;
    public boolean Empty() throws RemoteException;
    public boolean fullMax() throws RemoteException;
    public int getNbjouet() throws RemoteException;
}
