import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class oSmartphone extends JFrame {

    private Container c;
    private ImageIcon icon;
    private JLabel label1, label2, label3, imgLabel;
    private Font f1, f2, f3, f4, f5;
    private ImageIcon logo;
    private JButton btn1, btn2, btn3, nBtn;
    private Cursor cursor;
    private ButtonGroup radioButtonGroup;
    private JRadioButton pack1, pack2, pack3;
    private int selected = 0;

    oSmartphone() {
        // Frame Layout
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("SRDS MART");
        this.setSize(1000, 500);
        this.setLocationRelativeTo(null);
        this.setResizable(false);

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.decode("#F2F2F2"));

        // Icon
        icon = new ImageIcon(getClass().getResource("/images/Icon.png"));
        this.setIconImage(icon.getImage());

        // Fonts
        f1 = new Font("Segoe UI Black", Font.PLAIN, 30);
        f2 = new Font("Segoe UI Semibold", Font.BOLD, 25);
        f3 = new Font("Segoe UI", Font.PLAIN, 25);
        f4 = new Font("Segoe UI", Font.PLAIN, 20);
        f5 = new Font("Segoe UI Black", Font.PLAIN, 25);

        // Logo
        logo = new ImageIcon(getClass().getResource("/images/LogoBlue.png"));
        imgLabel = new JLabel(logo);
        imgLabel.setBounds(30, 82, logo.getIconWidth(), logo.getIconHeight());
        c.add(imgLabel);

        // Cursor for JButtons and Radio Buttons
        cursor = new Cursor(Cursor.HAND_CURSOR);

        // Title
        label1 = new JLabel();
        label1.setText("3 Models Available");
        label1.setBounds(430, 35, 600, 50);
        label1.setFont(f1);
        c.add(label1);

        label2 = new JLabel();
        label2.setText("Please! Select One : ");
        label2.setBounds(430, 70, 500, 50);
        label2.setFont(f1);
        c.add(label2);

        // Pack 1 Details
        pack1 = new JRadioButton("Samsung Galaxy S25 Ultra");
        pack1.setBounds(430, 120, 100, 50);
        pack1.setFont(f3);
        pack1.setBackground(Color.decode("#F2F2F2"));
        pack1.setCursor(cursor);
        c.add(pack1);

        label3 = new JLabel();
        label3.setText("6.8-inch Dynamic AMOLED");
        label3.setBounds(430, 150, 520, 50);
        label3.setFont(f4);
        c.add(label3);

        label3 = new JLabel();
        label3.setText("Snapdragon 8 Gen 3");
        label3.setBounds(430, 180, 520, 50);
        label3.setFont(f4);
        c.add(label3);

        label3 = new JLabel();
        label3.setText("200MP main sensor");
        label3.setBounds(430, 210, 520, 50);
        label3.setFont(f4);
        c.add(label3);

        label3 = new JLabel();
        label3.setText("5,500mAh capacity");
        label3.setBounds(430, 240, 520, 50);
        label3.setFont(f4);
        c.add(label3);

        label3 = new JLabel();
        label3.setText("65W wired charging");
        label3.setBounds(430, 270, 520, 50);
        label3.setFont(f4);
        c.add(label3);

        label3 = new JLabel();
        label3.setText("* Cost : $1,199");
        label3.setBounds(430, 300, 520, 50);
        label3.setFont(f4);
        c.add(label3);

        // Pack 2 Details
        pack2 = new JRadioButton("Apple iPhone 16 Pro Max");
        pack2.setBounds(610, 120, 100, 50);
        pack2.setFont(f3);
        pack2.setBackground(Color.decode("#F2F2F2"));
        pack2.setCursor(cursor);
        c.add(pack2);

        label3 = new JLabel();
        label3.setText("6.9-inch OLED screen");
        label3.setBounds(610, 150, 500, 50);
        label3.setFont(f4);
        c.add(label3);

        label3 = new JLabel();
        label3.setText("A18 Bionic chip");
        label3.setBounds(610, 180, 500, 50);
        label3.setFont(f4);
        c.add(label3);

        label3 = new JLabel();
        label3.setText("Titanium frame build");
        label3.setBounds(610, 210, 500, 50);
        label3.setFont(f4);
        c.add(label3);

        label3 = new JLabel();
        label3.setText("48MP wide lens");
        label3.setBounds(610, 240, 500, 50);
        label3.setFont(f4);
        c.add(label3);

        label3 = new JLabel();
        label3.setText("17-hour battery life");
        label3.setBounds(610, 270, 500, 50);
        label3.setFont(f4);
        c.add(label3);

        label3 = new JLabel();
        label3.setText("* Cost : $1,199");
        label3.setBounds(610, 300, 500, 50);
        label3.setFont(f4);
        c.add(label3);

        // Pack 3 Details
        pack3 = new JRadioButton("Xiaomi 15 Ultra");
        pack3.setBounds(790, 120, 500, 50);
        pack3.setFont(f3);
        pack3.setBackground(Color.decode("#F2F2F2"));
        pack3.setCursor(cursor);
        c.add(pack3);

        label3 = new JLabel();
        label3.setText("6.78-inch AMOLED");
        label3.setBounds(790, 150, 500, 50);
        label3.setFont(f4);
        c.add(label3);

        label3 = new JLabel();
        label3.setText("Snapdragon 8 Elite");
        label3.setBounds(790, 180, 500, 50);
        label3.setFont(f4);
        c.add(label3);

        label3 = new JLabel();
        label3.setText("50MP main sensor");
        label3.setBounds(790, 210, 500, 50);
        label3.setFont(f4);
        c.add(label3);

        label3 = new JLabel();
        label3.setText("6,100mAh capacity");
        label3.setBounds(790, 240, 500, 50);
        label3.setFont(f4);
        c.add(label3);

        label3 = new JLabel();
        label3.setText("90W wired charging");
        label3.setBounds(790, 270, 500, 50);
        label3.setFont(f4);
        c.add(label3);

        label3 = new JLabel();
        label3.setText("* Cost : $899");
        label3.setBounds(790, 300, 500, 50);
        label3.setFont(f4);
        c.add(label3);

        // To group the radio buttons.
        radioButtonGroup = new ButtonGroup();
        radioButtonGroup.add(pack1);
        radioButtonGroup.add(pack2);
        radioButtonGroup.add(pack3);

        // JButtons
        btn1 = new JButton("Exit");
        btn1.setBounds(148, 375, 215, 50);
        btn1.setFont(f5);
        btn1.setCursor(cursor);
        btn1.setForeground(Color.WHITE);
        btn1.setBackground(Color.decode("#C00000"));
        c.add(btn1);

        btn2 = new JButton("Back");
        btn2.setBounds(384, 375, 215, 50);
        btn2.setFont(f5);
        btn2.setCursor(cursor);
        btn2.setForeground(Color.WHITE);
        btn2.setBackground(Color.decode("#2E75B6"));
        c.add(btn2);

        btn3 = new JButton("Pay");
        btn3.setBounds(617, 375, 215, 50);
        btn3.setFont(f5);
        btn3.setCursor(cursor);
        btn3.setForeground(Color.WHITE);
        btn3.setBackground(Color.decode("#2E75B6"));
        c.add(btn3);

        nBtn = new JButton("");
        nBtn.setBounds(0, 0, 0, 0);
        c.add(nBtn);

        Handler handler = new Handler();
        pack1.addActionListener(handler);
        pack2.addActionListener(handler);
        pack3.addActionListener(handler);

        // Action Listener for JButtons
        // Exit Button
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });

        // Back Button
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                setVisible(false);
                oProducts frame = new oProducts();
                frame.setVisible(true);
            }
        });

        // Next Button
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if (selected == 0) {
                    JOptionPane.showMessageDialog(null, "You did not select any model.", "Warning!!!",
                            JOptionPane.WARNING_MESSAGE);
                } else {
                    setVisible(false);
                    Payment frame = new Payment();
                    frame.setVisible(true);
                }
            }
        });
    }

    class Handler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == pack1) {
                selected = 1;
            } else if (e.getSource() == pack2) {
                selected = 2;
            } else if (e.getSource() == pack3) {
                selected = 3;
            }
        }
    }

    public static void main(String[] args) {

        oSmartphone frame = new oSmartphone();
        frame.setVisible(true);
    }
}
