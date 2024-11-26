package controleDeEstoque;

public abstract class Peca {
  protected String desc;
  protected int qntEstoque;
  protected int minEstoque;
  protected int maxEstoque;
  protected float valorProduto;

  public Peca(String desc,int qntEstoque, int minEstoque,int maxEstoque, float valorProduto){
    this.desc = desc;
    this.qntEstoque = qntEstoque;
    this.minEstoque = minEstoque;
    this.maxEstoque = maxEstoque;
    this.valorProduto = valorProduto;
  }

  public abstract void Venda();

  public void reposicaoEstoque() {
    this.qntEstoque = this.qntEstoque < this.minEstoque ? this.maxEstoque : this.qntEstoque;
  }    
}