package ui;

import javax.swing.*;
import java.awt.*;

import static ui.InfoPanel.infoPanel;
import static ui.TypePanel.typePanel;
import static ui.TextPanel.textPanel;
import static ui.ParticipantPanel.participantPanel;

public class Frame extends JFrame {
    public static final Frame FRAME = new Frame("APCS Chatroom");
    private final int WIDTH = 1000, HEIGHT = 730;

    private Frame(String s) {
        super(s);
        setSize(WIDTH, HEIGHT);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(infoPanel, BorderLayout.NORTH);



        //textbox and chatbox
        JPanel left = new JPanel();
        left.setPreferredSize(new Dimension(750, 730));
        add(left, BorderLayout.WEST);

        //list of ppl
        JPanel partition = new JPanel();
        partition.setPreferredSize(new Dimension(750,550));
        FlowLayout layout = (FlowLayout) partition.getLayout();
        layout.setVgap(0);
        layout.setHgap(0);


        left.add(partition, BorderLayout.NORTH);
        left.add(typePanel, BorderLayout.SOUTH);

        partition.add(textPanel, BorderLayout.WEST);
        partition.add(participantPanel, BorderLayout.EAST);


        pack();
    }
}
