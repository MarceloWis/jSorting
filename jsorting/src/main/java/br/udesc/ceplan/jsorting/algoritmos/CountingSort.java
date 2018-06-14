package br.udesc.ceplan.jsorting.algoritmos;

import br.udesc.ceplan.jsorting.core.AbstractSort;

public class CountingSort extends AbstractSort  {

	public CountingSort(int[] vetor) {
		super(vetor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sort() {
		int higher = vetor[0];
		
		for(int index = 1; index < vetor.length; index++) {
			if(vetor[index] > higher ) {
				higher = vetor[index];
			}
		}
	
		int[] temp = new int[higher];
		
		 
		 for(int index = 0; index < vetor.length; index++) {
			 temp[vetor[index] - 1] = temp[vetor[index] - 1] + 1;
		 };
		 
	
		 for(int index = 1; index < temp.length; index++) {
			 temp[index] = temp[index] + temp[index - 1];
		 };
		 
		 int[] temp2 = new int[vetor.length];
		 
		 
		 for(int index = 0; index < temp2.length; index++) {
			 temp2[temp[vetor[index] - 1] - 1] = vetor[index];
		     temp[vetor[index] - 1] = temp[vetor[index] - 1] - 1;
		 };
		 
		 for(int index = 0; index < temp2.length; index++) {
			 vetor[index] = temp2[index];
		 }
		 
	};

}
