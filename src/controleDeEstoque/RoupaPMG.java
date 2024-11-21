package controleDeEstoque;
import java.util.Scanner;

public class RoupaPMG extends Peca {
    int quantidadeP;
    int quantidadeM;
    int quantidadeG;

    public RoupaPMG(String desc, int qntEstoque, int minEstoque, int maxEstoque, float valorProduto, int quantidadeP, int quantidadeM, int quantidadeG) {
        super(desc, qntEstoque, minEstoque, maxEstoque, valorProduto);
        this.quantidadeP = quantidadeP;
        this.quantidadeM = quantidadeM;
        this.quantidadeG = quantidadeG;

    }

    public void Venda() {
        int escolha = -1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual tamanho você de roupa você quer? \n 1 - P \n 2- M \n 3- G");
        switch (escolha) {
            case 1:
                if (this.quantidadeP > 0) {
                    this.quantidadeP -= 1;
                } else {
                    System.out.println("Não há camisas disponíveis. ");
                }
            case 2:
                if (this.quantidadeM > 0) {
                    this.quantidadeM -= 1;
                } else {
                    System.out.println("Não há camisas disponíveis. ");
                }
            case 3:
                if (this.quantidadeG > 0) {
                    this.quantidadeG -= 1;
                } else {
                    System.out.println("Não há camisas disponíveis. ");
                }
            case 0:
                System.out.println("Não houve compra. ");
        }
    }
}