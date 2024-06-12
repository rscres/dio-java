package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {

    private List<Tarefa> tarefaList = new ArrayList<Tarefa>();

    public ListaTarefas() {
    }

    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
       if (tarefaList.isEmpty()) {
           System.out.println("A lista de tarefas esta vazia.");
           return;
       }
       tarefaList.removeIf(t -> t.getDescricao().equals(descricao));
    }

    public int obterNumeroTotalTarefas() {
        return this.tarefaList.size();
    }

    public void obterDescricoesTarefas() {
        if (tarefaList.isEmpty())
            System.out.println("A lista de tarefas esta vazia.");
        else
            System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefas lista = new ListaTarefas();

        lista.obterDescricoesTarefas();

        //Adicionar tarefas
        lista.adicionarTarefa("Estudar");
        lista.adicionarTarefa("Lavar roupa");
        lista.adicionarTarefa("Passear com os cachorros");

        //Printar tarefas e tamanho da lista
        lista.obterDescricoesTarefas();
        System.out.println("Numero de tarefas: " + lista.obterNumeroTotalTarefas());

        //Remover tarefa e printar lista de novo
        lista.removerTarefa("Lavar roupa");
        System.out.println("Numero de tarefas: " + lista.obterNumeroTotalTarefas());
        lista.obterDescricoesTarefas();
    }
}
