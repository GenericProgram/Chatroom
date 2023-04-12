package ui;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.Frame;

public class ConfigFrame extends Frame {

    JFrame frame = new JFrame("Chatroom configuration");
    JLabel name, hostIP;
    JTextField nameText, ipText;
    JPanel panel = new JPanel();

    public ConfigFrame(){
        JFrame.setDefaultLookAndFeelDecorated(true);
        frame.setResizable(false);
        frame.setPreferredSize(new Dimension(500,150));
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);



        BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.Y_AXIS);
        panel.setLayout(boxlayout);
        panel.setBorder(new EmptyBorder(new Insets(10, 20, 10, 20)));



        name = new JLabel("Enter your nickname:");
        hostIP = new JLabel("Enter the host IP:");
        nameText = new JTextField();
        ipText= new JTextField();

        panel.add(name);
        panel.add(nameText);
        panel.add(hostIP);
        panel.add(ipText);
        frame.add(panel);

        frame.pack();
    }
}
