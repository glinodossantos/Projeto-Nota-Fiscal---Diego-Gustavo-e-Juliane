package projetonotafiscal;
/**
 *
 * @author Juliane Galdino dos Santos
 */
public class PilhadeNotasFiscais {
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
    }


}
