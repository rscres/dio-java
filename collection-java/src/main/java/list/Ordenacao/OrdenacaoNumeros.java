package main.java.list.Ordenacao;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class OrdenacaoNumeros {
    List<Integer> numeros;

    public OrdenacaoNumeros() {
        numeros = new ArrayList<Integer>();
    }

    public void adicionarNumero(int numero) {
        numeros.add(numero);
    }

    public List<Integer> ordenarAscendente() {
        List<Integer> ordenada = new ArrayList<Integer>(numeros);
        Collections.sort(ordenada);
        return ordenada;
    }

    public List<Integer> ordenarDescendente() {
        List<Integer> ordenada = new ArrayList<Integer>(numeros);
        Collections.sort(ordenada);
        Collections.reverse(ordenada);
        return ordenada;
    }

    public static void main(String[] args) {
        OrdenacaoNumeros num = new OrdenacaoNumeros();

        num.adicionarNumero(12);
        num.adicionarNumero(-2);
        num.adicionarNumero(78);
        num.adicionarNumero(15);
        num.adicionarNumero(-25);
        num.adicionarNumero(64);
        num.adicionarNumero(101);

        System.out.println(num.ordenarAscendente());
        System.out.println(num.ordenarDescendente());

    }
}
