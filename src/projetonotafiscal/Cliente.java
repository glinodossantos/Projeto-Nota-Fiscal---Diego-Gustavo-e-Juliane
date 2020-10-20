package projetonotafiscal;
/**
 *
 * @author Diego Fernandes Lins
 */
public class Cliente {
    //Classe Cliente: desenvolvida e testada por Diego Fernandes Lins [10/10/2020]
    private String nome;
    private String cpf;
  
    public Cliente(String nome, String cpf){
       this.nome = nome;
       this.cpf = cpf;
       //Método construtor usado na classe principal para receber o nome e o CPF do comprador.
       //Parâmetro de caracteres nome receberá o nome do cliente e parâmetro de caracteres cpf receberá o CPF do cliente.
  }
    public String getNome(){
        return nome;
  }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf(){
        return cpf;
  }
    public void setCpf(String cpf) {
        this.cpf = nome;
    }
    public String ToString(){
        return "Nome: " + nome + "cpf: " + cpf;
  }
}
