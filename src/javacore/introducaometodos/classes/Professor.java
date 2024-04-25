package src.javacore.introducaometodos.classes;

// crie os seguintes atributos para essa classe
    // Nome
    // Matricula
    // rg
    //cpf
public class Professor {
    public String nome;
    public String matricula;
    public String rg;
    public String cpf;


    public void imprime(Professor aux){
        System.out.println("-----------------------------");
        System.out.println(aux.nome);
        System.out.println(aux.matricula);
        System.out.println(aux.rg);
        System.out.println(aux.cpf);

    }

}
