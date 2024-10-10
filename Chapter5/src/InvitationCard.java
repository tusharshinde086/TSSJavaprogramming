
import javax.swing.*;
import java.awt.*;

    public class InvitationCard extends JFrame {
        public InvitationCard() {
            setTitle("Invitation Card");
            setSize(400, 600);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLayout(new BorderLayout());

            // Create the main panel
            JPanel cardPanel = new JPanel();
            cardPanel.setBackground(Color.WHITE);
            cardPanel.setLayout(new GridLayout(0, 1));
            cardPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

            // Title Label
            JLabel titleLabel = new JLabel("You're Invited!", SwingConstants.CENTER);
            titleLabel.setFont(new Font("Serif", Font.BOLD, 24));
            titleLabel.setForeground(new Color(128, 0, 0));
            cardPanel.add(titleLabel);

            // Event Details
            JLabel eventLabel = new JLabel("To a Wonderful Event", SwingConstants.CENTER);
            eventLabel.setFont(new Font("Serif", Font.PLAIN, 18));
            cardPanel.add(eventLabel);

            // Add a horizontal line
            JSeparator separator = new JSeparator();
            cardPanel.add(separator);

            // Date and Time
            JLabel dateLabel = new JLabel("Date: October 15, 2024", SwingConstants.CENTER);
            dateLabel.setFont(new Font("Serif", Font.PLAIN, 16));
            cardPanel.add(dateLabel);

            JLabel timeLabel = new JLabel("Time: 5:00 PM - 8:00 PM", SwingConstants.CENTER);
            timeLabel.setFont(new Font("Serif", Font.PLAIN, 16));
            cardPanel.add(timeLabel);

            // Venue
            JLabel venueLabel = new JLabel("Venue: Community Hall, Pune", SwingConstants.CENTER);
            venueLabel.setFont(new Font("Serif", Font.PLAIN, 16));
            cardPanel.add(venueLabel);

            // RSVP
            JLabel rsvpLabel = new JLabel("RSVP: 123-456-7890", SwingConstants.CENTER);
            rsvpLabel.setFont(new Font("Serif", Font.ITALIC, 14));
            cardPanel.add(rsvpLabel);

            // Add an image (optional)
            try {
                ImageIcon image = new ImageIcon("path/to/your/image.jpg"); // Change to your image path
                JLabel imageLabel = new JLabel(image);
                cardPanel.add(imageLabel);
            } catch (Exception e) {
                System.out.println("Image not found.");
            }

            // Add the card panel to the frame
            add(cardPanel, BorderLayout.CENTER);
        }

        public static void main(String[] args) {
            SwingUtilities.invokeLater(() -> {
                InvitationCard invitationCard = new InvitationCard();
                invitationCard.setVisible(true);
            });
        }
    }
