package projetonotafiscal;
/*
 *
 * @author Juliane Galdino dos Santos
 */
public class NotaFiscal {
    //Classe NotaFiscal: desenvolvida e testada por Juliane Galdino [11/10/2020]
    private int numero;
    private float total;

    public NotaFiscal(int numero, float total){
        this.numero = numero;
        this.total = total;  
        //Método construtor usado na classe principal para receber o numero e o total da nota fiscal.
        //Parâmetro de número inteiro numero receberá o número da nota fiscal e parâmetro de número flutuante total receberá o valor total da nota.
  }
    public int getNumero(){
        return numero;
  }
    public float getTotal(){
        return total;
  }

}
