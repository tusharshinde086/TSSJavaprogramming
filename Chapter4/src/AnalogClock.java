import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalTime;
import java.util.Timer;
import java.util.TimerTask;

public class AnalogClock extends JPanel implements ActionListener {
    private Timer timer;

    public AnalogClock() {
        timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                repaint();
            }
        }, 0, 1000); // Repaint every second

        setBackground(new Color(173, 216, 230)); // Set background color to light blue
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawClock(g);
    }

    private void drawClock(Graphics g) {
        // Set up the clock face
        int radius = 150;
        int centerX = getWidth() / 2;
        int centerY = getHeight() / 2;

        // Draw the clock face
        g.setColor(Color.WHITE);
        g.fillOval(centerX - radius, centerY - radius, radius * 2, radius * 2);

        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.BLACK);
        g2d.setStroke(new BasicStroke(6)); // Set the outline width
        g2d.drawOval(centerX - radius, centerY - radius, radius * 2, radius * 2);

        g.setColor(Color.BLACK); // Set color for numbers
        g.setFont(new Font("Serif", Font.BOLD, 24)); // Change font size and style
        for (int i = 1; i <= 12; i++) {
            double angle = Math.toRadians(i * 30);
            int x = (int) (centerX + (radius - 40) * Math.sin(angle)); // Adjusted position
            int y = (int) (centerY - (radius - 40) * Math.cos(angle));
            g.drawString(String.valueOf(i), x - 10, y + 10); // Center the number
        }

        // Draw minute markers
        g.setColor(Color.BLACK);
        for (int i = 0; i < 60; i++) {
            double angle = Math.toRadians(i * 6);
            int startX = (int) (centerX + (radius - 10) * Math.sin(angle)); // Start position for markers
            int startY = (int) (centerY - (radius - 10) * Math.cos(angle)); // Start position for markers
            int endX = (int) (centerX + radius * Math.sin(angle)); // End position for markers
            int endY = (int) (centerY - radius * Math.cos(angle));
            g.drawLine(startX, startY, endX, endY);
        }

        // Get the current time
        LocalTime now = LocalTime.now();
        int second = now.getSecond();
        int minute = now.getMinute();
        int hour = now.getHour() % 12;

        // Draw the hands of the clock
        drawHand(g, centerX, centerY, hour * 30 + minute / 2, radius * 0.4f, Color.BLUE, 8); // Hour hand (blue, bold)
        drawHand(g, centerX, centerY, minute * 6, radius * 0.6f, Color.GREEN, 6); // Minute hand (green, bold)
        drawHand(g, centerX, centerY, second * 6, radius * 0.8f, Color.RED, 4); // Second hand (red, bold)
    }

    private void drawHand(Graphics g, int centerX, int centerY, double angle, float length, Color color, int thickness) {
        // Set color and stroke thickness for the hand
        g.setColor(color);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setStroke(new BasicStroke(thickness));

        double radians = Math.toRadians(angle);
        int x = (int) (centerX + length * Math.sin(radians));
        int y = (int) (centerY - length * Math.cos(radians));
        g.drawLine(centerX, centerY, x, y); // Draw the hand
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Analog Clock");
        AnalogClock clock = new AnalogClock();
        frame.add(clock);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }
}
