package com.mycompany.sistema.monitoria;

import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

public class Tela extends JFrame{

    private JPanel panel;
    private String input;

    public Tela() {
        tela_inicio();
    }

    private void tela_inicio() {
        setTitle("Venda - Funcionario");
        setLayout(new FlowLayout());
        desenha_botoes();
        setSize(700, 350);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void desenha_botoes() {
        JPanel buttons = new JPanel();
        buttons.setPreferredSize(new Dimension(400, 200));

        JButton teste = new JButton("Abacaxi");
        teste.setPreferredSize(new Dimension(30,30));
        teste.addActionListener((ae) -> {
            input = JOptionPane.showInputDialog("Coloque um valor que será somado ao valor padrao: ");
        });
        JButton bala = new JButton("Bala");
        bala.addActionListener((ae) -> {
            input = JOptionPane.showInputDialog("Coloque um valor que será somado ao valor padrao: ");
        });
        JButton cafe = new JButton("Cafe");
        cafe.addActionListener((ae) -> {
            input = JOptionPane.showInputDialog("Coloque um valor que será somado ao valor padrao: ");
        });
        JButton refrigerante = new JButton("Refrigerante");
        refrigerante.addActionListener((ae) -> {
            input = JOptionPane.showInputDialog("Coloque um valor que será somado ao valor padrao: ");
        });
        buttons.add(teste);
        buttons.add(bala);
        buttons.add(cafe);
        buttons.add(refrigerante);

        JScrollPane jscroll = new JScrollPane(buttons);
        jscroll.setPreferredSize(new Dimension(500, 300));
        add(jscroll);
    }

}
