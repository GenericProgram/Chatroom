package ui;

import ui.util.DisabledItemSelectionModel;
import ui.util.TextPanelCellRenderer;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class TextPanel extends JPanel {
    public static final TextPanel textPanel = new TextPanel();
    private DefaultListModel<String> textListModel = new DefaultListModel<>();
    private JList<String> textList;
    private int index = 0; // tracks the index of the JList element being edited

    public TextPanel() {
        super(new BorderLayout());
        setPreferredSize(new Dimension(600, 550));
        setBorder(new TitledBorder("Chat"));
        setFont(new Font("Lato", 2, 13));

        textList = new JList<>(textListModel);
        textList.setSelectionModel(new DisabledItemSelectionModel());
        textList.setCellRenderer(new TextPanelCellRenderer());
        add(textList);
    }
}
