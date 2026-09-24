
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class TelaCriacaoHeroiFlow extends JFrame {

    // Atributos da classe
    private JTextField campoNome;
    private JTextField campoVida;
    private JTextField campoClasse;

    private JButton botaoCriar;
    private JLabel labelStatus;

    public TelaCriacaoHeroiFlow() {
        super("IF Quest - Versão FlowLayout");

        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Organiza os componentes 
        setLayout(new FlowLayout(FlowLayout.CENTER, 10, 15));

        // Cria o componentes
        JLabel titulo = new JLabel("Criação de Herói");
        campoNome = new JTextField(15);
        campoVida = new JTextField(15);
        campoClasse = new JTextField(15);
        botaoCriar = new JButton("Criar Herói");
        labelStatus = new JLabel("Coloque os dados do heroi");
        botaoCriar.setEnabled(true);//habilita o botao
        // Adiciona os componentes 
        add(titulo);
        add(new JLabel("Nome:"));
        add(campoNome);
        add(new JLabel("Vida:"));
        add(campoVida);
        add(new JLabel("Classe:"));
        add(campoClasse);
        add(botaoCriar);
        add(labelStatus);
        // Evento do botão
        botaoCriar.addActionListener(e -> {
            botaoCriar.setEnabled(false);//desabilita o botao
            criarHeroi();
        });
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public void criarHeroi() {
        try {
            String nome = campoNome.getText();
            int vida = Integer.parseInt(campoVida.getText());
            String classe = campoClasse.getText();
            // Cria o guerreiro
            Guerreiro guerreiro = new Guerreiro(nome, 0, 0, 0);
            guerreiro.setVida(vida);
            // Mensagem de sucesso
            labelStatus.setText("Heroi: " + nome + " | Vida: " + vida);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this,"Vida deve ser um número!","Erro",JOptionPane.ERROR_MESSAGE);
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(),"Erro", JOptionPane.ERROR_MESSAGE);
        } finally {
            botaoCriar.setEnabled(true);//reabilita o botao
        }
    }
}
