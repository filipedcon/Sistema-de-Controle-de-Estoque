package controleDeEstoque;
import java.util.InputMismatchException;
import java.util.Scanner;

public class RoupaPMG extends Peca implements Item {
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
        try {
        System.out.println("Qual tamanho de roupa você quer? \n 1 - P \n 2 - M \n 3 - G");
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
      
        }
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Por favor, insira um número correspondente ao tamanho.");
            scan.next(); 
            }
    }

    public void reposicaoEstoque() {
      this.quantidadeP = this.quantidadeP < this.minEstoque ? this.maxEstoque : this.quantidadeP;
      this.quantidadeM = this.quantidadeM < this.minEstoque ? this.maxEstoque : this.quantidadeM;
      this.quantidadeG = this.quantidadeG < this.minEstoque ? this.maxEstoque : this.quantidadeG;      
    }
    
    public void getInfo() {
    	System.out.println(this.desc + " - " + this.valorProduto);
    }
}