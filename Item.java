public class Item{
    private String nome;
    private int bonus;
    public Item(String nome, int bonus){
        this.nome = nome;
        this.bonus = bonus;
    }
//retorna o nome do item
    public String getNome(){
        return this.nome;
    }
// valida o nome do item
    public void setNome(String nome){
        if(nome == null || nome.isEmpty()){
            System.out.println("ERRO, nome vazio\n");
        }else{
            this.nome = nome;
        }
    }
//retorna o bonus
    public int getBonus(){
            return this.bonus;
    }
//valida o bonus
    public void setBonus(int bonus){
        if(bonus >= 0){
            this.bonus = bonus;
        }else{
            System.out.println("ERRO, bonus negativo\n");
        }
    }
//exibe a descricao do item
    public String descricao(){
        return "Item: " + this.nome + ", bonus: " + this.bonus;
    }
}
