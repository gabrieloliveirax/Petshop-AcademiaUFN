import java.util.List;

abstract class Produto {

    private String nome;
    private String categoria;
    private Double preco;
    private int quantidadeEmEstoque;

    public Produto(String nome, String categoria, Double preco, int quantidadeEmEstoque) {
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public void vender(int Quantidade) {
        if (getQuantidadeEmEstoque() >= Quantidade) {
            setQuantidadeEmEstoque(getQuantidadeEmEstoque() - Quantidade);
            System.out.println("Venda realizada com sucesso");
        } else {
            System.out.println("Não é possível realizar essa venda por falta de estoque");
        }
    }

    public static void listarProdutosDisponiveis(List<Produto> produtosDisponiveis){
        System.out.println("Produtos Disponíveis");
        for (Produto produto: produtosDisponiveis){
            System.out.println("Produto: "+produto.getNome());
            System.out.println("Preço: "+produto.getPreco());
            System.out.println("Quantidade: "+produto.getQuantidadeEmEstoque());
        }
    }

}