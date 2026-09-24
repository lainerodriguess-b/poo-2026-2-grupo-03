//excecao para quando n tiver forca suficiente
public class SemForca extends Exception{
    private int forcaAtual;
//construtor da excecao
    public SemForca(int forca){
        super("Forca insuficiente: " + forca);
        this.forcaAtual = forca;
    }
//retorna forca atual
    public int getForca(){
        return this.forcaAtual;
    }
}
