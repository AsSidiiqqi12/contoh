package GassPuhh;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Tes extends JFrame {
    private JTextArea textArea1;
    private JButton tombolButton;
    private JPanel Main;
    private JTextField textField1;
    private JButton cariButton;


    public Tes() {
        this.setTitle("Gass Puhh");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(420,420);
        this.setVisible(true);
        this.setResizable(true);
        this.setContentPane(Main);

        TesFile test = new TesFile();
        test.untukTombol();

        tombolButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tes = test.cari();
                textArea1.setText(tes);
            }
        });
        cariButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tes = test.urut(textField1.getText());
                JOptionPane.showMessageDialog(Main,tes);

            }
        });
    }




}
