public class Curandeiro extends Personagem {

    // Construtor
    public Curandeiro(String nome, int vida, int nivel, int forca) {
        super(nome, vida, nivel, forca);
    }
    // Retorna a habilidade
    @Override
    public String habilidade() {
        return "Cura";
    }
    // Realiza a cura
    public void curar(Personagem alvo) {
        if (alvo == null) {
            System.out.println("ERRO: Nao há personagem para curar.\n");
            return;
        }
        int quantidadeCura = 30;
        int vidaAntes = alvo.getVida();

        alvo.setVida(vidaAntes + quantidadeCura);

        int vidaDepois = alvo.getVida();

        System.out.println(
            this.nome + " restaurou " + alvo.getNome() +
            " em " + (vidaDepois - vidaAntes) +
            " pontos de vida!"
        );
    }

    // Exibe a ficha do curandeiro
    @Override
    public void ficha() {
        System.out.println("\nCurandeiro");
        super.ficha();
    }
}
