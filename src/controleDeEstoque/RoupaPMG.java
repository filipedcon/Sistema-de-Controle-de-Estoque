package controleDeEstoque;
import java.util.Scanner;

public class RoupaPMG extends Peca {
    protected int quantidadeP;
    protected int quantidadeM;
    protected int quantidadeG;

    public RoupaPMG(String desc, int qntEstoque, int minEstoque, int maxEstoque, float valorProduto, int quantidadeP, int quantidadeM, int quantidadeG) {
        super(desc, qntEstoque, minEstoque, maxEstoque, valorProduto);
        this.quantidadeP = quantidadeP;
        this.quantidadeM = quantidadeM;
        this.quantidadeG = quantidadeG;

    }

    public void Venda() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual tamanho de roupa você quer? \n 1 - P \n 2- M \n 3- G");
        int escolha = scan.nextInt();
        switch (escolha) {
            case 1:
                if (this.quantidadeP > 0) {
                    this.quantidadeP -= 1;
                    System.out.println("Compra realizada com sucesso! P");
                    System.out.println("Quantidade em estoque: " + this.quantidadeP);
                } else {
                    System.out.println("Não há tamanho P disponível. ");
                }
                break;
            case 2:
                if (this.quantidadeM > 0) {
                    this.quantidadeM -= 1;
                    System.out.println("Compra realizada com sucesso! M");
                    System.out.println("Quantidade em estoque: " + this.quantidadeM);
                } else {
                    System.out.println("Não há tamanho M disponível. ");
                }
                break;
            case 3:
                if (this.quantidadeG > 0) {
                    this.quantidadeG -= 1;
                    System.out.println("Compra realizada com sucesso! G");
                    System.out.println("Quantidade em estoque: " + this.quantidadeG);
                } else {
                    System.out.println("Não há tamanho G disponível. ");
                }
                break;
            default:
              break;
        }
    }
}