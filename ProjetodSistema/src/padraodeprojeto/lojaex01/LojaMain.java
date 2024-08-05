package padraodeprojeto.lojaex01;

import java.util.Scanner;

public class LojaMain {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("João", "051.551.234-44");

        //produtos pro loop//

        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras(cliente1);
        Scanner scanner = new Scanner(System.in);
        Produto p1 = new Produto(1,10);
        Produto p2 = new Produto(2,500);

        carrinhoDeCompras.adicionarProduto(p1, 2,0.3);

        int opcao = 0;

        while (opcao !=2) {
            System.out.println("Menu:");
            System.out.println("1. adicionar novo produto");
            System.out.println("2. sair");

            opcao = scanner.nextInt();
            String adicionarp = scanner.next();


            switch (opcao){
                case 1:

                    System.out.println("Os produtos são: 1 - Martelo e 2 - Celular");

                    System.out.println("O codigo do produto: ");
                    adicionarp = String.valueOf(scanner.nextInt());

                    System.out.println("Quantidade do produto: ");
                    int quantidadeProduto = scanner.nextInt();

                    System.out.println("Qual o desconto: ");
                    double descontoProduto = scanner.nextDouble();

                    carrinhoDeCompras.adicionarProduto(p1, quantidadeProduto,descontoProduto);

            }
        }

    }

}
