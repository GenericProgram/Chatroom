import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import static ui.Frame.FRAME;

public class ChatroomLauncher extends Frame {

    JFrame frame = new JFrame("Chatroom launcher");
    JLabel name, hostIP;
    JTextField nameText, ipText;
    JPanel panel = new JPanel();
    JButton clientBtn;
    public String nickname, ip;

    public ChatroomLauncher(){
        JFrame.setDefaultLookAndFeelDecorated(true);
        frame.setResizable(false);
        frame.setPreferredSize(new Dimension(500,200));
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);



        BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.Y_AXIS);
        panel.setLayout(boxlayout);
        panel.setBorder(new EmptyBorder(new Insets(10, 20, 10, 20)));



        name = new JLabel("Enter your nickname:");
        hostIP = new JLabel("Enter the host IP:");
        nameText = new JTextField();
        ipText= new JTextField();
        clientBtn = new JButton("Start client");
        clientBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(ipText.getText() == null || ipText.getText().isEmpty() || nameText.getText() == null || nameText.getText().isEmpty()) {
                    System.out.println("Invalid credentials");
                    System.exit(0);
                } else{
                    nickname = name.getText();
                    ip = ipText.getText();
                    frame.dispose();
                    FRAME.setVisible(true);
                }
            }
        });


        panel.add(name);
        panel.add(nameText);
        panel.add(hostIP);
        panel.add(ipText);
        panel.add(clientBtn);
        frame.add(panel);

        frame.pack();
    }
    public String getNickname() {return nickname;}
    public String getIp() {return ip;}
}
