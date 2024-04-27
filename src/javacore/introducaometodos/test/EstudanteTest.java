package src.javacore.introducaometodos.test;

import src.javacore.introducaometodos.classes.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {

        Estudante estud = new Estudante();
        estud.nome = "John Doe";
        estud.idade = 31;
        estud.notas = new double[]{8, 9, 10};



        estud.imprimir();

        estud.tirarMedia();
    }
}
