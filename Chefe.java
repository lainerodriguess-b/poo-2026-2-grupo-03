public class Chefe extends Personagem{// herda de personagem
    public Chefe(String nome){
        super(nome, 200, 99, 20);
    }
//define habilidade do chefe se ele tiver
    @Override
    public String habilidade(){
        return "Bafo de fogo";
    }
//exibi a ficha do chefe
    @Override
    public void ficha(){
        System.out.println("Chefe");
        super.ficha();
    }
}
