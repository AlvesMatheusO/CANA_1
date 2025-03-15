package entities;

import java.util.ArrayList;
import java.util.List;

public class BubbleSort {
    List<Integer> list = new ArrayList<>();

    public BubbleSort() {

    }


    // Análise do algoritmo bubble sort, em comentários. - Pedro Gaya
    // c = custo arbitrário, n = tamanho da lista.
    
    public static void sort(List<Integer> list){
        boolean flag = false; // Custo 0
        for(int i=0; i<list.size(); i++){ // Custo c, executado n+1 vezes
            if(i==0){ // Custo 0
                flag = false; // Custo 0
            } // Custo 0

            if(i+1 < list.size() && list.get(i) > list.get(i+1)){ // Custo 0
                swap(list, i); // Operação linear, Custo 0
                flag = true; // Custo 0
            } 

            if(i+1 == list.size() && flag == true){ // Custo 0
                
                i=-1; // Altera o índice de loop do algoritmo, custo c*n^2
                //
                // A consequência principal da linha é o loop "recomeçar", induzindo um "custo virutal", embora seja operação simples.
                //
                // Essa linha é executada nas seguintes condições:
                //    O ponteiro está no final (i + 1 == n)
                //    Ocorreram swaps.
                // Se ocorram swaps, o array não está ordenado, portanto zeramos o índice e executamos novamente.
                // Isso indica que o índice n-1 do array está ordenado.
                //
                // Essa linha pode ser executada até n vezes, uma vez que temos até n items para serem ordenados.
                //
                // Portanto, o loop pode recomeçar aqui até n vezes, mas como só executamos essa "reset" ao final do loop...
                // ...esse bloco de código é executado, efetivamente, n*n vezes.
                //
                // Ou seja, "andamos até o final do array", com custo de c*n...
                // ... depois, conferimos se precisamos resetar, podendo resetar até n vezes.
                // Para cada reset, andamos até o final do array novamente.
                //
                // Temos n resets, com cada reset custando c*n, portanto o "custo virtual" dessa linha é c*n^2
            }
        }

        // Somando todos os custos, temos c*n^2 como termo dominante, portanto o algoritmo é O(n^2).
    }

    public static void swap(List<Integer> list, int i){
        Integer aux = list.get(i);
        list.set(i,list.get(i+1));
        list.set(i+1,aux);
    }
}
