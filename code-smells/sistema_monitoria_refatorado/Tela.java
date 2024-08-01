package sistema_monitoria_refatorado;

import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

public class Tela extends JFrame {

    private JPanel panel;
    private String input;

    public Tela() {
        initializeUI();
    }

    private void initializeUI() {
        setTitle("Venda - Funcionario");
        setLayout(new FlowLayout());
        createComponents();
        setSize(700, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void createComponents() {
        JPanel buttonsPanel = createButtonsPanel();
        JScrollPane scrollPane = new JScrollPane(buttonsPanel);
        scrollPane.setPreferredSize(new Dimension(500, 300));
        add(scrollPane);
    }

    private JPanel createButtonsPanel() {
        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setPreferredSize(new Dimension(400, 200));

        addButton(buttonsPanel, "Abacaxi");
        addButton(buttonsPanel, "Bala");
        addButton(buttonsPanel, "Cafe");
        addButton(buttonsPanel, "Refrigerante");

        return buttonsPanel;
    }

    private void addButton(JPanel panel, String text) {
        JButton button = new JButton(text);
        button.addActionListener((ae) -> {
            input = JOptionPane.showInputDialog("Coloque um valor que será somado ao valor padrão: ");
            // Lógica adicional conforme necessário
        });
        panel.add(button);
    }
}