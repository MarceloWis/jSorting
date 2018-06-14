package br.udesc.ceplan.jsorting.algoritmos;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

import br.udesc.ceplan.jsorting.utils.GeraVetor;

public class CountingSortTest {
    /**
    *
    * @author Marcelo Wischniowski <marcelowisc at gmail.com>
    */
   @Test
   public void HeapSortTest() {
       GeraVetor geraVetor = new GeraVetor();

       // Crio um novo vetor
       int[] vetor = geraVetor.random(10);

       // Faço uma cópia dele
       int[] experado = Arrays.copyOf(vetor, vetor.length);

       // Ordeno a cópia com uma ordenação do Java
       Arrays.sort(experado);

       // Testo o CountingSort
       CountingSort CountingSort = new CountingSort(vetor);
       CountingSort.sort();

       System.out.println("CountingSort: " + CountingSort.toString());
       System.out.println("Experado: " + Arrays.toString(experado));

       Assert.assertArrayEquals(experado, CountingSort.get());
   }
}
