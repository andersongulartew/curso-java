package src.javacore.introducaometodos.test;

import src.javacore.introducaometodos.classes.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {

        Estudante aluno = new Estudante();
        aluno.nome = "John Doe";
        aluno.idade = 31;
        aluno.notas = new double[]{8, 9, 10};


        aluno.imprimir();

        aluno.tirarMedia();
    }
}
