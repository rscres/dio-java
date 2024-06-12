package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.lang.Integer.valueOf;

public class SomaNumeros {
    private List<Integer> numeros = new ArrayList<Integer>();

    public void adicionarNumero(int numero) {
        numeros.add(numero);
    }

    public int calcularSoma() {
        return numeros.stream().mapToInt(Integer::intValue).sum();
    }

    public int encontrarMaiorNumero() {
        if (numeros.isEmpty())
            throw new RuntimeException("A lista está vazia");
        return Collections.max(numeros);
    }

    public int encontrarMenorNumero() {
        if (numeros.isEmpty())
            throw new RuntimeException("A lista está vazia");
        return Collections.min(numeros);
    }

    public void exibirNumeros() {
        if (numeros.isEmpty())
            System.out.println("A lista está vazia");
        else
            System.out.println(numeros);
    }

    public static void main(String[] args) {
        SomaNumeros soma = new SomaNumeros();

        soma.exibirNumeros();

        soma.adicionarNumero(5);
        soma.adicionarNumero(20);
        soma.adicionarNumero(11);
        soma.adicionarNumero(0);
        soma.adicionarNumero(-7);

        soma.exibirNumeros();
        System.out.println("Soma: " + soma.calcularSoma());
        System.out.println("Max: " + soma.encontrarMaiorNumero());
        System.out.println("Min: " + soma.encontrarMenorNumero());
    }
}
