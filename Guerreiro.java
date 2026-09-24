public class Guerreiro extends Personagem{
    private int defesa;
    public Guerreiro(String nome, int vida, int nivel, int forca){//construtor
        super(nome, vida, nivel, forca);
        this.setDefesa(5);
    }
//retorna a defesa
    public int getDefesa() {
        return defesa;
    }
//valida a defesa
    public void setDefesa(int defesa){
        if(defesa < 0){
            throw new IllegalArgumentException("Defesa nao pode ser negativa: " + defesa);
        }
        this.defesa = defesa;
    }
//define a habilidade
    @Override
    public String habilidade(){
        return "Soco poderoso";
    }
//subescreve o metodo atacar
    @Override
    public void atacar(Personagem alvo) throws SemMana{
        super.atacar(alvo);
    }
//exibe a ficha do guerreiro
    @Override
    public void ficha(){
        System.out.println("\nGuerreiro");
        super.ficha();
        System.out.println("Defesa: " + this.defesa);
    }
}
