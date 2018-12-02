import org.apache.commons.math3.optim.MaxIter;
import org.apache.commons.math3.optim.PointValuePair;
import org.apache.commons.math3.optim.linear.*;
import org.apache.commons.math3.optim.nonlinear.scalar.GoalType;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collection;

public class SimplexFormMax extends JFrame {
    private JPanel FormMaxPanel;
    private JPanel MaxPanel;
    private JPanel MaxXPanel;
    private JTextField funcX1;
    private JTextField funcX2;
    private JTextField funcX3;
    private JTextField funcX4;
    private JTextField funcX5;
    private JTextField funcConst;
    private JPanel MaxXPanel2;
    private JTextField constX11;
    private JTextField constX12;
    private JTextField constX13;
    private JTextField constX14;
    private JTextField constX15;
    private JTextField freeMember1;
    private JPanel MaxXPanel3;
    private JTextField constX21;
    private JTextField constX22;
    private JTextField constX23;
    private JTextField constX24;
    private JTextField constX25;
    private JComboBox comboBox2;
    private JTextField freeMember2;
    private JPanel MaxXPanel4;
    private JTextField constX31;
    private JTextField constX32;
    private JTextField constX33;
    private JTextField constX34;
    private JTextField constX35;
    private JComboBox comboBox3;
    private JTextField freeMember3;
    private JPanel MaxXPanel5;
    private JTextField constX41;
    private JTextField constX42;
    private JTextField constX43;
    private JTextField constX44;
    private JTextField constX45;
    private JComboBox comboBox4;
    private JTextField freeMember4;
    private JPanel MaxXPanel6;
    private JTextField constX52;
    private JTextField constX53;
    private JTextField constX54;
    private JTextField constX55;
    private JComboBox comboBox5;
    private JTextField freeMember5;
    private JTextField constX51;
    private JTextField optimalX;
    private JTextField optimalF;
    private JPanel XPanel;
    private JPanel Labels;
    private JPanel Panel;
    private JButton calculate;
    private JComboBox comboBox1;
    private JComboBox comboBox6;

    public SimplexFormMax() {
        calculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    LinearObjectiveFunction functionValues = new LinearObjectiveFunction(new double[]{
                            Double.valueOf(funcX1.getText()),
                            Double.valueOf(funcX2.getText()),
                            Double.valueOf(funcX3.getText()),
                            Double.valueOf(funcX4.getText()),
                            Double.valueOf(funcX5.getText())},
                            Double.valueOf(funcConst.getText()));
                    Collection<LinearConstraint> constraints = new
                            ArrayList<LinearConstraint>();
                    if (comboBox1.getSelectedItem().toString() == ">=") {
                        constraints.add(new LinearConstraint(new double[]{
                                Double.valueOf(constX11.getText()),
                                Double.valueOf(constX12.getText()),
                                Double.valueOf(constX13.getText()),
                                Double.valueOf(constX14.getText()),
                                Double.valueOf(constX15.getText())},
                                Relationship.GEQ,
                                Double.valueOf(freeMember1.getText())));
                    }
                    if (comboBox1.getSelectedItem().toString() == "<=") {
                        constraints.add(new LinearConstraint(new double[]{
                                Double.valueOf(constX11.getText()),
                                Double.valueOf(constX12.getText()),
                                Double.valueOf(constX13.getText()),
                                Double.valueOf(constX14.getText()),
                                Double.valueOf(constX15.getText())},
                                Relationship.LEQ,
                                Double.valueOf(freeMember1.getText())));
                    }
                    if (comboBox1.getSelectedItem().toString() == "=") {
                        constraints.add(new LinearConstraint(new double[]{
                                Double.valueOf(constX11.getText()),
                                Double.valueOf(constX12.getText()),
                                Double.valueOf(constX13.getText()),
                                Double.valueOf(constX14.getText()),
                                Double.valueOf(constX15.getText())},
                                Relationship.EQ,
                                Double.valueOf(freeMember1.getText())));
                    }
                    if (comboBox2.getSelectedItem().toString() == ">=") {
                        constraints.add(new LinearConstraint(new double[]{
                                Double.valueOf(constX21.getText()),
                                Double.valueOf(constX22.getText()),
                                Double.valueOf(constX23.getText()),
                                Double.valueOf(constX24.getText()),
                                Double.valueOf(constX25.getText())},
                                Relationship.GEQ,
                                Double.valueOf(freeMember2.getText())));
                    }
                    if (comboBox2.getSelectedItem().toString() == "<=") {
                        constraints.add(new LinearConstraint(new double[]{
                                Double.valueOf(constX21.getText()),
                                Double.valueOf(constX22.getText()),
                                Double.valueOf(constX23.getText()),
                                Double.valueOf(constX24.getText()),
                                Double.valueOf(constX25.getText())},
                                Relationship.LEQ,
                                Double.valueOf(freeMember2.getText())));
                    }
                    if (comboBox2.getSelectedItem().toString() == "=") {
                        constraints.add(new LinearConstraint(new double[]{
                                Double.valueOf(constX21.getText()),
                                Double.valueOf(constX22.getText()),
                                Double.valueOf(constX23.getText()),
                                Double.valueOf(constX24.getText()),
                                Double.valueOf(constX25.getText())},
                                Relationship.EQ,
                                Double.valueOf(freeMember2.getText())));
                    }
                    if (comboBox3.getSelectedItem().toString() == ">=") {
                        constraints.add(new LinearConstraint(new double[]{
                                Double.valueOf(constX31.getText()),
                                Double.valueOf(constX32.getText()),
                                Double.valueOf(constX33.getText()),
                                Double.valueOf(constX34.getText()),
                                Double.valueOf(constX35.getText())},
                                Relationship.GEQ,
                                Double.valueOf(freeMember3.getText())));
                    }
                    if (comboBox3.getSelectedItem().toString() == "<=") {
                        constraints.add(new LinearConstraint(new double[]{
                                Double.valueOf(constX31.getText()),
                                Double.valueOf(constX32.getText()),
                                Double.valueOf(constX33.getText()),
                                Double.valueOf(constX34.getText()),
                                Double.valueOf(constX35.getText())},
                                Relationship.LEQ,
                                Double.valueOf(freeMember3.getText())));
                    }
                    if (comboBox3.getSelectedItem().toString() == "=") {
                        constraints.add(new LinearConstraint(new double[]{
                                Double.valueOf(constX31.getText()),
                                Double.valueOf(constX32.getText()),
                                Double.valueOf(constX33.getText()),
                                Double.valueOf(constX34.getText()),
                                Double.valueOf(constX35.getText())},
                                Relationship.EQ,
                                Double.valueOf(freeMember3.getText())));
                    }
                    if (comboBox4.getSelectedItem().toString() == ">=") {
                        constraints.add(new LinearConstraint(new double[]{
                                Double.valueOf(constX41.getText()),
                                Double.valueOf(constX42.getText()),
                                Double.valueOf(constX43.getText()),
                                Double.valueOf(constX44.getText()),
                                Double.valueOf(constX45.getText())},
                                Relationship.GEQ,
                                Double.valueOf(freeMember4.getText())));
                    }
                    if (comboBox4.getSelectedItem().toString() == "<=") {
                        constraints.add(new LinearConstraint(new double[]{
                                Double.valueOf(constX41.getText()),
                                Double.valueOf(constX42.getText()),
                                Double.valueOf(constX43.getText()),
                                Double.valueOf(constX44.getText()),
                                Double.valueOf(constX45.getText())},
                                Relationship.LEQ,
                                Double.valueOf(freeMember4.getText())));
                    }
                    if (comboBox4.getSelectedItem().toString() == "=") {
                        constraints.add(new LinearConstraint(new double[]{
                                Double.valueOf(constX41.getText()),
                                Double.valueOf(constX42.getText()),
                                Double.valueOf(constX43.getText()),
                                Double.valueOf(constX44.getText()),
                                Double.valueOf(constX45.getText())},
                                Relationship.EQ,
                                Double.valueOf(freeMember4.getText())));
                    }
                    if (comboBox5.getSelectedItem().toString() == ">=") {
                        constraints.add(new LinearConstraint(new double[]{
                                Double.valueOf(constX51.getText()),
                                Double.valueOf(constX52.getText()),
                                Double.valueOf(constX53.getText()),
                                Double.valueOf(constX54.getText()),
                                Double.valueOf(constX55.getText())},
                                Relationship.GEQ,
                                Double.valueOf(freeMember5.getText())));
                    }
                    if (comboBox5.getSelectedItem().toString() == "<=") {
                        constraints.add(new LinearConstraint(new double[]{
                                Double.valueOf(constX51.getText()),
                                Double.valueOf(constX52.getText()),
                                Double.valueOf(constX53.getText()),
                                Double.valueOf(constX54.getText()),
                                Double.valueOf(constX55.getText())},
                                Relationship.LEQ,
                                Double.valueOf(freeMember5.getText())));
                    }
                    if (comboBox5.getSelectedItem().toString() == "=") {
                        constraints.add(new LinearConstraint(new double[]{
                                Double.valueOf(constX51.getText()),
                                Double.valueOf(constX52.getText()),
                                Double.valueOf(constX53.getText()),
                                Double.valueOf(constX54.getText()),
                                Double.valueOf(constX55.getText())},
                                Relationship.EQ,
                                Double.valueOf(freeMember5.getText())));
                    }
                    SimplexSolver solver = new SimplexSolver();
                    PointValuePair solution = solver.optimize(new MaxIter(100), functionValues, new
                                    LinearConstraintSet(constraints),
                            comboBox6.getSelectedItem().toString().equals("max") ? GoalType.MAXIMIZE : GoalType.MINIMIZE, new
                                    NonNegativeConstraint(true));
                    optimalX.setText(solution.getPoint()[0] + ", " + solution.getPoint()[1] + ", " + solution.getPoint()[2]
                            + ", " + solution.getPoint()[3] + ", " + solution.getPoint()[4]);
                    optimalF.setText(solution.getValue().toString());
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Предметная область задана неверно либо имеет бесконечное множество решений или не имеет решения");
                }
            }
        });
    }

    public void run() {
        this.getContentPane().add(this.Panel);
    }

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        Panel = new JPanel();
        Panel.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        FormMaxPanel = new JPanel();
        FormMaxPanel.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(2, 1, new Insets(0, 0, 0, 0), -1, -1));
        FormMaxPanel.setBackground(new Color(-11859185));
        Panel.add(FormMaxPanel, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        final JLabel label1 = new JLabel();
        Font label1Font = this.$$$getFont$$$(null, Font.BOLD, 24, label1.getFont());
        if (label1Font != null) label1.setFont(label1Font);
        label1.setForeground(new Color(-7145341));
        label1.setText("Симплекс метод ");
        FormMaxPanel.add(label1, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        MaxPanel = new JPanel();
        MaxPanel.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(13, 4, new Insets(0, 0, 0, 0), -1, -1));
        MaxPanel.setBackground(new Color(-11859185));
        Font MaxPanelFont = this.$$$getFont$$$(null, Font.BOLD, 16, MaxPanel.getFont());
        if (MaxPanelFont != null) MaxPanel.setFont(MaxPanelFont);
        MaxPanel.setForeground(new Color(-859427));
        FormMaxPanel.add(MaxPanel, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_NORTH, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, new Dimension(469, 100), null, 0, false));
        final JLabel label2 = new JLabel();
        Font label2Font = this.$$$getFont$$$(null, Font.BOLD, 16, label2.getFont());
        if (label2Font != null) label2.setFont(label2Font);
        label2.setForeground(new Color(-859427));
        label2.setText("Прибыль =");
        MaxPanel.add(label2, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 4, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        MaxXPanel = new JPanel();
        MaxXPanel.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(1, 12, new Insets(0, 0, 0, 0), -1, -1));
        MaxXPanel.setBackground(new Color(-11859185));
        MaxPanel.add(MaxXPanel, new com.intellij.uiDesigner.core.GridConstraints(2, 0, 1, 4, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_NORTH, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, new Dimension(465, 44), null, 0, false));
        funcX1 = new JTextField();
        funcX1.setBackground(new Color(-859427));
        funcX1.setForeground(new Color(-16775406));
        funcX1.setText("0");
        MaxXPanel.add(funcX1, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(50, -1), null, 0, false));
        funcX2 = new JTextField();
        funcX2.setBackground(new Color(-859427));
        funcX2.setForeground(new Color(-16775406));
        funcX2.setText("0");
        MaxXPanel.add(funcX2, new com.intellij.uiDesigner.core.GridConstraints(0, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(50, -1), null, 0, false));
        funcX3 = new JTextField();
        funcX3.setBackground(new Color(-859427));
        funcX3.setForeground(new Color(-16775406));
        funcX3.setText("0");
        MaxXPanel.add(funcX3, new com.intellij.uiDesigner.core.GridConstraints(0, 4, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(50, -1), null, 0, false));
        funcX4 = new JTextField();
        funcX4.setBackground(new Color(-859427));
        funcX4.setForeground(new Color(-16775406));
        funcX4.setText("0");
        MaxXPanel.add(funcX4, new com.intellij.uiDesigner.core.GridConstraints(0, 6, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(50, -1), null, 0, false));
        funcX5 = new JTextField();
        funcX5.setBackground(new Color(-859427));
        funcX5.setForeground(new Color(-16775406));
        funcX5.setText("0");
        MaxXPanel.add(funcX5, new com.intellij.uiDesigner.core.GridConstraints(0, 8, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(50, -1), null, 0, false));
        final JLabel label3 = new JLabel();
        Font label3Font = this.$$$getFont$$$(null, Font.BOLD, 14, label3.getFont());
        if (label3Font != null) label3.setFont(label3Font);
        label3.setText("+");
        MaxXPanel.add(label3, new com.intellij.uiDesigner.core.GridConstraints(0, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label4 = new JLabel();
        Font label4Font = this.$$$getFont$$$(null, Font.BOLD, 14, label4.getFont());
        if (label4Font != null) label4.setFont(label4Font);
        label4.setText("+");
        MaxXPanel.add(label4, new com.intellij.uiDesigner.core.GridConstraints(0, 3, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label5 = new JLabel();
        Font label5Font = this.$$$getFont$$$(null, Font.BOLD, 14, label5.getFont());
        if (label5Font != null) label5.setFont(label5Font);
        label5.setText("+");
        MaxXPanel.add(label5, new com.intellij.uiDesigner.core.GridConstraints(0, 5, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label6 = new JLabel();
        Font label6Font = this.$$$getFont$$$(null, Font.BOLD, 14, label6.getFont());
        if (label6Font != null) label6.setFont(label6Font);
        label6.setText("+");
        MaxXPanel.add(label6, new com.intellij.uiDesigner.core.GridConstraints(0, 7, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label7 = new JLabel();
        Font label7Font = this.$$$getFont$$$(null, Font.BOLD, 14, label7.getFont());
        if (label7Font != null) label7.setFont(label7Font);
        label7.setText("+");
        MaxXPanel.add(label7, new com.intellij.uiDesigner.core.GridConstraints(0, 9, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        funcConst = new JTextField();
        funcConst.setBackground(new Color(-859427));
        funcConst.setForeground(new Color(-16775406));
        funcConst.setText("0");
        MaxXPanel.add(funcConst, new com.intellij.uiDesigner.core.GridConstraints(0, 10, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(50, -1), null, 0, false));
        comboBox6 = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel1 = new DefaultComboBoxModel();
        defaultComboBoxModel1.addElement("max");
        defaultComboBoxModel1.addElement("min");
        comboBox6.setModel(defaultComboBoxModel1);
        MaxXPanel.add(comboBox6, new com.intellij.uiDesigner.core.GridConstraints(0, 11, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label8 = new JLabel();
        Font label8Font = this.$$$getFont$$$(null, Font.BOLD, 16, label8.getFont());
        if (label8Font != null) label8.setFont(label8Font);
        label8.setForeground(new Color(-859427));
        label8.setText("Ограничения ");
        MaxPanel.add(label8, new com.intellij.uiDesigner.core.GridConstraints(3, 0, 1, 4, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        MaxXPanel2 = new JPanel();
        MaxXPanel2.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(1, 11, new Insets(0, 0, 0, 0), -1, -1));
        MaxXPanel2.setBackground(new Color(-11859185));
        MaxPanel.add(MaxXPanel2, new com.intellij.uiDesigner.core.GridConstraints(5, 0, 1, 4, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_NORTH, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, new Dimension(465, 44), null, 0, false));
        constX11 = new JTextField();
        constX11.setBackground(new Color(-859427));
        constX11.setForeground(new Color(-16775406));
        constX11.setText("0");
        MaxXPanel2.add(constX11, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(50, -1), null, 0, false));
        constX12 = new JTextField();
        constX12.setBackground(new Color(-859427));
        constX12.setForeground(new Color(-16775406));
        constX12.setText("0");
        MaxXPanel2.add(constX12, new com.intellij.uiDesigner.core.GridConstraints(0, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(50, -1), null, 0, false));
        constX13 = new JTextField();
        constX13.setBackground(new Color(-859427));
        constX13.setForeground(new Color(-16775406));
        constX13.setText("0");
        MaxXPanel2.add(constX13, new com.intellij.uiDesigner.core.GridConstraints(0, 4, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(50, -1), null, 0, false));
        constX14 = new JTextField();
        constX14.setBackground(new Color(-859427));
        constX14.setForeground(new Color(-16775406));
        constX14.setText("0");
        MaxXPanel2.add(constX14, new com.intellij.uiDesigner.core.GridConstraints(0, 6, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(50, -1), null, 0, false));
        constX15 = new JTextField();
        constX15.setBackground(new Color(-859427));
        constX15.setForeground(new Color(-16775406));
        constX15.setText("0");
        MaxXPanel2.add(constX15, new com.intellij.uiDesigner.core.GridConstraints(0, 8, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(50, -1), null, 0, false));
        final JLabel label9 = new JLabel();
        Font label9Font = this.$$$getFont$$$(null, Font.BOLD, 14, label9.getFont());
        if (label9Font != null) label9.setFont(label9Font);
        label9.setText("+");
        MaxXPanel2.add(label9, new com.intellij.uiDesigner.core.GridConstraints(0, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label10 = new JLabel();
        Font label10Font = this.$$$getFont$$$(null, Font.BOLD, 14, label10.getFont());
        if (label10Font != null) label10.setFont(label10Font);
        label10.setText("+");
        MaxXPanel2.add(label10, new com.intellij.uiDesigner.core.GridConstraints(0, 3, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label11 = new JLabel();
        Font label11Font = this.$$$getFont$$$(null, Font.BOLD, 14, label11.getFont());
        if (label11Font != null) label11.setFont(label11Font);
        label11.setText("+");
        MaxXPanel2.add(label11, new com.intellij.uiDesigner.core.GridConstraints(0, 5, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label12 = new JLabel();
        Font label12Font = this.$$$getFont$$$(null, Font.BOLD, 14, label12.getFont());
        if (label12Font != null) label12.setFont(label12Font);
        label12.setText("+");
        MaxXPanel2.add(label12, new com.intellij.uiDesigner.core.GridConstraints(0, 7, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        comboBox1 = new JComboBox();
        comboBox1.setBackground(new Color(-16775406));
        comboBox1.setEditable(false);
        Font comboBox1Font = this.$$$getFont$$$(null, Font.BOLD, 14, comboBox1.getFont());
        if (comboBox1Font != null) comboBox1.setFont(comboBox1Font);
        comboBox1.setForeground(new Color(-7145341));
        final DefaultComboBoxModel defaultComboBoxModel2 = new DefaultComboBoxModel();
        defaultComboBoxModel2.addElement(">=");
        defaultComboBoxModel2.addElement("<=");
        defaultComboBoxModel2.addElement("=");
        comboBox1.setModel(defaultComboBoxModel2);
        MaxXPanel2.add(comboBox1, new com.intellij.uiDesigner.core.GridConstraints(0, 9, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(10, -1), null, 0, false));
        freeMember1 = new JTextField();
        freeMember1.setBackground(new Color(-859427));
        freeMember1.setForeground(new Color(-16775406));
        MaxXPanel2.add(freeMember1, new com.intellij.uiDesigner.core.GridConstraints(0, 10, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_EAST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(50, -1), null, 0, false));
        final JLabel label13 = new JLabel();
        Font label13Font = this.$$$getFont$$$(null, Font.BOLD, 16, label13.getFont());
        if (label13Font != null) label13.setFont(label13Font);
        label13.setForeground(new Color(-859427));
        label13.setText("Результат");
        MaxPanel.add(label13, new com.intellij.uiDesigner.core.GridConstraints(10, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label14 = new JLabel();
        Font label14Font = this.$$$getFont$$$(null, Font.BOLD, 16, label14.getFont());
        if (label14Font != null) label14.setFont(label14Font);
        label14.setForeground(new Color(-859427));
        label14.setText("Выбор количества цветов: ");
        MaxPanel.add(label14, new com.intellij.uiDesigner.core.GridConstraints(11, 0, 1, 2, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label15 = new JLabel();
        Font label15Font = this.$$$getFont$$$(null, Font.BOLD, 16, label15.getFont());
        if (label15Font != null) label15.setFont(label15Font);
        label15.setForeground(new Color(-859427));
        label15.setText("Прибыль = ");
        MaxPanel.add(label15, new com.intellij.uiDesigner.core.GridConstraints(12, 0, 1, 3, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        MaxXPanel3 = new JPanel();
        MaxXPanel3.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(1, 11, new Insets(0, 0, 0, 0), -1, -1));
        MaxXPanel3.setBackground(new Color(-11859185));
        MaxPanel.add(MaxXPanel3, new com.intellij.uiDesigner.core.GridConstraints(6, 0, 1, 4, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_NORTH, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, new Dimension(465, 44), null, 0, false));
        constX21 = new JTextField();
        constX21.setBackground(new Color(-859427));
        constX21.setForeground(new Color(-16775406));
        constX21.setText("0");
        MaxXPanel3.add(constX21, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(50, -1), null, 0, false));
        constX22 = new JTextField();
        constX22.setBackground(new Color(-859427));
        constX22.setForeground(new Color(-16775406));
        constX22.setText("0");
        MaxXPanel3.add(constX22, new com.intellij.uiDesigner.core.GridConstraints(0, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(50, -1), null, 0, false));
        constX23 = new JTextField();
        constX23.setBackground(new Color(-859427));
        constX23.setForeground(new Color(-16775406));
        constX23.setText("0");
        MaxXPanel3.add(constX23, new com.intellij.uiDesigner.core.GridConstraints(0, 4, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(50, -1), null, 0, false));
        constX24 = new JTextField();
        constX24.setBackground(new Color(-859427));
        constX24.setForeground(new Color(-16775406));
        constX24.setText("0");
        MaxXPanel3.add(constX24, new com.intellij.uiDesigner.core.GridConstraints(0, 6, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(50, -1), null, 0, false));
        constX25 = new JTextField();
        constX25.setBackground(new Color(-859427));
        constX25.setForeground(new Color(-16775406));
        constX25.setText("0");
        MaxXPanel3.add(constX25, new com.intellij.uiDesigner.core.GridConstraints(0, 8, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(50, -1), null, 0, false));
        final JLabel label16 = new JLabel();
        Font label16Font = this.$$$getFont$$$(null, Font.BOLD, 14, label16.getFont());
        if (label16Font != null) label16.setFont(label16Font);
        label16.setText("+");
        MaxXPanel3.add(label16, new com.intellij.uiDesigner.core.GridConstraints(0, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label17 = new JLabel();
        Font label17Font = this.$$$getFont$$$(null, Font.BOLD, 14, label17.getFont());
        if (label17Font != null) label17.setFont(label17Font);
        label17.setText("+");
        MaxXPanel3.add(label17, new com.intellij.uiDesigner.core.GridConstraints(0, 3, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label18 = new JLabel();
        Font label18Font = this.$$$getFont$$$(null, Font.BOLD, 14, label18.getFont());
        if (label18Font != null) label18.setFont(label18Font);
        label18.setText("+");
        MaxXPanel3.add(label18, new com.intellij.uiDesigner.core.GridConstraints(0, 5, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label19 = new JLabel();
        Font label19Font = this.$$$getFont$$$(null, Font.BOLD, 14, label19.getFont());
        if (label19Font != null) label19.setFont(label19Font);
        label19.setText("+");
        MaxXPanel3.add(label19, new com.intellij.uiDesigner.core.GridConstraints(0, 7, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        comboBox2 = new JComboBox();
        comboBox2.setBackground(new Color(-16775406));
        comboBox2.setEditable(false);
        Font comboBox2Font = this.$$$getFont$$$(null, Font.BOLD, 14, comboBox2.getFont());
        if (comboBox2Font != null) comboBox2.setFont(comboBox2Font);
        comboBox2.setForeground(new Color(-7145341));
        final DefaultComboBoxModel defaultComboBoxModel3 = new DefaultComboBoxModel();
        defaultComboBoxModel3.addElement(">=");
        defaultComboBoxModel3.addElement("<=");
        defaultComboBoxModel3.addElement("=");
        comboBox2.setModel(defaultComboBoxModel3);
        MaxXPanel3.add(comboBox2, new com.intellij.uiDesigner.core.GridConstraints(0, 9, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(10, -1), null, 0, false));
        freeMember2 = new JTextField();
        freeMember2.setBackground(new Color(-859427));
        freeMember2.setForeground(new Color(-16775406));
        MaxXPanel3.add(freeMember2, new com.intellij.uiDesigner.core.GridConstraints(0, 10, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_EAST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(50, -1), null, 0, false));
        MaxXPanel4 = new JPanel();
        MaxXPanel4.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(1, 11, new Insets(0, 0, 0, 0), -1, -1));
        MaxXPanel4.setBackground(new Color(-11859185));
        MaxPanel.add(MaxXPanel4, new com.intellij.uiDesigner.core.GridConstraints(7, 0, 1, 4, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_NORTH, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, new Dimension(465, 44), null, 0, false));
        constX31 = new JTextField();
        constX31.setBackground(new Color(-859427));
        constX31.setForeground(new Color(-16775406));
        constX31.setText("0");
        MaxXPanel4.add(constX31, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(50, -1), null, 0, false));
        constX32 = new JTextField();
        constX32.setBackground(new Color(-859427));
        constX32.setForeground(new Color(-16775406));
        constX32.setText("0");
        MaxXPanel4.add(constX32, new com.intellij.uiDesigner.core.GridConstraints(0, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(50, -1), null, 0, false));
        constX33 = new JTextField();
        constX33.setBackground(new Color(-859427));
        constX33.setForeground(new Color(-16775406));
        constX33.setText("0");
        MaxXPanel4.add(constX33, new com.intellij.uiDesigner.core.GridConstraints(0, 4, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(50, -1), null, 0, false));
        constX34 = new JTextField();
        constX34.setBackground(new Color(-859427));
        constX34.setForeground(new Color(-16775406));
        constX34.setText("0");
        MaxXPanel4.add(constX34, new com.intellij.uiDesigner.core.GridConstraints(0, 6, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(50, -1), null, 0, false));
        constX35 = new JTextField();
        constX35.setBackground(new Color(-859427));
        constX35.setForeground(new Color(-16775406));
        constX35.setText("0");
        MaxXPanel4.add(constX35, new com.intellij.uiDesigner.core.GridConstraints(0, 8, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(50, -1), null, 0, false));
        final JLabel label20 = new JLabel();
        Font label20Font = this.$$$getFont$$$(null, Font.BOLD, 14, label20.getFont());
        if (label20Font != null) label20.setFont(label20Font);
        label20.setText("+");
        MaxXPanel4.add(label20, new com.intellij.uiDesigner.core.GridConstraints(0, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label21 = new JLabel();
        Font label21Font = this.$$$getFont$$$(null, Font.BOLD, 14, label21.getFont());
        if (label21Font != null) label21.setFont(label21Font);
        label21.setText("+");
        MaxXPanel4.add(label21, new com.intellij.uiDesigner.core.GridConstraints(0, 3, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label22 = new JLabel();
        Font label22Font = this.$$$getFont$$$(null, Font.BOLD, 14, label22.getFont());
        if (label22Font != null) label22.setFont(label22Font);
        label22.setText("+");
        MaxXPanel4.add(label22, new com.intellij.uiDesigner.core.GridConstraints(0, 5, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label23 = new JLabel();
        Font label23Font = this.$$$getFont$$$(null, Font.BOLD, 14, label23.getFont());
        if (label23Font != null) label23.setFont(label23Font);
        label23.setText("+");
        MaxXPanel4.add(label23, new com.intellij.uiDesigner.core.GridConstraints(0, 7, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        comboBox3 = new JComboBox();
        comboBox3.setBackground(new Color(-16775406));
        comboBox3.setEditable(false);
        Font comboBox3Font = this.$$$getFont$$$(null, Font.BOLD, 14, comboBox3.getFont());
        if (comboBox3Font != null) comboBox3.setFont(comboBox3Font);
        comboBox3.setForeground(new Color(-7145341));
        final DefaultComboBoxModel defaultComboBoxModel4 = new DefaultComboBoxModel();
        defaultComboBoxModel4.addElement(">=");
        defaultComboBoxModel4.addElement("<=");
        defaultComboBoxModel4.addElement("=");
        comboBox3.setModel(defaultComboBoxModel4);
        MaxXPanel4.add(comboBox3, new com.intellij.uiDesigner.core.GridConstraints(0, 9, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(10, -1), null, 0, false));
        freeMember3 = new JTextField();
        freeMember3.setBackground(new Color(-859427));
        freeMember3.setForeground(new Color(-16775406));
        MaxXPanel4.add(freeMember3, new com.intellij.uiDesigner.core.GridConstraints(0, 10, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_EAST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(50, -1), null, 0, false));
        MaxXPanel5 = new JPanel();
        MaxXPanel5.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(1, 11, new Insets(0, 0, 0, 0), -1, -1));
        MaxXPanel5.setBackground(new Color(-11859185));
        MaxPanel.add(MaxXPanel5, new com.intellij.uiDesigner.core.GridConstraints(8, 0, 1, 4, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_NORTH, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, new Dimension(465, 44), null, 0, false));
        constX41 = new JTextField();
        constX41.setBackground(new Color(-859427));
        constX41.setForeground(new Color(-16775406));
        constX41.setText("0");
        MaxXPanel5.add(constX41, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(50, -1), null, 0, false));
        constX42 = new JTextField();
        constX42.setBackground(new Color(-859427));
        constX42.setForeground(new Color(-16775406));
        constX42.setText("0");
        MaxXPanel5.add(constX42, new com.intellij.uiDesigner.core.GridConstraints(0, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(50, -1), null, 0, false));
        constX43 = new JTextField();
        constX43.setBackground(new Color(-859427));
        constX43.setForeground(new Color(-16775406));
        constX43.setText("0");
        MaxXPanel5.add(constX43, new com.intellij.uiDesigner.core.GridConstraints(0, 4, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(50, -1), null, 0, false));
        constX44 = new JTextField();
        constX44.setBackground(new Color(-859427));
        constX44.setForeground(new Color(-16775406));
        constX44.setText("0");
        MaxXPanel5.add(constX44, new com.intellij.uiDesigner.core.GridConstraints(0, 6, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(50, -1), null, 0, false));
        constX45 = new JTextField();
        constX45.setBackground(new Color(-859427));
        constX45.setForeground(new Color(-16775406));
        constX45.setText("0");
        MaxXPanel5.add(constX45, new com.intellij.uiDesigner.core.GridConstraints(0, 8, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(50, -1), null, 0, false));
        final JLabel label24 = new JLabel();
        Font label24Font = this.$$$getFont$$$(null, Font.BOLD, 14, label24.getFont());
        if (label24Font != null) label24.setFont(label24Font);
        label24.setText("+");
        MaxXPanel5.add(label24, new com.intellij.uiDesigner.core.GridConstraints(0, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label25 = new JLabel();
        Font label25Font = this.$$$getFont$$$(null, Font.BOLD, 14, label25.getFont());
        if (label25Font != null) label25.setFont(label25Font);
        label25.setText("+");
        MaxXPanel5.add(label25, new com.intellij.uiDesigner.core.GridConstraints(0, 3, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label26 = new JLabel();
        Font label26Font = this.$$$getFont$$$(null, Font.BOLD, 14, label26.getFont());
        if (label26Font != null) label26.setFont(label26Font);
        label26.setText("+");
        MaxXPanel5.add(label26, new com.intellij.uiDesigner.core.GridConstraints(0, 5, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label27 = new JLabel();
        Font label27Font = this.$$$getFont$$$(null, Font.BOLD, 14, label27.getFont());
        if (label27Font != null) label27.setFont(label27Font);
        label27.setText("+");
        MaxXPanel5.add(label27, new com.intellij.uiDesigner.core.GridConstraints(0, 7, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        comboBox4 = new JComboBox();
        comboBox4.setBackground(new Color(-16775406));
        comboBox4.setEditable(false);
        Font comboBox4Font = this.$$$getFont$$$(null, Font.BOLD, 14, comboBox4.getFont());
        if (comboBox4Font != null) comboBox4.setFont(comboBox4Font);
        comboBox4.setForeground(new Color(-7145341));
        final DefaultComboBoxModel defaultComboBoxModel5 = new DefaultComboBoxModel();
        defaultComboBoxModel5.addElement(">=");
        defaultComboBoxModel5.addElement("<=");
        defaultComboBoxModel5.addElement("=");
        comboBox4.setModel(defaultComboBoxModel5);
        MaxXPanel5.add(comboBox4, new com.intellij.uiDesigner.core.GridConstraints(0, 9, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(10, -1), null, 0, false));
        freeMember4 = new JTextField();
        freeMember4.setBackground(new Color(-859427));
        freeMember4.setForeground(new Color(-16775406));
        MaxXPanel5.add(freeMember4, new com.intellij.uiDesigner.core.GridConstraints(0, 10, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_EAST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(50, -1), null, 0, false));
        MaxXPanel6 = new JPanel();
        MaxXPanel6.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(1, 11, new Insets(0, 0, 0, 0), -1, -1));
        MaxXPanel6.setBackground(new Color(-11859185));
        MaxPanel.add(MaxXPanel6, new com.intellij.uiDesigner.core.GridConstraints(9, 0, 1, 4, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_NORTH, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, new Dimension(465, 44), null, 0, false));
        constX52 = new JTextField();
        constX52.setBackground(new Color(-859427));
        constX52.setForeground(new Color(-16775406));
        constX52.setText("0");
        MaxXPanel6.add(constX52, new com.intellij.uiDesigner.core.GridConstraints(0, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(50, -1), null, 0, false));
        constX53 = new JTextField();
        constX53.setBackground(new Color(-859427));
        constX53.setForeground(new Color(-16775406));
        constX53.setText("0");
        MaxXPanel6.add(constX53, new com.intellij.uiDesigner.core.GridConstraints(0, 4, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(50, -1), null, 0, false));
        constX54 = new JTextField();
        constX54.setBackground(new Color(-859427));
        constX54.setForeground(new Color(-16775406));
        constX54.setText("0");
        MaxXPanel6.add(constX54, new com.intellij.uiDesigner.core.GridConstraints(0, 6, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(50, -1), null, 0, false));
        constX55 = new JTextField();
        constX55.setBackground(new Color(-859427));
        constX55.setForeground(new Color(-16775406));
        constX55.setText("0");
        MaxXPanel6.add(constX55, new com.intellij.uiDesigner.core.GridConstraints(0, 8, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(50, -1), null, 0, false));
        final JLabel label28 = new JLabel();
        Font label28Font = this.$$$getFont$$$(null, Font.BOLD, 14, label28.getFont());
        if (label28Font != null) label28.setFont(label28Font);
        label28.setText("+");
        MaxXPanel6.add(label28, new com.intellij.uiDesigner.core.GridConstraints(0, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label29 = new JLabel();
        Font label29Font = this.$$$getFont$$$(null, Font.BOLD, 14, label29.getFont());
        if (label29Font != null) label29.setFont(label29Font);
        label29.setText("+");
        MaxXPanel6.add(label29, new com.intellij.uiDesigner.core.GridConstraints(0, 3, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label30 = new JLabel();
        Font label30Font = this.$$$getFont$$$(null, Font.BOLD, 14, label30.getFont());
        if (label30Font != null) label30.setFont(label30Font);
        label30.setText("+");
        MaxXPanel6.add(label30, new com.intellij.uiDesigner.core.GridConstraints(0, 5, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label31 = new JLabel();
        Font label31Font = this.$$$getFont$$$(null, Font.BOLD, 14, label31.getFont());
        if (label31Font != null) label31.setFont(label31Font);
        label31.setText("+");
        MaxXPanel6.add(label31, new com.intellij.uiDesigner.core.GridConstraints(0, 7, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        comboBox5 = new JComboBox();
        comboBox5.setBackground(new Color(-16775406));
        comboBox5.setEditable(false);
        Font comboBox5Font = this.$$$getFont$$$(null, Font.BOLD, 14, comboBox5.getFont());
        if (comboBox5Font != null) comboBox5.setFont(comboBox5Font);
        comboBox5.setForeground(new Color(-7145341));
        final DefaultComboBoxModel defaultComboBoxModel6 = new DefaultComboBoxModel();
        defaultComboBoxModel6.addElement(">=");
        defaultComboBoxModel6.addElement("<=");
        defaultComboBoxModel6.addElement("=");
        comboBox5.setModel(defaultComboBoxModel6);
        MaxXPanel6.add(comboBox5, new com.intellij.uiDesigner.core.GridConstraints(0, 9, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(10, -1), null, 0, false));
        freeMember5 = new JTextField();
        freeMember5.setBackground(new Color(-859427));
        freeMember5.setForeground(new Color(-16775406));
        freeMember5.setText("");
        MaxXPanel6.add(freeMember5, new com.intellij.uiDesigner.core.GridConstraints(0, 10, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_EAST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(50, -1), null, 0, false));
        constX51 = new JTextField();
        constX51.setBackground(new Color(-859427));
        constX51.setForeground(new Color(-16775406));
        constX51.setText("0");
        MaxXPanel6.add(constX51, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(50, -1), null, 0, false));
        calculate = new JButton();
        calculate.setBackground(new Color(-7145341));
        Font calculateFont = this.$$$getFont$$$(null, Font.BOLD, 16, calculate.getFont());
        if (calculateFont != null) calculate.setFont(calculateFont);
        calculate.setForeground(new Color(-16775406));
        calculate.setText("Вычислить");
        MaxPanel.add(calculate, new com.intellij.uiDesigner.core.GridConstraints(10, 1, 1, 3, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        optimalX = new JTextField();
        optimalX.setBackground(new Color(-859427));
        optimalX.setForeground(new Color(-16775406));
        optimalX.setText("");
        MaxPanel.add(optimalX, new com.intellij.uiDesigner.core.GridConstraints(11, 2, 1, 2, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(200, -1), null, 0, false));
        XPanel = new JPanel();
        XPanel.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(1, 6, new Insets(0, 0, 0, 0), -1, -1));
        XPanel.setBackground(new Color(-11859185));
        MaxPanel.add(XPanel, new com.intellij.uiDesigner.core.GridConstraints(4, 0, 1, 4, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        final JLabel label32 = new JLabel();
        Font label32Font = this.$$$getFont$$$(null, Font.BOLD, 16, label32.getFont());
        if (label32Font != null) label32.setFont(label32Font);
        label32.setForeground(new Color(-859427));
        label32.setText("Розы");
        XPanel.add(label32, new com.intellij.uiDesigner.core.GridConstraints(0, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label33 = new JLabel();
        Font label33Font = this.$$$getFont$$$(null, Font.BOLD, 16, label33.getFont());
        if (label33Font != null) label33.setFont(label33Font);
        label33.setForeground(new Color(-859427));
        label33.setText("Время изготовления");
        XPanel.add(label33, new com.intellij.uiDesigner.core.GridConstraints(0, 5, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_EAST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label34 = new JLabel();
        label34.setEnabled(true);
        Font label34Font = this.$$$getFont$$$(null, Font.BOLD, 16, label34.getFont());
        if (label34Font != null) label34.setFont(label34Font);
        label34.setForeground(new Color(-859427));
        label34.setText("Айстры");
        XPanel.add(label34, new com.intellij.uiDesigner.core.GridConstraints(0, 4, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label35 = new JLabel();
        Font label35Font = this.$$$getFont$$$(null, Font.BOLD, 16, label35.getFont());
        if (label35Font != null) label35.setFont(label35Font);
        label35.setForeground(new Color(-859427));
        label35.setText("Орхидеи");
        XPanel.add(label35, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label36 = new JLabel();
        Font label36Font = this.$$$getFont$$$(null, Font.BOLD, 16, label36.getFont());
        if (label36Font != null) label36.setFont(label36Font);
        label36.setForeground(new Color(-859427));
        label36.setText("Нарциссы");
        XPanel.add(label36, new com.intellij.uiDesigner.core.GridConstraints(0, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label37 = new JLabel();
        Font label37Font = this.$$$getFont$$$(null, Font.BOLD, 16, label37.getFont());
        if (label37Font != null) label37.setFont(label37Font);
        label37.setForeground(new Color(-859427));
        label37.setText("Георгины");
        XPanel.add(label37, new com.intellij.uiDesigner.core.GridConstraints(0, 3, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        Labels = new JPanel();
        Labels.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(1, 6, new Insets(0, 0, 0, 0), -1, -1));
        Labels.setBackground(new Color(-11859185));
        MaxPanel.add(Labels, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 4, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        final JLabel label38 = new JLabel();
        Font label38Font = this.$$$getFont$$$(null, Font.BOLD, 16, label38.getFont());
        if (label38Font != null) label38.setFont(label38Font);
        label38.setForeground(new Color(-859427));
        label38.setText("Розы");
        Labels.add(label38, new com.intellij.uiDesigner.core.GridConstraints(0, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label39 = new JLabel();
        label39.setEnabled(true);
        Font label39Font = this.$$$getFont$$$(null, Font.BOLD, 16, label39.getFont());
        if (label39Font != null) label39.setFont(label39Font);
        label39.setForeground(new Color(-859427));
        label39.setText("Айстры");
        Labels.add(label39, new com.intellij.uiDesigner.core.GridConstraints(0, 4, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label40 = new JLabel();
        Font label40Font = this.$$$getFont$$$(null, Font.BOLD, 16, label40.getFont());
        if (label40Font != null) label40.setFont(label40Font);
        label40.setForeground(new Color(-859427));
        label40.setText("Дополнительно");
        Labels.add(label40, new com.intellij.uiDesigner.core.GridConstraints(0, 5, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label41 = new JLabel();
        Font label41Font = this.$$$getFont$$$(null, Font.BOLD, 16, label41.getFont());
        if (label41Font != null) label41.setFont(label41Font);
        label41.setForeground(new Color(-859427));
        label41.setText("Орхидеи");
        Labels.add(label41, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label42 = new JLabel();
        Font label42Font = this.$$$getFont$$$(null, Font.BOLD, 16, label42.getFont());
        if (label42Font != null) label42.setFont(label42Font);
        label42.setForeground(new Color(-859427));
        label42.setText("Нарциссы");
        Labels.add(label42, new com.intellij.uiDesigner.core.GridConstraints(0, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label43 = new JLabel();
        Font label43Font = this.$$$getFont$$$(null, Font.BOLD, 16, label43.getFont());
        if (label43Font != null) label43.setFont(label43Font);
        label43.setForeground(new Color(-859427));
        label43.setText("Георгины");
        Labels.add(label43, new com.intellij.uiDesigner.core.GridConstraints(0, 3, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        optimalF = new JTextField();
        optimalF.setBackground(new Color(-859427));
        optimalF.setForeground(new Color(-16775406));
        optimalF.setText("");
        MaxPanel.add(optimalF, new com.intellij.uiDesigner.core.GridConstraints(12, 3, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(200, -1), null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    private Font $$$getFont$$$(String fontName, int style, int size, Font currentFont) {
        if (currentFont == null) return null;
        String resultName;
        if (fontName == null) {
            resultName = currentFont.getName();
        } else {
            Font testFont = new Font(fontName, Font.PLAIN, 10);
            if (testFont.canDisplay('a') && testFont.canDisplay('1')) {
                resultName = fontName;
            } else {
                resultName = currentFont.getName();
            }
        }
        return new Font(resultName, style >= 0 ? style : currentFont.getStyle(), size >= 0 ? size : currentFont.getSize());
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return Panel;
    }
}
