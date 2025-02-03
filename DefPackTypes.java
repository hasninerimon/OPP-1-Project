import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class DefPackTypes extends JFrame {

    private Container c;
    private ImageIcon icon;
    private JLabel label1, imgLabel;
    private Font f1, f2, f3;
    private ImageIcon logo;
    private JButton btn1, btn2, btn3, nBtn;
    private Cursor cursor;
    private JRadioButton overseas, local;
    private ButtonGroup radioButtonGroup;
    private int defPack = 0;

    DefPackTypes() {
        // Frame Layout
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("SRDS MART");
        this.setSize(800, 800);
        this.setLocationRelativeTo(null);
        this.setResizable(false);

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.decode("#F2F2F2"));

        // Icon
        icon = new ImageIcon(getClass().getResource("/images/Icon.png"));
        this.setIconImage(icon.getImage());

        // Logo
        logo = new ImageIcon(getClass().getResource("/images/LogoBlue.png"));
        imgLabel = new JLabel(logo);
        imgLabel.setBounds(30, 50, logo.getIconWidth(), logo.getIconHeight());
        c.add(imgLabel);

        // Fonts
        f1 = new Font("Segoe UI Black", Font.PLAIN, 40);
        f2 = new Font("Segoe UI Semibold", Font.PLAIN, 30);
        f3 = new Font("Segoe UI Black", Font.PLAIN, 25);

        // Cursor for JButtons and Radio Buttons
        cursor = new Cursor(Cursor.HAND_CURSOR);

        // Title
        label1 = new JLabel();
        label1.setText("Choose region Type");
        label1.setBounds(460, 70, 500, 50);
        label1.setFont(f1);
        c.add(label1);

        // Overseas Radio Button
        overseas = new JRadioButton("Overseas");
        overseas.setBounds(480, 140, 300, 50);
        overseas.setFont(f2);
        overseas.setCursor(cursor);
        overseas.setBackground(Color.decode("#F2F2F2"));
        c.add(overseas);

        // Local Radio Button
        local = new JRadioButton("Local");
        local.setBounds(480, 200, 300, 50);
        local.setFont(f2);
        local.setCursor(cursor);
        local.setBackground(Color.decode("#F2F2F2"));
        c.add(local);

        // To group radio buttons
        radioButtonGroup = new ButtonGroup();
        radioButtonGroup.add(overseas);
        radioButtonGroup.add(local);

        // Jbuttons
        btn1 = new JButton("Exit");
        btn1.setBounds(90, 325, 215, 50);
        btn1.setFont(f3);
        btn1.setCursor(cursor);
        btn1.setForeground(Color.WHITE);
        btn1.setBackground(Color.decode("#C00000"));
        c.add(btn1);

        btn2 = new JButton("Back");
        btn2.setBounds(340, 325, 215, 50);
        btn2.setFont(f3);
        btn2.setCursor(cursor);
        btn2.setForeground(Color.WHITE);
        btn2.setBackground(Color.decode("#2E75B6"));
        c.add(btn2);

        btn3 = new JButton("Next");
        btn3.setBounds(590, 325, 215, 50);
        btn3.setFont(f3);
        btn3.setCursor(cursor);
        btn3.setForeground(Color.WHITE);
        btn3.setBackground(Color.decode("#2E75B6"));
        c.add(btn3);

        nBtn = new JButton("");
        nBtn.setBounds(0, 0, 0, 0);
        c.add(nBtn);

        Handler handler = new Handler();
        overseas.addActionListener(handler);
        local.addActionListener(handler);

        // Exit Button
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });

        // Back Button
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                Packs frame = new Packs();
                frame.setVisible(true);
                setVisible(false);
            }
        });

        // Next Button
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if (defPack == 1) {
                    oProducts frame = new oProducts();
                    frame.setVisible(true);
                    setVisible(false);
                    dispose();
                } else if (defPack == 2) {
                    lProdutcs frame = new lProdutcs();
                    frame.setVisible(true);
                    setVisible(false);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Please select Product type.", "Warning!",
                            JOptionPane.WARNING_MESSAGE);
                }
            }
        });
    }

    class Handler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == overseas) {
                defPack = 1;
            } else if (e.getSource() == local) {
                defPack = 2;
            }
        }
    }

    public static void main(String[] args) {

        DefPackTypes frame = new DefPackTypes();
        frame.setVisible(true);
    }
}