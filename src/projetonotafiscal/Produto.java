package projetonotafiscal;
/**
 *
 * @author Gustavo Lino dos Santos
 */
public class Produto {
    /*Classe Produto: desenvolvida e testada por Gustavo Lino dos Santos [17/10/2020]*/
    private int cod;
    private String produto;
    private float preco;
    private int quantidade;

    public void Produto(int cod, String produto, float preco, int quantidade){
       //Método construtor usado na classe principal para receber o código, o nome do produto, o preço e a quantidade.
       /*Parâmetro de número inteiro cod receberá o código do produto, parâmetro de caracteres produto receberá o nome do produto,
         parâmetro de número flutuante receberá a quantidade do produto escolhido e parâmetro de número inteiro quantidade receberá a quantidade do produto comprado.*/
       this.cod = cod;
       this.produto = produto;
       this.preco = preco;
       this.quantidade = quantidade;
    }
    public int getCod(){
        return cod;
  }
    public void setCod(int cod) {
        this.cod = cod;
    }
    public String getProduto(){
        return produto;
  }
    public void setProduto(String produto) {
        this.produto = produto;
    }
    public int getQuantidade(){
        return quantidade;
  }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public double getPreco(){
        return preco;
  }
    public void setPreco(float preco) {
        this.preco = preco;
    }
}
