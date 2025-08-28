//import java.util.Scanner;
//
//public class RESTUDENT {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        String[] items = {"Pizza", "Burger", "Pasta", "Fries", "Cold Drink"};
//        double[] prices = {250.0, 120.0, 150.0, 80.0, 50.0};
//        int[] quantities = new int[5];
//        double total = 0;
//
//        System.out.println("=== Welcome to Restaurant ===");
//        System.out.println("Menu:");
//        for (int i = 0; i < items.length; i++) {
//            System.out.printf("%d. %-12s - ₹%.2f\n", (i + 1), items[i], prices[i]);
//        }
//
//        System.out.println("\nEnter quantity for each item:");
//        for (int i = 0; i < items.length; i++) {
//            System.out.print(items[i] + " (₹" + prices[i] + "): ");
//            quantities[i] = scanner.nextInt();
//        }
//
//        System.out.println("\n===== BILL =====");
//        for (int i = 0; i < items.length; i++) {
//            if (quantities[i] > 0) {
//                double itemTotal = prices[i] * quantities[i];
//                System.out.printf("%-12s x %2d = ₹%.2f\n", items[i], quantities[i], itemTotal);
//                total += itemTotal;
//            }
//        }
//
//        // Optional: Add 10% tax
//        double tax = total * 0.10;
//        double grandTotal = total + tax;
//
//        System.out.printf("\nSubtotal       : ₹%.2f", total);
//        System.out.printf("\nTax (10%%)      : ₹%.2f", tax);
//        System.out.printf("\nTotal Amount   : ₹%.2f", grandTotal);
//
//        System.out.println("\n\nThank you! Visit Again.");
//        scanner.close();
//    }
//}




import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RESTUDENT extends JFrame {
    private String[] items = {"Pizza", "Burger", "Pasta", "Fries", "Cold Drink"};
    private double[] prices = {250.0, 120.0, 150.0, 80.0, 50.0};
    private JTextField[] quantityFields = new JTextField[items.length];
    private JTextArea billArea;

    public RESTUDENT() {
        setTitle("Restaurant Billing System");
        setSize(500, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Header
        JLabel titleLabel = new JLabel("Restaurant Menu", JLabel.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        add(titleLabel, BorderLayout.NORTH);

        // Center Panel: Menu Items
        JPanel menuPanel = new JPanel(new GridLayout(items.length, 3, 10, 10));
        for (int i = 0; i < items.length; i++) {
            menuPanel.add(new JLabel(items[i]));
            menuPanel.add(new JLabel("₹" + prices[i]));
            quantityFields[i] = new JTextField("0");
            menuPanel.add(quantityFields[i]);
        }
        add(menuPanel, BorderLayout.CENTER);

        // South Panel: Buttons
        JPanel buttonPanel = new JPanel();
        JButton calcButton = new JButton("Generate Bill");
        JButton exitButton = new JButton("Exit");

        buttonPanel.add(calcButton);
        buttonPanel.add(exitButton);
        add(buttonPanel, BorderLayout.SOUTH);

        // Bill Display Area
        billArea = new JTextArea(10, 40);
        billArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(billArea);
        add(scrollPane, BorderLayout.EAST);

        // Button Actions
        calcButton.addActionListener(e -> generateBill());
        exitButton.addActionListener(e -> System.exit(0));
    }

    private void generateBill() {
        StringBuilder bill = new StringBuilder();
        double total = 0;

        bill.append("====== BILL ======\n");
        for (int i = 0; i < items.length; i++) {
            int quantity;
            try {
                quantity = Integer.parseInt(quantityFields[i].getText());
            } catch (NumberFormatException e) {
                quantity = 0;
            }

            if (quantity > 0) {
                double itemTotal = prices[i] * quantity;
                bill.append(String.format("%-12s x %2d = ₹%.2f\n", items[i], quantity, itemTotal));
                total += itemTotal;
            }
        }

        double tax = total * 0.10;
        double grandTotal = total + tax;

        bill.append(String.format("\nSubtotal      : ₹%.2f", total));
        bill.append(String.format("\nTax (10%%)     : ₹%.2f", tax));
        bill.append(String.format("\nTotal Amount  : ₹%.2f", grandTotal));
        bill.append("\n\nThank you! Visit Again.");

        billArea.setText(bill.toString());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new RESTUDENT().setVisible(true);
        });
    }
}
