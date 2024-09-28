
import java.awt.EventQueue; // Import EventQueue for thread safety
import javax.swing.JFrame; // Import JFrame for the window

public class SimpleEx extends JFrame {

    // Constructor to initialize the UI
    public SimpleEx() {
        initUI(); // Call the method to set up the user interface
    }

    // Method to initialize the user interface
    private void initUI() {
        setTitle("Simple example"); // Set the title of the window
        setSize(400, 300); // Set the dimensions of the window (width, height)
        setLocationRelativeTo(null); // Center the window on the screen
        setDefaultCloseOperation(EXIT_ON_CLOSE); // Exit the application when the window is closed
    }

    // Main method to launch the application
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            // Create an instance of the SimpleEx class
            var ex = new SimpleEx();
            ex.setVisible(true); // Make the window visible
        });
    }
}
