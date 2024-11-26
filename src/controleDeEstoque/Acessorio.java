package controleDeEstoque;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Acessorio extends Peca implements Item {
    public Acessorio(String desc,int qntEstoque, int minEstoque,int maxEstoque, float valorProduto) {
        super(desc,qntEstoque,minEstoque,maxEstoque,valorProduto);
    }


    public void Venda() {
        Scanner scan = new Scanner(System.in);
        try {
        System.out.println("Quantas peças você quer? \nTemos " + this.qntEstoque + " peças disponíveis.");
        int pedido = scan.nextInt();
        if (this.qntEstoque > 0) {
            this.qntEstoque -= pedido;
            System.out.println("Compra realizada com sucesso!");
            System.out.println("Quantidade em estoque: " + this.qntEstoque);
        }
    }  catch (InputMismatchException e) {
        System.out.println("Entrada inválida. Por favor, insira um número correspondente ao tamanho.");
        scan.next(); 
        }


}
    
    public void getInfo() {
    	System.out.println(this.desc + " - " + this.valorProduto);
    }
}