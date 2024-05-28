package src.javacore.sobrecargametodos;

public class Funcionario {
    private String nome;
    private String cpf;
    private double salario;
    private String rg;


    public void init(String nome, String cpf, double salario){
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    //sobrecarga de metodos, o nome poder ser igual, mas o argumento ou quantidades devem ser diferentes
        public void init(String nome, String cpf, double salario, String rg){
        init(nome, cpf, salario);
        this.rg = rg;
    }


    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.salario);
        System.out.println(this.rg);
    }



    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
        public void setRg(String rg) {
        this.rg = rg;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }


    public String getNome(String nome) {
        return nome;
    }
    public String getCpf() {
        return cpf;
    }
       public String getRg() {
        return rg;
    }
    public double getSalario() {
        return salario;
    }
}
