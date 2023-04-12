package ui;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class InfoPanel extends JPanel {
    public static InfoPanel infoPanel = new InfoPanel();
    private JLabel hostIpLabel, participantLabel;

    private InfoPanel() {
        super(new BorderLayout());
        setPreferredSize(new Dimension(900, 18));

        hostIpLabel = new JLabel();
        hostIpLabel.setBorder(new EmptyBorder(5, 5, 0, 0));
        add(hostIpLabel, BorderLayout.WEST);


        participantLabel = new JLabel("Number of participants: ");
        participantLabel.setBorder(new EmptyBorder(5, 0, 0, 5));
        add(participantLabel, BorderLayout.EAST);
    }

    public void setParticipantLabel(String text) {
        participantLabel.setText(text);
    }


}