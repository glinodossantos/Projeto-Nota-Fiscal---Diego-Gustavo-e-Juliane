package projetonotafiscal;
/**
 *
 * @author Diego Fernandes Lins
 */
public class ListadeProdutos {
    //Classe ListadeProdutos: desenvolvida e testada por Diego Fernandes Lins [11/10/2020]
    private String produto[] = {"Arroz", "Feijão", "Macarrão", "Açucar", "Sal", "Café", "Queijo", "Leite", "Refrigerante", "Farinha de Trigo", "Fermento", "Achocolatado"};
    private float precoproduto[] = {20.90f, 8.38f, 2.60f, 2.70f, 2.49f, 7.79f, 9.99f, 3.71f, 5.99f, 3.85f, 2.50f, 4.99f};
    private int item;
    public void mostrarProdutos(){
        System.out.println("Estes são produtos que vendemos:");
        for (int i=0; i < 12; i++){
            System.out.println(i + " - " + produto[i]);
        }
    //Método utilizado na classe principal para retornar a lista de produtos diponíveis.
    }
    public int getItem(){
        return item;
    }
    public void setItem(int item) {
        this.item = item;
    }
    public String getProduto(int item) {
        return produto[item];
    }
    public float getPrecoproduto(int item) {
        return precoproduto[item];
    }


}
