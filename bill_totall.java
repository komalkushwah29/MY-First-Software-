/*import java.util.Scanner;
public class bill_totall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice, quantity;
        float price, result, totalBill = 0;

        System.out.println("Welcome to our shop!");
        System.out.println("Traditional Sweets, Cakes, Ice Creams, etc.");
        System.out.println("                Menu              ");
        System.out.println("            Chocolate Cake        ");
        System.out.println("S.no   Item Name           Price");
        System.out.println(" 1.    Vanilla             120 per 500g");
        System.out.println(" 2.    Kulfi               50 per piece");
        System.out.println(" 3.    Fruit Sorbet        100 per 500g");
        System.out.println(" 4.    Chocolate Cake      350 per kg");
        System.out.println(" 5.    Fruit Cake          450 per kg");
        System.out.println(" 6.    Cupcakes            50 each");
        System.out.println(" 7.    Cream Pastries      80 each");

        while (true) {
            System.out.print("Enter your choice (1-7): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter quantity (in 500g units): ");
                    quantity = scanner.nextInt();
                    price = 120;
                    result = price * quantity;
                    totalBill += result;
                    System.out.println("You purchased " + quantity + " x 500g Vanilla at " + price + " each. Total: " + result);
                    break;
                case 2:
                    System.out.print("Enter quantity (pieces): ");
                    quantity = scanner.nextInt();
                    price = 50;
                    result = price * quantity;
                    totalBill += result;
                    System.out.println("You purchased " + quantity + " Kulfi at " + price + " each. Total: " + result);
                    break;
                case 3:
                    System.out.print("Enter quantity (in 500g units): ");
                    quantity = scanner.nextInt();
                    price = 100;
                    result = price * quantity;
                    totalBill += result;
                    System.out.println("You purchased " + quantity + " x 500g Fruit Sorbet at " + price + " each. Total: " + result);
                    break;
                case 4:
                    System.out.print("Enter quantity (in kg): ");
                    quantity = scanner.nextInt();
                    price = 350;
                    result = price * quantity;
                    totalBill += result;
                    System.out.println("You purchased " + quantity + " kg Chocolate Cake at " + price + " per kg. Total: " + result);
                    break;
                case 5:
                    System.out.print("Enter quantity (in kg): ");
                    quantity = scanner.nextInt();
                    price = 450;
                    result = price * quantity;
                    totalBill += result;
                    System.out.println("You purchased " + quantity + " kg Fruit Cake at " + price + " per kg. Total: " + result);
                    break;
                case 6:
                    System.out.print("Enter quantity (pieces): ");
                    quantity = scanner.nextInt();
                    price = 50;
                    result = price * quantity;
                    totalBill += result;
                    System.out.println("You purchased " + quantity + " Cupcakes at " + price + " each. Total: " + result);
                    break;
                case 7:
                    System.out.print("Enter quantity (pieces): ");
                    quantity = scanner.nextInt();
                    price = 80;
                    result = price * quantity;
                    totalBill += result;
                    System.out.println("You purchased " + quantity + " Cream Pastries at " + price + " each. Total: " + result);
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 7.");
                    continue;
            }

            System.out.print("Do you want to continue shopping? (1 for Yes, 0 for No): ");
            int continueShopping = scanner.nextInt();

            if (continueShopping == 0) {
                break;
            } else if (continueShopping != 1) {
                System.out.println("Invalid input! Assuming you want to continue.");
            }
        }

        System.out.println("Your total bill is: " + totalBill);
        scanner.close();
    }
}*/



/*import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class bill_totall {
    private static float totalBill = 0;

    public static void main(String[] args) {
        // Create Frame
        JFrame frame = new JFrame("🍰 Sweet Shop Billing System");
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridBagLayout());
        frame.getContentPane().setBackground(new Color(255, 248, 220)); // Light cream

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);

        // Font
        Font labelFont = new Font("SansSerif", Font.BOLD, 16);
        Font buttonFont = new Font("SansSerif", Font.BOLD, 14);

        // Menu Items and Prices
        String[] items = {
                "Select an item",
                "Vanilla - 120 per 500g",
                "Kulfi - 50 per piece",
                "Fruit Sorbet - 100 per 500g",
                "Chocolate Cake - 350 per kg",
                "Fruit Cake - 450 per kg",
                "Cupcakes - 50 each",
                "Cream Pastries - 80 each"
        };
        int[] prices = {0, 120, 50, 100, 350, 450, 50, 80};

        // Components
        JLabel titleLabel = new JLabel("Sweet Shop Billing System 🍨");
        titleLabel.setFont(new Font("Serif", Font.BOLD, 22));
        titleLabel.setForeground(new Color(139, 69, 19));

        JLabel itemLabel = new JLabel("Select Item:");
        itemLabel.setFont(labelFont);
        JComboBox<String> itemList = new JComboBox<>(items);
        itemList.setFont(labelFont);

        JLabel qtyLabel = new JLabel("Enter Quantity:");
        qtyLabel.setFont(labelFont);
        JTextField quantityField = new JTextField(10);
        quantityField.setFont(labelFont);

        JButton addButton = new JButton("Add to Bill ➕");
        addButton.setFont(buttonFont);
        addButton.setBackground(new Color(173, 216, 230));

        JButton clearButton = new JButton("Clear 🧹");
        clearButton.setFont(buttonFont);
        clearButton.setBackground(new Color(255, 182, 193));

        JButton finishButton = new JButton("Finish & Show Total ✅");
        finishButton.setFont(buttonFont);
        finishButton.setBackground(new Color(144, 238, 144));

        JTextArea outputArea = new JTextArea(15, 40);
        outputArea.setEditable(false);
        outputArea.setFont(new Font("Monospaced", Font.PLAIN, 14));
        JScrollPane scrollPane = new JScrollPane(outputArea);

        // Add Components to Frame
        gbc.gridx = 0; gbc.gridy = 0; gbc.gridwidth = 3;
        frame.add(titleLabel, gbc);

        gbc.gridy++;
        gbc.gridwidth = 1;
        frame.add(itemLabel, gbc);

        gbc.gridx = 1;
        frame.add(itemList, gbc);

        gbc.gridx = 0; gbc.gridy++;
        frame.add(qtyLabel, gbc);

        gbc.gridx = 1;
        frame.add(quantityField, gbc);

        gbc.gridx = 0; gbc.gridy++;
        frame.add(addButton, gbc);

        gbc.gridx = 1;
        frame.add(clearButton, gbc);

        gbc.gridx = 2;
        frame.add(finishButton, gbc);

        gbc.gridx = 0; gbc.gridy++;
        gbc.gridwidth = 3;
        frame.add(scrollPane, gbc);

        // Add Button Action
        addButton.addActionListener(e -> {
            int index = itemList.getSelectedIndex();
            if (index == 0) {
                JOptionPane.showMessageDialog(frame, "Please select a valid item.");
                return;
            }

            String itemName = items[index].split(" -")[0];
            int price = prices[index];
            int quantity;

            try {
                quantity = Integer.parseInt(quantityField.getText());
                if (quantity <= 0) throw new NumberFormatException();
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Enter a valid quantity (positive number).");
                return;
            }

            float result = price * quantity;
            totalBill += result;

            outputArea.append("✔ " + quantity + " x " + itemName + " @ ₹" + price + " = ₹" + result + "\n");

            quantityField.setText("");
            itemList.setSelectedIndex(0);
        });

        // Finish Button Action
        finishButton.addActionListener(e -> {
            outputArea.append("\n-------------------------\n");
            outputArea.append("Total Bill: ₹" + totalBill + "\n");
            outputArea.append("Thank you for shopping with us! 🎉\n");
            outputArea.append("-------------------------\n");
            JOptionPane.showMessageDialog(frame, "Your Total Bill: ₹" + totalBill + "\nThank you!");
        });

        // Clear Button Action
        clearButton.addActionListener(e -> {
            quantityField.setText("");
            itemList.setSelectedIndex(0);
            outputArea.setText("");
            totalBill = 0;
        });

        frame.setVisible(true);
    }
}*/

/*import javax.swing.*;
import java.awt.*;

public class bill_totall {
    private static float totalBill = 0;

    public static void main(String[] args) {
        // Create Frame
        JFrame frame = new JFrame("🍰 Sweet Shop Billing System");
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridBagLayout());
        frame.getContentPane().setBackground(new Color(255, 248, 220)); // Light cream

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);

        // Fonts
        Font labelFont = new Font("SansSerif", Font.BOLD, 16);
        Font buttonFont = new Font("SansSerif", Font.BOLD, 14);

        // Menu Items and Prices
        String[] items = {
                "Select an item",
                "Vanilla - 120 per 500g",
                "Kulfi - 50 per piece",
                "Fruit Sorbet - 100 per 500g",
                "Chocolate Cake - 350 per kg",
                "Fruit Cake - 450 per kg",
                "Cupcakes - 50 each",
                "Cream Pastries - 80 each"
        };
        int[] prices = {0, 120, 50, 100, 350, 450, 50, 80};

        // Components
        JLabel titleLabel = new JLabel("Sweet Shop Billing System 🍨");
        titleLabel.setFont(new Font("Serif", Font.BOLD, 22));
        titleLabel.setForeground(new Color(139, 69, 19));

        JLabel itemLabel = new JLabel("Select Item:");
        itemLabel.setFont(labelFont);
        JComboBox<String> itemList = new JComboBox<>(items);
        itemList.setFont(labelFont);

        JLabel qtyLabel = new JLabel("Enter Quantity:");
        qtyLabel.setFont(labelFont);
        JTextField quantityField = new JTextField(10);
        quantityField.setFont(labelFont);

        JButton addButton = new JButton("Add to Bill ➕");
        addButton.setFont(buttonFont);
        addButton.setBackground(new Color(173, 216, 230));

        JButton clearButton = new JButton("Clear 🧹");
        clearButton.setFont(buttonFont);
        clearButton.setBackground(new Color(255, 182, 193));

        JButton finishButton = new JButton("Finish & Show Total ✅");
        finishButton.setFont(buttonFont);
        finishButton.setBackground(new Color(144, 238, 144));

        JTextArea outputArea = new JTextArea(15, 40);
        outputArea.setEditable(false);
        outputArea.setFont(new Font("Monospaced", Font.PLAIN, 14));
        JScrollPane scrollPane = new JScrollPane(outputArea);

        // Add Components to Frame
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 3;
        frame.add(titleLabel, gbc);

        gbc.gridy++;
        gbc.gridwidth = 1;
        frame.add(itemLabel, gbc);

        gbc.gridx = 1;
        frame.add(itemList, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        frame.add(qtyLabel, gbc);

        gbc.gridx = 1;
        frame.add(quantityField, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        frame.add(addButton, gbc);

        gbc.gridx = 1;
        frame.add(clearButton, gbc);

        gbc.gridx = 2;
        frame.add(finishButton, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        gbc.gridwidth = 3;
        frame.add(scrollPane, gbc);

        // Add to Bill Button Action
        addButton.addActionListener(e -> {
            int index = itemList.getSelectedIndex();

            // Validate item selection
            if (index == 0) {
                JOptionPane.showMessageDialog(frame, "❗ Please select a valid item.");
                return;
            }

            // Validate empty quantity
            String qtyText = quantityField.getText().trim();
            if (qtyText.isEmpty()) {
                JOptionPane.showMessageDialog(frame, "❗ Quantity field cannot be empty.");
                return;
            }

            int quantity;
            try {
                quantity = Integer.parseInt(qtyText);
                if (quantity <= 0) throw new NumberFormatException();
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "❗ Enter a valid positive number for quantity.");
                return;
            }

            // Add to bill
            String itemName = items[index].split(" -")[0];
            int price = prices[index];
            float result = price * quantity;
            totalBill += result;

            outputArea.append("✔ " + quantity + " x " + itemName + " @ ₹" + price + " = ₹" + result + "\n");

            // Reset inputs
            quantityField.setText("");
            itemList.setSelectedIndex(0);
        });

        // Finish Button Action
        finishButton.addActionListener(e -> {
            outputArea.append("\n-------------------------\n");
            outputArea.append("Total Bill: ₹" + totalBill + "\n");
            outputArea.append("Thank you for shopping with us! 🎉\n");
            outputArea.append("-------------------------\n");
            JOptionPane.showMessageDialog(frame, "Your Total Bill: ₹" + totalBill + "\nThank you!");
        });

        // Clear Button Action
        clearButton.addActionListener(e -> {
            quantityField.setText("");
            itemList.setSelectedIndex(0);
            outputArea.setText("");
            totalBill = 0;
        });

        frame.setVisible(true);
    }
}*/

/*import javax.swing.*;
import java.awt.*;
public class bill_totall {
    private static float totalBill = 0;
    public static void main(String[] args) {
        JFrame frame = new JFrame("🍰 Sweet Shop Billing System");
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridBagLayout());
        frame.getContentPane().setBackground(new Color(255, 248, 220)); // Light cream
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        // Fonts
        Font labelFont = new Font("SansSerif", Font.BOLD, 16);
        Font buttonFont = new Font("SansSerif", Font.BOLD, 14);
        // Menu Items and Prices
        String[] items = {
                "Select an item",
                "Vanilla - 120 per 500g",
                "Kulfi - 50 per piece",
                "Fruit Sorbet - 100 per 500g",
                "Chocolate Cake - 350 per kg",
                "Fruit Cake - 450 per kg",
                "Cupcakes - 50 each",
                "Cream Pastries - 80 each"
        };
        int[] prices = {0, 120, 50, 100, 350, 450, 50, 80};
        // Components
        JLabel titleLabel = new JLabel("Sweet Shop Billing System 🍨");
        titleLabel.setFont(new Font("Serif", Font.BOLD, 22));
        titleLabel.setForeground(new Color(139, 69, 19));
        JLabel itemLabel = new JLabel("Select Item:");
        itemLabel.setFont(labelFont);
        JComboBox<String> itemList = new JComboBox<>(items);
        itemList.setFont(labelFont);
        JLabel qtyLabel = new JLabel("Enter Quantity:");
        qtyLabel.setFont(labelFont);
        JTextField quantityField = new JTextField(10);
        quantityField.setFont(labelFont);

        JButton addButton = new JButton("Add to Bill ➕");
        addButton.setFont(buttonFont);
        addButton.setBackground(new Color(173, 216, 230));

        JButton clearButton = new JButton("Clear 🧹");
        clearButton.setFont(buttonFont);
        clearButton.setBackground(new Color(255, 182, 193));

        JButton finishButton = new JButton("Finish & Show Total ✅");
        finishButton.setFont(buttonFont);
        finishButton.setBackground(new Color(144, 238, 144));

        JTextArea outputArea = new JTextArea(15, 40);
        outputArea.setEditable(false);
        outputArea.setFont(new Font("Monospaced", Font.PLAIN, 14));
        JScrollPane scrollPane = new JScrollPane(outputArea);

        // Add Components to Frame
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 3;
        frame.add(titleLabel, gbc);

        gbc.gridy++;
        gbc.gridwidth = 1;
        gbc.gridx = 0;
        frame.add(itemLabel, gbc);

        gbc.gridx = 1;
        frame.add(itemList, gbc);

        gbc.gridy++;
        gbc.gridx = 0;
        frame.add(qtyLabel, gbc);

        gbc.gridx = 1;
        frame.add(quantityField, gbc);

        gbc.gridy++;
        gbc.gridx = 0;
        frame.add(addButton, gbc);

        gbc.gridx = 1;
        frame.add(clearButton, gbc);

        gbc.gridx = 2;
        frame.add(finishButton, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        gbc.gridwidth = 3;
        frame.add(scrollPane, gbc);

        // Add to Bill Button Action
        addButton.addActionListener(e -> {
            int index = itemList.getSelectedIndex();

            if (index == 0) {
                JOptionPane.showMessageDialog(frame, "❗ Please select a valid item.");
                return;
            }

            String qtyText = quantityField.getText().trim();
            if (qtyText.isEmpty()) {
                JOptionPane.showMessageDialog(frame, "❗ Quantity field cannot be empty.");
                return;
            }

            int quantity;
            try {
                quantity = Integer.parseInt(qtyText);
                if (quantity <= 0) throw new NumberFormatException();
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "❗ Enter a valid positive number for quantity.");
                return;
            }

            String itemName = items[index].split(" -")[0];
            int price = prices[index];
            float result = price * quantity;
            totalBill += result;

            outputArea.append("✔ " + quantity + " x " + itemName + " @ ₹" + price + " = ₹" + result + "\n");

            quantityField.setText("");
            itemList.setSelectedIndex(0);
        });

        // Finish Button Action
        finishButton.addActionListener(e -> {
            outputArea.append("\n-------------------------\n");
            outputArea.append("Total Bill: ₹" + totalBill + "\n");
            outputArea.append("Thank you for shopping with us! 🎉\n");
            outputArea.append("-------------------------\n");
            JOptionPane.showMessageDialog(frame, "Your Total Bill: ₹" + totalBill + "\nThank you!");
        });

        // Clear Button Action
        clearButton.addActionListener(e -> {
            quantityField.setText("");
            itemList.setSelectedIndex(0);
            outputArea.setText("");
            totalBill = 0;
        });

        frame.setVisible(true);
    }
}
*/



/*import javax.swing.*;
import java.awt.*;

public class bill_totall{
    private static float totalBill = 0;

    public static void main(String[] args) {
        JFrame frame = new JFrame("🍰 Sweet Shop Billing System");
        frame.setSize(650, 650);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridBagLayout());
        frame.getContentPane().setBackground(new Color(255, 248, 220));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Fonts
        Font labelFont = new Font("SansSerif", Font.BOLD, 16);
        Font buttonFont = new Font("SansSerif", Font.BOLD, 14);

        // Menu Items and Prices
        String[] items = {
                "Select an item",
                "Vanilla - 120 per 500g",
                "Kulfi - 50 per piece",
                "Fruit Sorbet - 100 per 500g",
                "Chocolate Cake - 350 per kg",
                "Fruit Cake - 450 per kg",
                "Cupcakes - 50 each",
                "Cream Pastries - 80 each"
        };
        int[] prices = {0, 120, 50, 100, 350, 450, 50, 80};

        // Components
        JLabel titleLabel = new JLabel("Sweet Shop Billing System 🍨");
        titleLabel.setFont(new Font("Serif", Font.BOLD, 24));
        titleLabel.setForeground(new Color(139, 69, 19));

        JLabel itemLabel = new JLabel("Select Item:");
        itemLabel.setFont(labelFont);
        JComboBox<String> itemList = new JComboBox<>(items);
        itemList.setFont(labelFont);

        JLabel qtyLabel = new JLabel("Enter Quantity:");
        qtyLabel.setFont(labelFont);
        JTextField quantityField = new JTextField(10);
        quantityField.setFont(labelFont);

        JButton addButton = new JButton("Add to Bill ➕");
        addButton.setFont(buttonFont);
        addButton.setBackground(new Color(173, 216, 230));

        JButton clearButton = new JButton("Clear 🧹");
        clearButton.setFont(buttonFont);
        clearButton.setBackground(new Color(255, 182, 193));

        JButton finishButton = new JButton("Finish & Show Total ✅");
        finishButton.setFont(buttonFont);
        finishButton.setBackground(new Color(144, 238, 144));

        JTextArea outputArea = new JTextArea(15, 40);
        outputArea.setEditable(false);
        outputArea.setFont(new Font("Monospaced", Font.PLAIN, 14));
        JScrollPane scrollPane = new JScrollPane(outputArea);

        // Add Components to Frame
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 3;
        gbc.anchor = GridBagConstraints.CENTER;
        frame.add(titleLabel, gbc);

        gbc.gridwidth = 1;
        gbc.gridy++;
        gbc.gridx = 0;
        frame.add(itemLabel, gbc);

        gbc.gridx = 1;
        frame.add(itemList, gbc);

        gbc.gridy++;
        gbc.gridx = 0;
        frame.add(qtyLabel, gbc);

        gbc.gridx = 1;
        frame.add(quantityField, gbc);

        gbc.gridy++;
        gbc.gridx = 0;
        frame.add(addButton, gbc);

        gbc.gridx = 1;
        frame.add(clearButton, gbc);

        gbc.gridx = 2;
        frame.add(finishButton, gbc);

        gbc.gridy++;
        gbc.gridx = 0;
        gbc.gridwidth = 3;
        frame.add(scrollPane, gbc);

        // Add to Bill Button Action
        addButton.addActionListener(e -> {
            int index = itemList.getSelectedIndex();

            if (index == 0) {
                JOptionPane.showMessageDialog(frame, "❗ Please select a valid item.");
                return;
            }

            String qtyText = quantityField.getText().trim();
            if (qtyText.isEmpty()) {
                JOptionPane.showMessageDialog(frame, "❗ Quantity field cannot be empty.");
                return;
            }

            int quantity;
            try {
                quantity = Integer.parseInt(qtyText);
                if (quantity <= 0) throw new NumberFormatException();
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "❗ Enter a valid positive number for quantity.");
                return;
            }

            String itemName = items[index].split(" -")[0];
            int price = prices[index];
            float result = price * quantity;
            totalBill += result;

            outputArea.append("✔ " + quantity + " x " + itemName + " @ ₹" + price + " = ₹" + result + "\n");

            quantityField.setText("");
            itemList.setSelectedIndex(0);
        });

        // Finish Button Action
        finishButton.addActionListener(e -> {
            outputArea.append("\n-------------------------\n");
            outputArea.append("Total Bill: ₹" + totalBill + "\n");
            outputArea.append("Thank you for shopping with us! 🎉\n");
            outputArea.append("-------------------------\n");
            JOptionPane.showMessageDialog(frame, "Your Total Bill: ₹" + totalBill + "\nThank you!");
        });

        // Clear Button Action
        clearButton.addActionListener(e -> {
            quantityField.setText("");
            itemList.setSelectedIndex(0);
            outputArea.setText("");
            totalBill = 0;
        });

        frame.setVisible(true);
    }
}*/

import javax.swing.*;
import java.awt.*;
import java.awt.print.PrinterException;
import java.io.*;

public class bill_totall {
    private static float totalBill = 0;

    public static void main(String[] args) {
        JFrame frame = new JFrame("🍰 Sweet Shop Billing System");
        frame.setSize(650, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridBagLayout());
        frame.getContentPane().setBackground(new Color(255, 248, 220));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Fonts
        Font labelFont = new Font("SansSerif", Font.BOLD, 16);
        Font buttonFont = new Font("SansSerif", Font.BOLD, 14);

        // Menu Items and Prices
        String[] items = {
                "Select an item",
                "Vanilla - 120 per 500g",
                "Kulfi - 50 per piece",
                "Fruit Sorbet - 100 per 500g",
                "Chocolate Cake - 350 per kg",
                "Fruit Cake - 450 per kg",
                "Cupcakes - 50 each",
                "Cream Pastries - 80 each"
        };
        int[] prices = {0, 120, 50, 100, 350, 450, 50, 80};

        // Components
        JLabel titleLabel = new JLabel("Sweet Shop Billing System 🍨");
        titleLabel.setFont(new Font("Serif", Font.BOLD, 24));
        titleLabel.setForeground(new Color(139, 69, 19));

        JLabel itemLabel = new JLabel("Select Item:");
        itemLabel.setFont(labelFont);
        JComboBox<String> itemList = new JComboBox<>(items);
        itemList.setFont(labelFont);

        JLabel qtyLabel = new JLabel("Enter Quantity:");
        qtyLabel.setFont(labelFont);
        JTextField quantityField = new JTextField(10);
        quantityField.setFont(labelFont);

        JButton addButton = new JButton("Add to Bill ➕");
        addButton.setFont(buttonFont);
        addButton.setBackground(new Color(173, 216, 230));

        JButton clearButton = new JButton("Clear 🧹");
        clearButton.setFont(buttonFont);
        clearButton.setBackground(new Color(255, 182, 193));

        JButton finishButton = new JButton("Finish & Show Total ✅");
        finishButton.setFont(buttonFont);
        finishButton.setBackground(new Color(144, 238, 144));

        JButton printButton = new JButton("Print Bill 🖨️");
        printButton.setFont(buttonFont);
        printButton.setBackground(new Color(255, 228, 181));

        JTextArea outputArea = new JTextArea(15, 40);
        outputArea.setEditable(false);
        outputArea.setFont(new Font("Monospaced", Font.PLAIN, 14));
        JScrollPane scrollPane = new JScrollPane(outputArea);

        // Add Components to Frame
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 4;
        gbc.anchor = GridBagConstraints.CENTER;
        frame.add(titleLabel, gbc);

        gbc.gridwidth = 1;
        gbc.gridy++;
        gbc.gridx = 0;
        frame.add(itemLabel, gbc);

        gbc.gridx = 1;
        frame.add(itemList, gbc);

        gbc.gridy++;
        gbc.gridx = 0;
        frame.add(qtyLabel, gbc);

        gbc.gridx = 1;
        frame.add(quantityField, gbc);

        gbc.gridy++;
        gbc.gridx = 0;
        frame.add(addButton, gbc);

        gbc.gridx = 1;
        frame.add(clearButton, gbc);

        gbc.gridx = 2;
        frame.add(finishButton, gbc);

        gbc.gridx = 3;
        frame.add(printButton, gbc);

        gbc.gridy++;
        gbc.gridx = 0;
        gbc.gridwidth = 4;
        frame.add(scrollPane, gbc);

        // Add to Bill Button Action
        addButton.addActionListener(e -> {
            int index = itemList.getSelectedIndex();

            if (index == 0) {
                JOptionPane.showMessageDialog(frame, "❗ Please select a valid item.");
                return;
            }

            String qtyText = quantityField.getText().trim();
            if (qtyText.isEmpty()) {
                JOptionPane.showMessageDialog(frame, "❗ Quantity field cannot be empty.");
                return;
            }

            int quantity;
            try {
                quantity = Integer.parseInt(qtyText);
                if (quantity <= 0) throw new NumberFormatException();
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "❗ Enter a valid positive number for quantity.");
                return;
            }

            String itemName = items[index].split(" -")[0];
            int price = prices[index];
            float result = price * quantity;
            totalBill += result;

            outputArea.append("✔ " + quantity + " x " + itemName + " @ ₹" + price + " = ₹" + result + "\n");

            quantityField.setText("");
            itemList.setSelectedIndex(0);
        });

        // Finish Button Action
        finishButton.addActionListener(e -> {
            StringBuilder billOutput = new StringBuilder();
            billOutput.append("\n-------------------------\n");
            billOutput.append("Total Bill: ₹").append(totalBill).append("\n");
            billOutput.append("Thank you for shopping with us! 🎉\n");
            billOutput.append("-------------------------\n");

            outputArea.append(billOutput.toString());

            JOptionPane.showMessageDialog(frame, "Your Total Bill: ₹" + totalBill + "\nThank you!");

            // Save to text file
            try {
                FileWriter writer = new FileWriter("SweetShopBill.txt");
                writer.write(outputArea.getText());
                writer.close();
                System.out.println("📝 Bill saved to SweetShopBill.txt");
            } catch (IOException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(frame, "⚠ Error saving the bill to file.");
            }
        });

        // Print Button Action
        printButton.addActionListener(e -> {
            try {
                boolean printed = outputArea.print();
                if (printed) {
                    JOptionPane.showMessageDialog(frame, "🖨️ Bill sent to printer successfully.");
                } else {
                    JOptionPane.showMessageDialog(frame, "❌ Printing was cancelled.");
                }
            } catch (PrinterException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(frame, "⚠ Printing failed: " + ex.getMessage());
            }
        });

        // Clear Button Action
        clearButton.addActionListener(e -> {
            quantityField.setText("");
            itemList.setSelectedIndex(0);
            outputArea.setText("");
            totalBill = 0;
        });

        frame.setVisible(true);
    }
}


