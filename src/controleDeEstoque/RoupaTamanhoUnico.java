package controleDeEstoque;

public class RoupaTamanhoUnico extends Peca{
    public RoupaTamanhoUnico(String desc,int qntEstoque, int minEstoque,int maxEstoque, float valorProduto){
        super(desc,qntEstoque,minEstoque,maxEstoque,valorProduto);

    }

    public void Venda() {
        if (this.qntEstoque > 0) {
            this.qntEstoque -= 1;
        }
    }
}
