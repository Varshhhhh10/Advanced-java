import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Enumeration;

public class Dict {
    public static void main(String[] args) {
        Dictionary<String, Double> balance = new Hashtable<>();

        balance.put("John Doe", 3434.34);
        balance.put("Tom Smith", 123.22);
        balance.put("Jane Baker", 1378.00);
        balance.put("Tod Hall", 99.22);
        balance.put("Ralph Smith", 19.08);

        // Show all balances in the dictionary.
        Enumeration<String> names = balance.keys();
        while (names.hasMoreElements()) {
            String str = names.nextElement();
            System.out.println(str + ": " + balance.get(str));
        }

        // Deposit 1,000 into John Doe's account.
        double bal = balance.get("John Doe");
        balance.put("John Doe", bal + 1000);
        System.out.println("John Doe's new balance: " + balance.get("John Doe"));
    }
}
