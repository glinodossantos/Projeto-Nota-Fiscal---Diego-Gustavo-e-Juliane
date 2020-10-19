package projetonotafiscal;
/**
 *
 * @author Gustavo Lino dos Santos
 */
public class Produto {
    private int cod;
    private String produto;
    private float preco;
    private int quantidade;

    public void Produto(int cod, String produto, float preco, int quantidade){
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
