import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();
        List<Servico> servicos = new ArrayList<>();
        List<Agenda> agendamentos = new ArrayList<>();

        Animal animal1 = new Cachorro("Belinha", "Pitbull", "19/02/2020", "Gabriel Oliveira");
        Animal animal2 = new Gato("Miau", "Siamês", "17/08/2019", "Ana Duarte");

        Produto bola = new Brinquedo("Rapidex", 12.50, 77);
        Produto ração = new Alimento("Fórmula Natural", 70.00, 15);
        produtos.add(bola);
        produtos.add(ração);

        System.out.println("--------------------------");
        bola.vender(3);
        ração.vender(2);
        System.out.println("--------------------------");

        Servico banho = new Banho();
        Servico tosa = new Tosa();
        Servico consulta = new Consulta();
        servicos.add(banho);
        servicos.add(tosa);

        List<Servico> servicosDisponiveis = List.of(banho, tosa, consulta);
        Servico.listarServicosDisponiveis(servicosDisponiveis);
        System.out.println("--------------------------");

        List<Produto> produtosDisponiveis = List.of(bola, ração);
        Produto.listarProdutosDisponiveis(produtosDisponiveis);
        System.out.println("--------------------------");

        Agenda agenda1 = new Agenda(animal1, banho, "20/10/2023", "13h30");
        agenda1.agendar(agendamentos);

        Agenda.listarAgendamentos(agendamentos);
        System.out.println("--------------------------");
    }

}