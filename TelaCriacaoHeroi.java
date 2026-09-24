import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaCriacaoHeroi extends JFrame {
                // atributo da classe
    private JTextField campoNome;
    private JTextField campoVida;
    private JTextField campoClasse;

    private JButton botaoCriar;
    private JLabel labelStatus;

    public TelaCriacaoHeroi() {
        super("IF Quest");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
                //cria os componentes
        JLabel titulo = new JLabel("Criacao de heroi"); 
        campoNome = new JTextField( 15);
        campoVida = new JTextField(15);
        campoClasse = new JTextField("Inicial maiuscula", 15);
        botaoCriar = new JButton("Botão");
        labelStatus = new JLabel("Coloque os dados do heroi");
                //configura os componentes
        titulo.setText("Criação de Herói"); 
        titulo.setHorizontalAlignment(JLabel.CENTER);
        botaoCriar.setText("Criar Herói");   
        botaoCriar.setEnabled(true);//habilita o botao
        
        String valorInicialNome = campoNome.getText(); 
        System.out.println("Conteúdo consultado do campoNome: " + valorInicialNome);
        System.out.println("Texto consultado do titulo: " + titulo.getText());
                            //formulario
        JPanel painelFormulario = new JPanel(new GridLayout(3, 2, 5, 5));
        painelFormulario.add(new JLabel("Nome:"));
        painelFormulario.add(campoNome);
        painelFormulario.add(new JLabel("Vida:"));
        painelFormulario.add(campoVida);
        painelFormulario.add(new JLabel("Classe:"));
        painelFormulario.add(campoClasse);
                            //painel central
        JPanel painelCentral = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 30));
        painelCentral.add(painelFormulario);
                        //organizacao da janela
        add(titulo, BorderLayout.NORTH);
        add(painelCentral, BorderLayout.CENTER);
        JPanel painelInferior = new JPanel(new GridLayout(2, 1));
        painelInferior.add(botaoCriar);
        painelInferior.add(labelStatus);
        add(painelInferior, BorderLayout.SOUTH);
                    //criacao de evento para o botao ser funcional
        botaoCriar.addActionListener(e -> {
            botaoCriar.setEnabled(false);//desabilita o botao
            criarHeroi();
        }); 
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public void criarHeroi() {
        try{
            String nome = campoNome.getText();
            int vida = Integer.parseInt(campoVida.getText());
            String classe = campoClasse.getText();
                     //criacao de guerreiro
            Guerreiro guerreiro = new Guerreiro(nome, 0, 0, 0);
            guerreiro.setVida(vida);
                    //feedback de sucesso
            labelStatus.setText("Heroi: " + nome + " | Vida: " + vida);
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this,"Vida deve ser um número!","Erro",JOptionPane.ERROR_MESSAGE);
        }catch(IllegalArgumentException e){
            JOptionPane.showMessageDialog(this, e.getMessage(),"Erro", JOptionPane.ERROR_MESSAGE);
        } finally{
            botaoCriar.setEnabled(true); //reabilita o botao

        }
    }
}
