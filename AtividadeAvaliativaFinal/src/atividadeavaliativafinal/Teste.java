/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadeavaliativafinal;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.*;

public class Teste extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;
    private JLabel guessLabel;
    private JTextField guessTextField;
    private JButton guessButton;
    private JLabel resultLabel;
    private int maxTentativas = 20;
    private int aleatorio;
    private int numeroDeTentativas;

    public Teste() {
        setTitle("Jogo de adivinhação!");
        setSize(500, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(3, 2));

        guessLabel = new JLabel("Responda um número entre 1 e 1000:");
        panel.add(guessLabel);

        guessTextField = new JTextField();
        panel.add(guessTextField);

        guessButton = new JButton("Resposta");
        guessButton.addActionListener(this);
        panel.add(guessButton);

        resultLabel = new JLabel("Você tem " + maxTentativas + " tentativaas restantes.");
        panel.add(resultLabel);

        setContentPane(panel);

        aleatorio = new Random().nextInt(1000) + 1;
        numeroDeTentativas = 0;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (numeroDeTentativas >= maxTentativas) {
            JOptionPane.showMessageDialog(this, "Você usou todas suas tentativas. O número era " + aleatorio + ".", "Fim de Jogo", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }

        int resposta = Integer.parseInt(guessTextField.getText());
        numeroDeTentativas++;

        if (resposta < aleatorio) {
            resultLabel.setText("Tente um número maior. Você tem " + (maxTentativas - numeroDeTentativas) + " tentativas restantes..");
        } else if (resposta > aleatorio) {
            resultLabel.setText("Tente um número menor. Você tem " + (maxTentativas - numeroDeTentativas) + " tentativas restantes.");
        } else {
            JOptionPane.showMessageDialog(this, "Parabéns! Você acertou o número em " + numeroDeTentativas + " tentativas.", "Você venceu!", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }

        guessTextField.setText("");
        guessTextField.requestFocus();
    }

    public static void main(String[] args) {
        Teste game = new Teste();
        game.setVisible(true);
    }
}
