package com.mycompany.sistema.monitoria;
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
        tela_inicio();
    }

    private void tela_inicio() {
        setTitle("Venda - Funcionario");
        setLayout(new FlowLayout());
        criarComponentes();
        setSize(700, 350);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void criarComponentes() {
        JPanel buttonsPanel = criarPainelBotoes();
        JScrollPane scrollPane = new JScrollPane(buttonsPanel);
        scrollPane.setPreferredSize(new Dimension(500, 300));
        add(scrollPane);
    }

    private JPanel criarPainelBotoes() {
        JPanel buttons = new JPanel();
        buttons.setPreferredSize(new Dimension(400, 200));

        addButton(buttons, "Abacaxi");
        addButton(buttons, "Bala");
        addButton(buttons, "Cafe");
        addButton(buttons, "Refrigerante");

        return buttons;
    }

    private void addButton(JPanel panel, String text) {
        JButton button = new JButton(text);
        button.addActionListener((ae) -> {
            input = JOptionPane.showInputDialog("Coloque um valor que será somado ao valor padrao: ");
            // Lógica adicional conforme necessário
        });
        panel.add(button);
    }
}