package controleDeEstoque;

import java.util.Scanner;

public class Acessorio extends Peca {
    public Acessorio(String desc,int qntEstoque, int minEstoque,int maxEstoque, float valorProduto) {
        super(desc,qntEstoque,minEstoque,maxEstoque,valorProduto);
    }


    public void Venda() {
        Scanner scan = new Scanner(System.in);
        int pedido;
        System.out.println("Quantas peças você quer? ");
        pedido = scan.nextInt();
        if (this.qntEstoque > 0) {
            this.qntEstoque -= pedido;
        }
    }


}