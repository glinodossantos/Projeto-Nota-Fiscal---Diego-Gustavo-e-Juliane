package projetonotafiscal;
import java.util.Scanner;
/**
 * @author Diego Fernandes Lins: Classe Cliente e Classe Lista de Produtos
 * @author Gustavo Lino dos Santos: Classe Principal e Classe Produto
 * @author Juliane Galdino dos Santos
 */
public class Projetonotafiscal{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        boolean resposta = true;
        String cpf;
        String nome;
        int m;
        int u;
        String prod;
        float pp;
        float soma = 0;
        int qtde;
        String r;
        ListadeProdutos ldp = new ListadeProdutos();
	System.out.println("CADASTRAR NOVA COMPRA");
        ldp.mostrarProdutos();
        Cliente c = new Cliente();
        Produto p[] = new Produto[11];
        NotaFiscal n = new NotaFiscal();
        PilhadeNotasFiscais pnf = new PilhadeNotasFiscais();
        System.out.println("Digite o nome do Cliente: ");
        nome = ler.nextLine();
        c.setNome(nome);
        System.out.println("Digite o CPF do Cliente: ");
        cpf = ler.nextLine();
        c.setCpf(cpf);
        while (resposta == true){
                for (int i = 0; i >= 0; i++){
                System.out.println("Digite o código do produto: ");
                m = ler.nextInt();
                System.out.println("Digite a quantidade destes produtos: ");
                qtde = ler.nextInt();
                prod = ldp.getProduto(m);
                pp = ldp.getPrecoproduto(m);
                p[i] = new Produto(m, prod, pp, qtde);
                System.out.println("Adicionar novo Produto? (S/N");
                r = ler.nextLine();
                soma = soma + (qtde * pp);
                if (r == "S"){
                    resposta = true;
                }else{
                    resposta = false;
                    u = pnf.getTopo() + 1;
                    pnf.adicionaNota(u);
                    n = new NotaFiscal(u, soma);
                }
            }
        }
    }

}
