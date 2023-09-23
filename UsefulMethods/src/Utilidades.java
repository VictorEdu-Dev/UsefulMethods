
public class Utilidades { // Exercise 01
	
	
	public static int somatoria(int[] vetor) {
		int initialLimit = 2;
		int finalLimit = 2;
		int total = 0;
		
		for (int i = 0; i < vetor.length - finalLimit; i++) {
			if (i >= initialLimit) {
				total += vetor[i];
			}
		}
		return total;
	}
	
	
	
	
	public static void pairNumbers(int number1, int number2) { //Exercise02
		int cont = number1;
		int contFinal = number2;
		
		// variable changer
		if (cont > contFinal) {
			int exchanger;
			exchanger = cont;
			cont = contFinal;
			contFinal = exchanger;
		}
			
		for (int i = cont; i <= contFinal; i++) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}
	}
	
	
	
	
	public static float mediaReal(int[] entrada1, int[] entrada2) { // Exercise03
		float somaElementar = 0;
		float mediaElementar;
		int divisorElementar = 2;
		
		for (int i = 0; i < entrada1.length; i++) {
			somaElementar += entrada1[i];
		}
		for (int j = 0; j < entrada2.length; j++) {
			somaElementar += entrada2[j];
		}
		
		mediaElementar = somaElementar/divisorElementar;
		
		return mediaElementar;
	}

	
	
	
	public static float mediaPonderadaReal(float notas[], int pesos[]) { // Exercise04
		float somaElementar = 0;
		float mediaPonderadaElementar = 0;
		int somatoriaPesos = 0;
		
		for (int i = 0; i < notas.length; i++) {
			somaElementar += notas[i];
				if (pesos[i] > 1) {
					somaElementar += (notas[i] * pesos[i]) - notas[i]; 
				}
			}
		
		for (int j : pesos) {
			somatoriaPesos += j; 
		}
		
		mediaPonderadaElementar = somaElementar/somatoriaPesos;
		
		return mediaPonderadaElementar;
	}
	
	
	
	
	public static int contadorElementar(int[] elementos1, int[] elementos2, int elementoModa) { // Exercise05
		int incidence = 0;
		
		for (int i = 0; i < elementos1.length; i++) {
			if (elementos1[i] == elementoModa) {
				incidence += 1;
			}
		}
		
		for (int j = 0; j < elementos2.length; j++) {
			if (elementos2[j] == elementoModa) {
				incidence += 1;
			}
		}		
		return incidence;
	}
	
	
	
	
	
	public static int[] vetCpy(int[] object) { // Exercise06
		int limit = object.length;
		int[] copy = new int[limit];
		
		for (int i = 0; i < limit; i++) {
			copy[i] = object[i];
		}
		
		return copy;
	}
	

	
	
	
	public static int[] order(int[] vector) { // Exercise07
		int limit = vector.length;
		boolean condition = false;
		
		
		for (int i = 1; i < limit; i++) {
			if (vector[i-1] > vector[i]) {
				int trocador = vector[i-1];
				vector[i-1] = vector[i];
				vector[i] = trocador;
				condition = true;
			}
		}
		
		if (condition) {
		order(vector);
		}
		
		return vector;
	}
	
	
	
	
	public static boolean orderVector(int[] vector) { // Exercise08
		int limit = vector.length;
		boolean condition = false;
		
		
		for (int i = 1; i < limit; i++) {
			if (vector[i-1] > vector[i]) {
				return false;
			} else {
				condition = true;
			}
		}
		
		if (condition) {
		order(vector);
		}
		
		return condition;
	}

	
	
	
	
	public static int elementoModa(int[] vector, int k) {
		// int numberModa = k;
		int[][] ranking = new int[vector.length][vector.length];
		
		for(int i = 0; i < vector.length; i++) {
			int contador = 0;
			for(int j = 0; j < vector.length; j++) {
				if(vector[i] == vector[j]) {
						contador += 1;
						ranking[i][j] = contador;
				}
				ranking[i+1][j] = vector[j];
			}
		}
		
//		for (int i = 0; i < ranking.length - 1; i++) {
//	        for (int j = i + 1; j < ranking.length; j++) {
//	            if (ranking[i] < ranking[j]) {
//	                int tempRanking = ranking[i];
//	                int tempKeeper = keeper[i];
//
//	                ranking[i] = ranking[j];
//	                keeper[i] = keeper[j];
//
//	                ranking[j] = tempRanking;
//	                keeper[j] = tempKeeper;
//	            }
//	        }
//	    }
		
		return ranking[k-1][k];
	}
	
	
	

	public static void main(String[] args) {
		int vet1[] = {9, 8, 7, 8, 1, 2};
		//int vet2[] = {1, 2, 4, 3, 3, 3, 3, 3, 3, 3, 3, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6};
		
			QuickSort order = new QuickSort(vet1, 0, vet1.length - 1);

			System.out.println((vet1, 2));

	}
	
}