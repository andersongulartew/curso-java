package src.javacore.introducaometodos.classes;


// crie uma classe com os atributos: nome; idade ; notas (tres notas)
// crie um metodo para imprimir os dados e tirar a media desse aluno,
// caso a media seja maior que 6 imprimir aprovado,senao reprovado
public class Estudante {
    public String nome;
    public int idade;
    public double[] notas;

        // primeira maneira
    public void tirarMedia() {
        if (notas == null) {
            System.out.println("Aluno nao possui notas");
            return;
        }
        double media = 0;
        for (double nota : notas) {
            media += nota;
        }
        media = media / notas.length;
        if (media > 6) {
            System.out.println("\nA media é : " + media + ";Aprovado");
        } else {
            System.out.println("\nA media é : " + media + ";Reprovado");
        }
    }

//     // Segunda opção
//    public double media () {
//    double media = (notas[0] + notas[1] + notas[2]) / 3;
//     if(media > 6){
//         System.out.println("aprovado");
//     }else {
//         System.out.println("reprovado");
//     }
//     return media;
//
//}



    public void imprimir() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        //System.out.println("Media: " + this.media());

        if ( notas !=null){
            for (double nota : notas) {
                System.out.print("\n nota : " + nota + " ");

            }
        }
    }


    }
