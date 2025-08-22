import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import com.training.service.Calculator;

public class RMIClient {
    public static void main(String[] args) {
        try {
            // Get registry (same machine: localhost)
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);

            // Look up the remote object
            Calculator calculator = (Calculator) registry.lookup("CalcService");

            // Invoke remote methods
            System.out.println("10 + 20 = " + calculator.add(10, 20));
            System.out.println("50 - 15 = " + calculator.subtract(50, 15));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
