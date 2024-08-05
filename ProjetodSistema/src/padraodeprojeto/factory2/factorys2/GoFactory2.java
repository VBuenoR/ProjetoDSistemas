package padraodeprojeto.factory2.factorys2;

import padraodeprojeto.factory2.abstracts.Locadora;
import padraodeprojeto.factory2.model.LocadoraBicicleta;
import padraodeprojeto.factory2.model.LocadoraPatinete;

import java.util.Scanner;

public class GoFactory2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        while(opcao != 1 && opcao != 2 && opcao != 3){
            System.out.println("================================");
            System.out.println("Menu da Locadora de Veiculos:");
            System.out.println("================================");
            System.out.println("1. Bicicleta");
            System.out.println("2. Patinete");
            System.out.println("3. Nenhum");
            System.out.println("================================");
            System.out.print("Digite um valor: ");

            opcao = scanner.nextInt();

            switch (opcao){
                case 1:
                    Locadora bicibleta = new LocadoraBicicleta();
                    bicibleta.locarVeiculo();
                    break;

                case 2:
                    Locadora patinete = new LocadoraPatinete();
                    patinete.locarVeiculo();
                    break;

                case 3:
                    System.out.println("Tá bom, tchau cliente!");
                    break;
            }

        }

    }
}
