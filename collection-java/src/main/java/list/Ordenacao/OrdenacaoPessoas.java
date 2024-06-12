package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    List<Pessoa> pessoas;

    public OrdenacaoPessoas() {
        pessoas = new ArrayList<Pessoa>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoas.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> ordenada = new ArrayList<Pessoa>(pessoas);
        Collections.sort(ordenada);
        return ordenada;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> ordenada = new ArrayList<Pessoa>(pessoas);
        Collections.sort(ordenada, new ComparatorPorAltura());
        return ordenada;
    }

    public static void main(String[] args) {
        OrdenacaoPessoas mob = new OrdenacaoPessoas();

        mob.adicionarPessoa("Bob", 45, 1.54);
        mob.adicionarPessoa("Jimmy", 29, 2.1);
        mob.adicionarPessoa("May", 18, 1.75);
        mob.adicionarPessoa("Sally", 71, 1.61);
        mob.adicionarPessoa("Milton", 5, 1.05);

        System.out.println(mob.pessoas);
        System.out.println(mob.ordenarPorIdade());

        System.out.println(mob.ordenarPorAltura());
    }
}
