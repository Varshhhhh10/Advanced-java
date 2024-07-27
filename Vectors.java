import java.util.Vector;

public class Vectors {
    public static void main(String[] args) {
        // Create a Vector
        Vector<String> vector = new Vector<>();

        // Add elements to the Vector
        vector.add("Java");
        vector.add("Python");
        vector.add("C++");

        // Display the Vector elements
        System.out.println("Vector elements: " + vector);

        // Get the element at a specific index
        String element = vector.get(1);
        System.out.println("Element at index 1: " + element);

        // Remove an element
        vector.remove("Python");
        System.out.println("Vector elements after removal: " + vector);

        // Iterate over the elements
        System.out.println("Iterating over Vector elements:");
        for (String lang : vector) {
            System.out.println(lang);
        }
    }
}