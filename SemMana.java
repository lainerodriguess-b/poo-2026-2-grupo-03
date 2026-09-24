//excecao para quando n tiver mana suficiente
public class SemMana extends Exception{
    private int manatual;
// retorna mana
    public int getMana(){
        return this.manatual;
    }
//construtor da excecao
    public SemMana(int manatual){
        super("mana insuficiente: " + manatual + ", precisa de pelo menos 10 de mana");
    this.manatual = manatual;
    }
}
