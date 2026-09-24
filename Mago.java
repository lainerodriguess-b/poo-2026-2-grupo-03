public class Mago extends Personagem{
    private int mana;
    public Mago(String nome, int vida, int nivel, int forca) {
        super(nome, vida, nivel, forca);
        setMana(50);
    }

    public Mago(String nome, int vida, int nivel, int forca, int mana) {
        super(nome, vida, nivel, forca);
        setMana(mana);
    }
//retorna a mana
    public int getMana(){
        return mana;
    }
//valida a mana
    public void setMana(int mana){
        if(mana < 0){
            throw new IllegalArgumentException("Mana nao pode ser negativa: " + mana);
        }
        this.mana = mana;
    }
//retorna a habilidade
    @Override
    public String habilidade(){
        return "Expelliarmus";
    }
//subscreve o metodo atacar
    @Override
    public void atacar(Personagem alvo) throws SemMana{
        if(this.mana < 10) throw new SemMana(this.mana);
        this.mana -= 10;
        super.atacar(alvo);
    }
//exibi a ficha do mago
    @Override
    public void ficha(){
        System.out.println("\nMago");
        super.ficha();
        System.out.println("Mana: " + this.mana);
    }
}
