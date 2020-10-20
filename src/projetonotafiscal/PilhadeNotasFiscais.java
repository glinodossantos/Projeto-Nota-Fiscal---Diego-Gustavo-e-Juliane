package projetonotafiscal;
/**
 *
 * @author Juliane Galdino dos Santos
 */
public class PilhadeNotasFiscais {
    //Classe PilhadeNotasFiscais: desenvolvida e testada por Juliane Galdino [11/10/2020]
    int dados[] = new int[999999999];
    private int topo = 0;
    public int getTopo(){
        return topo;
  }
    public void setTopo(int topo) {
        this.topo = topo;
    }

    public void adicionaNota(int topo) {
        dados[topo] = topo + 1;
        //Método utilizado na classe principal para adicionar uma nota na Pilha e ao mesmo tempo identificar o número da atual nota fiscal.
        //Parâmetro de número inteiro topo definirá o índice do vetor e sua soma com o número 1 definirá o número da nota fiscal.
    }


}
