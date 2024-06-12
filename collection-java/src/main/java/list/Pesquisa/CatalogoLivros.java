package main.java.list.Pesquisa;

import javax.lang.model.type.NullType;
import java.util.ArrayList;
import java.util.Vector;
import java.util.List;
import java.util.ListIterator;

public class CatalogoLivros {
    List<Livro> livros;

    public CatalogoLivros() {
        livros = new Vector<Livro>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livros.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        if (livros.isEmpty())
            throw new RuntimeException("A lista esta vazia");
        List<Livro> livrosAchados = new Vector<Livro>();
        livros.forEach( l -> {
                    if (l.getAutor().equals(autor))
                        livrosAchados.add(l);
                });
        return livrosAchados;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        if (livros.isEmpty())
            throw new RuntimeException("A lista esta vazia");
        List<Livro> livrosAchados = new Vector<Livro>();
        for (Livro l : livros) {
            int ano = l.getAno();
            if (ano >= anoInicial && ano <= anoFinal)
                livrosAchados.add(l);
        }
        return livrosAchados;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        if (livros.isEmpty())
            throw new RuntimeException("A lista esta vazia");
        ListIterator<Livro> it = livros.listIterator();
        while (it.hasNext()) {
            if (it.next().getTitulo().equals(titulo))
                return it.previous();
        }
        return null;
    }

    public static void main(String[] args) {
        // Criando uma instância do catálogo de livros
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        // Adicionando livros ao catálogo
        catalogoLivros.adicionarLivro("Microsserviços Prontos Para a Produção", "Susan J. Fowler", 2017);
        catalogoLivros.adicionarLivro("Java Guia do Programador", "Peter Jandl Junior", 2021);
        catalogoLivros.adicionarLivro("Código Limpo", "Robert C. Martin", 2009);
        catalogoLivros.adicionarLivro("O Codificador Limpo", "Robert C. Martin", 2012);

        // Exibindo livros pelo mesmo autor
        System.out.println(catalogoLivros.pesquisarPorAutor("Robert C. Martin"));

        // Exibindo livros pelo mesmo autor (caso em que não há livros de um autor específico)
        System.out.println(catalogoLivros.pesquisarPorAutor("Autor Inexistente"));

        // Exibindo livros dentro de um intervalo de anos
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2010, 2022));

        // Exibindo livros dentro de um intervalo de anos (caso em que não há livros no intervalo)
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2025, 2030));

        // Exibindo livros por título
        System.out.println(catalogoLivros.pesquisarPorTitulo("Java Guia do Programador"));

        // Exibindo livros por título (caso em que não há livros com o título especificado)
        System.out.println(catalogoLivros.pesquisarPorTitulo("Título Inexistente"));

        // Exibindo livros por título
        System.out.println(catalogoLivros.pesquisarPorTitulo("Microsserviços Prontos Para a Produção"));
    }
}
