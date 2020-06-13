package progtechquiz;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import javafx.event.ActionEvent;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class ProgtechQuiz {

    private static void generateReport(boolean selected, boolean selected0, boolean selected1, boolean selected2) {

        System.out.println("1: " + selected);
        System.out.println("2: " + selected0);
        System.out.println("3: " + selected1);
        System.out.println("4: " + selected2);

    }

    private static void createWindow() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setName("Progtech Quiz");

        createUI(frame);
        frame.setSize(560, 300);
        frame.setVisible(true);
    }

    private static void createUI(final JFrame frame) {

        JPanel firstPanel = new JPanel(new FlowLayout());
        firstPanel.add(new JTextArea("Ide jön majd a kérdés szövege"));

        JPanel panel = new JPanel(new BorderLayout());
        LayoutManager layout = new BoxLayout(panel, 1);
        panel.setLayout(layout);

        JCheckBox checkBox1 = new JCheckBox("Check Me 1");
        JCheckBox checkBox2 = new JCheckBox("Check Me 2");
        JCheckBox checkBox3 = new JCheckBox("Check Me 3");
        JCheckBox checkBox4 = new JCheckBox("Check Me 4");

        panel.add(checkBox1);
        panel.add(checkBox2);
        panel.add(checkBox3);
        panel.add(checkBox4);

        JPanel lastPanel = new JPanel(new BorderLayout());
        JButton button = new JButton("Lássuk");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                generateReport(checkBox1.isSelected(),
                        checkBox2.isSelected(),
                        checkBox3.isSelected(),
                        checkBox4.isSelected());
            }

        }
        );

        lastPanel.add(button, BorderLayout.CENTER);

        lastPanel.add(
                new JTextArea("Ez a jó megoldás: "), BorderLayout.SOUTH);

        frame.getContentPane()
                .add(panel, BorderLayout.CENTER);
        frame.getContentPane()
                .add(firstPanel, BorderLayout.NORTH);
        frame.getContentPane()
                .add(lastPanel, BorderLayout.SOUTH);

    }

    public static void main(String[] args) {

        createWindow();

    }

}
