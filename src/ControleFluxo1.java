package src;

public class ControleFluxo1 {
    public static void main(String[] args) {
        // idade < 15 categoria infantil
        // idade >=15 && <18  categoria juvenil
        // idade >=18 adulto
        int idade = 18;

        if (idade > 18) {
            System.out.println("categoria Infantil");
        } else if (idade >= 15 && idade < 18){
            System.out.println("Categoria Juvenil");
        }else{
            System.out.println("Categoria Adulto");
        }
    }
}
