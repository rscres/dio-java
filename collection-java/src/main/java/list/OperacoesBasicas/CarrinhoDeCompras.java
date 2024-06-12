package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> conteudo = new ArrayList<Item>();

    public void adicionarItem(String nome, double preco, int quantidade) {
        conteudo.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        if (conteudo.isEmpty())
            System.out.println("O carrinho esta vazio");
        else {
            Iterator<Item> it = conteudo.iterator();
            while (it.hasNext()) {
                Item i = it.next();
                if (i.getNome().equals(nome))
                    it.remove();
            }
        }
    }

    public double calcularValorTotal() {
        double total = 0;
        for (Item i : conteudo) {
            total += (i.getPreco() * i.getQuantidade());
        }
        return total;
    }

    public void exibirItens() {
        if (conteudo.isEmpty())
            System.out.println("O carrinho esta vazio");
        else
            System.out.println(conteudo);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.exibirItens();

        carrinho.adicionarItem("Banana", 2, 10);
        carrinho.adicionarItem("Carne", 50.5, 2);
        carrinho.adicionarItem("Cerveja", 5, 6);

        carrinho.exibirItens();

        System.out.println("Preco atual: " + carrinho.calcularValorTotal());

        carrinho.removerItem("Banana");

        carrinho.exibirItens();

        System.out.println("Preco atual: " + carrinho.calcularValorTotal());
    }
}