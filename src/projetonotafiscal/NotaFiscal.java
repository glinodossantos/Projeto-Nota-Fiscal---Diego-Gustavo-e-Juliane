package projetonotafiscal;
/*
 *
 * @author Juliane Galdino dos Santos
 */
public class NotaFiscal {
    private int numero;
    private float total;

    public NotaFiscal(int numero, float total){
        this.numero = numero;
        this.total = total;       
  }
    public int getNumero(){
        return numero;
  }
    public float getTotal(){
        return total;
  }

}
