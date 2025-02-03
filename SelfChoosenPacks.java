import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.lang.*;

public class SelfChoosenPacks extends JFrame {

    private Container c;
    private ImageIcon icon, logo;
    private JLabel label0, label1, imgLabel;
    private Font f1, f2, f3, f4, f5, f6;
    private JComboBox cb1, cb2, cb3, cb4, cb5, cb6, cb7;
    private JButton btn1, btn2, btn3, btn4, nBtn;
    private Cursor cursor;

    SelfChoosenPacks() {
        // Frame Layout
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("SRDS MART");
        this.setSize(900, 480);
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
        imgLabel.setBounds(30, 65, logo.getIconWidth(), logo.getIconHeight());
        c.add(imgLabel);

        // Fonts
        f1 = new Font("Segoe UI Black", Font.PLAIN, 35);
        f2 = new Font("Segoe UI Black", Font.PLAIN, 25);
        f3 = new Font("Segoe UI Semibold", Font.PLAIN, 35);
        f4 = new Font("Segoe UI", Font.PLAIN, 25);
        f5 = new Font("Segoe UI", Font.PLAIN, 19);
        f6 = new Font("Segoe UI", Font.PLAIN, 25);

        // Cursor for JButtons
        cursor = new Cursor(Cursor.HAND_CURSOR);

        // Title
        label1 = new JLabel();
        label1.setText("Select Product Details");
        label1.setBounds(430, 25, 500, 50);
        label1.setFont(f1);
        c.add(label1);

        

        cb6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                int s = cb6.getSelectedIndex();
                if (s == 0) {
                    cb7.removeAllItems();
                    cb7.addItem("Select vehicle First!");
                } else if (s == 1) {
                    cb7.removeAllItems();
                    cb7.addItem("Select train type...");
                    cb7.addItem("AC Sleeping Couch (750 tk)");
                    cb7.addItem("AC Seating Couch (520 tk)");
                    cb7.addItem("AC Train (440 tk)");
                    cb7.addItem("Non-AC Train (250 tk)");
                    cb7.enable();
                } else if (s == 2) {
                    cb7.removeAllItems();
                    cb7.addItem("Select bus type...");
                    cb7.addItem("AC Bus (2500 tk)");
                    cb7.addItem("Non-AC Bus (900 tk)");
                    cb7.enable();
                } else if (s == 3) {
                    cb7.removeAllItems();
                    cb7.addItem("No different types available...");
                }
            }
        });

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
                Packs frame = new Packs();
                frame.setVisible(true);
            }
        });

        // Reset Button
        btn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                setVisible(false);
                SelfChoosenPacks frame = new SelfChoosenPacks();
                frame.setVisible(true);
            }
        });

        // Next Button
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if ((cb1.getSelectedIndex()) == 0) {
                    JOptionPane.showMessageDialog(null, "You forgot to select tour type.", "Warning!",
                            JOptionPane.WARNING_MESSAGE);
                } else if ((cb2.getSelectedIndex()) == 0) {
                    JOptionPane.showMessageDialog(null, "You forgot to select destination.", "Warning!",
                            JOptionPane.WARNING_MESSAGE);
                } else if ((cb3.getSelectedIndex()) == 0) {
                    JOptionPane.showMessageDialog(null, "You forgot to select total person number.", "Warning!",
                            JOptionPane.WARNING_MESSAGE);
                } else if ((cb4.getSelectedIndex()) == 0) {
                    JOptionPane.showMessageDialog(null, "You forgot to select total number of days.", "Warning!",
                            JOptionPane.WARNING_MESSAGE);
                } else if ((cb5.getSelectedIndex()) == 0) {
                    JOptionPane.showMessageDialog(null, "You forgot to select total hotel type.", "Warning!",
                            JOptionPane.WARNING_MESSAGE);
                } else if (((cb1.getSelectedIndex()) == 2) && ((cb6.getSelectedIndex()) == 0)) {
                    JOptionPane.showMessageDialog(null, "You forgot to select travel by.", "Warning!",
                            JOptionPane.WARNING_MESSAGE);
                } else if (((cb1.getSelectedIndex()) == 2) && ((cb6.getSelectedIndex()) != 3)
                        && ((cb7.getSelectedIndex()) == 0)) {
                    JOptionPane.showMessageDialog(null, "You forgot to select Vehicle Type.", "Warning!",
                            JOptionPane.WARNING_MESSAGE);
                } else {
                    if ((cb1.getSelectedIndex()) == 1) {
                        int cb1Cost = 100;
                        int cb2Cost = 0;

                        if (cb2.getSelectedIndex() == 1) {
                            cb2Cost = 300;
                        } else if (cb2.getSelectedIndex() == 2) {
                            cb2Cost = 280;
                        } else if (cb2.getSelectedIndex() == 3) {
                            cb2Cost = 269;
                        } else if (cb2.getSelectedIndex() == 4) {
                            cb2Cost = 250;
                        } else if (cb2.getSelectedIndex() == 4) {
                            cb2Cost = 100;
                        }

                        int cb3Cost = 200 * (cb3.getSelectedIndex());
                        int cb5Cost = 0;

                        if (cb5.getSelectedIndex() == 1) {
                            cb5Cost = 50;
                        } else if (cb5.getSelectedIndex() == 2) {
                            cb5Cost = 69;
                        } else if (cb5.getSelectedIndex() == 3) {
                            cb5Cost = 80;
                        } else if (cb5.getSelectedIndex() == 4) {
                            cb5Cost = 120;
                        } else if (cb5.getSelectedIndex() == 5) {
                            cb5Cost = 220;
                        }

                        int cb4Cost = cb5Cost * cb4.getSelectedIndex();
                        int cb6Cost = 500;
                        int totalCost = cb1Cost + cb2Cost + cb3Cost + cb4Cost;

                        JOptionPane.showMessageDialog(null, "Total Cost : $" + totalCost, "Travel Agency!",
                                JOptionPane.INFORMATION_MESSAGE);

                        setVisible(false);
                        Payment frame = new Payment();
                        frame.setVisible(true);

                    } else if ((cb1.getSelectedIndex()) == 2) {
                        int cb1Cost = 10000;
                        int cb2Cost = 0;

                        if (cb2.getSelectedIndex() == 1) {
                            cb2Cost = 7000;
                        } else if (cb2.getSelectedIndex() == 2) {
                            cb2Cost = 6000;
                        } else if (cb2.getSelectedIndex() == 3) {
                            cb2Cost = 5000;
                        } else if (cb2.getSelectedIndex() == 4) {
                            cb2Cost = 4000;
                        } else if (cb2.getSelectedIndex() == 5) {
                            cb2Cost = 3000;
                        } else if (cb2.getSelectedIndex() == 6) {
                            cb2Cost = 2800;
                        }

                        int cb3Cost = 2000 * (cb3.getSelectedIndex());
                        int cb5Cost = 0;

                        if (cb5.getSelectedIndex() == 1) {
                            cb5Cost = 2000;
                        } else if (cb5.getSelectedIndex() == 2) {
                            cb5Cost = 3500;
                        } else if (cb5.getSelectedIndex() == 3) {
                            cb5Cost = 5000;
                        } else if (cb5.getSelectedIndex() == 4) {
                            cb5Cost = 8000;
                        } else if (cb5.getSelectedIndex() == 4) {
                            cb5Cost = 12000;
                        }

                        int cb4Cost = cb5Cost * cb4.getSelectedIndex();
                        int cb7Cost = 0;

                        if (cb6.getSelectedIndex() == 1) {
                            if (cb7.getSelectedIndex() == 1) {
                                cb7Cost = 750;
                            } else if (cb7.getSelectedIndex() == 2) {
                                cb7Cost = 520;
                            } else if (cb7.getSelectedIndex() == 3) {
                                cb7Cost = 440;
                            } else if (cb7.getSelectedIndex() == 4) {
                                cb7Cost = 250;
                            }
                        } else if (cb6.getSelectedIndex() == 2) {
                            if (cb7.getSelectedIndex() == 1) {
                                cb7Cost = 2500;
                            } else if (cb7.getSelectedIndex() == 2) {
                                cb7Cost = 900;
                            }
                        } else if (cb6.getSelectedIndex() == 3) {
                            cb7Cost = 12000;
                        }

                        int totalCost = cb1Cost + cb2Cost + cb3Cost + cb4Cost + cb5Cost + cb7Cost;

                        JOptionPane.showMessageDialog(null, "Total Cost : " + totalCost + " tk", "Travel Agency!",
                                JOptionPane.INFORMATION_MESSAGE);

                        setVisible(false);
                        Payment frame = new Payment();
                        frame.setVisible(true);
                    }
                }
            }
        });
    }

    public static void main(String[] args) {

        SelfChoosenPacks frame = new SelfChoosenPacks();
        frame.setVisible(true);
    }
}
