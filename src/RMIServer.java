import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import com.training.service.Calculator;
import com.training.service.impl.CalculatorImpl;

public class RMIServer {
    public static void main(String[] args) {
        try {
            // Create remote object
            Calculator calculator = new CalculatorImpl();

            // Start the RMI registry on port 1099 (default)
            Registry registry = LocateRegistry.createRegistry(1099);

            // Bind the object with a name
            registry.rebind("CalcService", calculator);

            System.out.println("RMI Server is running...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
