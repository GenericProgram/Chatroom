package ui;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class TypePanel extends JPanel {
    public static final TypePanel typePanel = new TypePanel();
    JTextField textField = new JTextField();

    private TypePanel() {
        super(new GridLayout(2, 3));
        setPreferredSize(new Dimension(750, 170));
        setBorder(new TitledBorder("Send message"));


        add(textField);
    }
}
