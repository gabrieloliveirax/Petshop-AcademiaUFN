import java.util.List;

abstract class Servico {

    public abstract String descricao();
    public abstract double preco();

    public static void listarServicosDisponiveis(List<Servico> servicosDisponiveis){
        System.out.println("Serviços Disponíveis");
        for (Servico servico: servicosDisponiveis){
            System.out.println("Serviço: "+servico.descricao());
            System.out.println("Preço: "+servico.preco());
        }
    }

}