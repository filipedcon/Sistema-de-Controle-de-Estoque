package controleDeEstoque;

import java.util.Scanner;

import controleDeEstoque.Acessorio;
import controleDeEstoque.RoupaPMG;
import controleDeEstoque.RoupaTamanhoUnico;
public class App {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      
      Acessorio oculos = new Acessorio("Oculos", 5, 1, 10, 49);
      Acessorio cinto = new Acessorio("Cinto", 7, 1, 10, 30);
      Acessorio pulseira = new Acessorio("Pulseira", 3, 1, 8, 15);

      RoupaTamanhoUnico saia = new RoupaTamanhoUnico("Saia", 10, 1, 10, 70);
      RoupaTamanhoUnico saiaPraia = new RoupaTamanhoUnico("Biquini", 10, 1, 10, 70);

      RoupaPMG camisa = new RoupaPMG("Camisa", 6, 1, 8, 80, 2, 2, 2);

      
      Peca[] pecas = new Peca[]{camisa, saia, cinto, pulseira, saiaPraia};
      
      do {
        System.out.println("Escolha uma opção: ");  
        for (int i = 0; i < pecas.length; i++) {
          if(pecas[i].qntEstoque > 0){
            System.out.println(i + " - " + pecas[i].desc);
          }
          if(i == pecas.length - 1){
            System.out.println("5 - Sair");
          }
        }
          
        int option = scan.nextInt();

        if(option == 5){
          System.out.println("Saindo...");
          break;
        }else{
          pecas[option].Venda();
        }
      } while (true);
    }
}