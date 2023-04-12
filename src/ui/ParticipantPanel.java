package ui;

import ui.util.DisabledItemSelectionModel;
import ui.util.PListCellRenderer;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class ParticipantPanel extends JPanel {
    public static final ParticipantPanel participantPanel = new ParticipantPanel();
    private DefaultListModel<String> participantListModel = new DefaultListModel<>();
    private JList<String> participantList;

    private ParticipantPanel() {
        super(new BorderLayout());
        setPreferredSize(new Dimension(150, 550));
        setBorder(new TitledBorder("Current participants"));

        participantList = new JList<>(participantListModel);
        participantList.setSelectionModel(new DisabledItemSelectionModel());
        participantList.setCellRenderer(new PListCellRenderer());
        add(participantList);
    }

    public void addPerson(String name){
        participantListModel.addElement(name);
    }
    public void removePerson(String name){
        participantListModel.removeElement(name);
    }
}