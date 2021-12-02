import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Myorder extends JFrame{
    private JPanel mainPanel;
    private JLabel logoImage;
    private JButton profileButton;
    private JButton homeButton;
    private JButton menuButton;
    private JButton contactUsButton;
    private JTextArea pizzaOrder;
    private JButton continueToCheckoutButton;
    private JTextArea sidesOrder;
    private JTextArea drinkOrder;
    private JTextArea textArea1;
    private JTextArea textArea2;

    public Myorder(String name, Pizza p, Side s, Drink d) {
        super(name);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.setVisible(true);
        this.setMinimumSize(new Dimension(1080, 720));

        this.pack();

        setPizzaText(p);
        setSideText(s);
        setDrinkText(d);

        homeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame menu = new Menu("Menu");
                dispose();
            }
        });
        menuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame fullMenu = new FullMenu("Full Menu");
                dispose();
            }
        });
        contactUsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame contact = new Contact("Contact Us");
                dispose();
            }
        });
        profileButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame profile = new Profile("Profile");
                dispose();
            }
        });
    }
    public void setPizzaText(Pizza p) {
        pizzaOrder.setText(p.toString());
    }
    public void setSideText(Side s) {
        sidesOrder.setText(s.toString());
    }
    public void setDrinkText(Drink d) {
        drinkOrder.setText(d.toString());
    }
}
