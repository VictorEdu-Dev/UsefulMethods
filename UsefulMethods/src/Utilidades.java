import java.util.ArrayList;

public class Utilidades { // Exercise 01
	
	
	public int Somatoria(int[] vetor) {
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
	
	
	
	
	public void PairNumbers(int number1, int number2) { //Exercise02
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
	
	
	
	
	public float MediaReal(int[] entrada1, int[] entrada2) { // Exercise03
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

	
	
	
	public float MediaPonderadaReal(float notas[], int pesos[]) { // Exercise04
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
	
	
	
	
	public int ContadorElementar(int[] elementos1, int[] elementos2, int elementoModa) { // Exercise05
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
	
	
	
	
	
	public int[] VetCpy(int[] object) { // Exercise06
		int limit = object.length;
		int[] copy = new int[limit];
		
		for (int i = 0; i < limit; i++) {
			copy[i] = object[i];
		}
		
		return copy;
	}
	

	
	
	
	public int[] Order(int[] vector) { // Exercise07
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
		Order(vector);
		}
		
		return vector;
	}
	
	
	
	
	public boolean OrderVector(int[] vector) { // Exercise08
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
		Order(vector);
		}
		
		return condition;
	}

	
	// Exercise 09
	 public int KthLargestElement(int[] vetor, int k) {
	        ArrayList<Integer> valueUnits = new ArrayList<>();

	        for (int num : vetor) {
	            if (!valueUnits.contains(num)) {
	                valueUnits.add(num);
	            }
	        }

	        if (k <= 0 || k > valueUnits.size()) {	    
	        	System.out.println("Invalid K");
	        }

	        int KEsimoMaior = valueUnits.size() - k;

	        return valueUnits.get(KEsimoMaior);
	    }	
	

	 
	 
	 // Exercise 10
	 public int KthSmallestElement (int[] vetor, int k) {
	        if (k <= 0 || k > vetor.length) {
	            return -1; // Valor de k fora do intervalo, retornamos um valor padrão
	        }

	        OrderVector(vetor); // Ordenamos o vetor em ordem crescente
	        return vetor[k - 1]; // O K-ésimo menor valor estará na posição k - 1
	    }
	 
	 
	 
	 // Exercise 11
	 public boolean VerifyEqualVector (int vet[], int otherVet[]) {
		 for (int i : vet) {
			 if(otherVet[i] != vet[i]) {
				 return false; 
			 }
		 }
		 return true;
	 }
	 
	 
	 // Exercise 12
	 public double Potentiation (double base, double expoent) {
		 double total = base;
		 // expoent = 0
		 if (expoent == 0) {
			return 1;
		 }
		 
		 // expoent > 0
		 if (expoent > 0) {
			 for(int i = 1; i <= expoent; i++) {
				 total = total * base; 
			 }
		 }
		 
		 // expoent < 0
		 if (expoent < 0) {
			 for(int i = 1; i <= expoent; i++) {
				 total = 1/(total * base); 
			 }
		 }
		 
		 return total;
	 }
	 
	 
	 // Exercise 13
	 public void verifyPrimeNoRutrn(int k) {
		    if (k <= 1) {
		        return;
		    }
		    for (int i = 2; i * i <= k; i++) {
		        if (k % i == 0) {
		            return; // Encontrou um divisor, não é primo
		        }
		    }
		    return;
		}

	 
	 
	 // Exercise 14
	 public ArrayList<Integer> frequency (int[] vetA, int[] vetB) {
		 ArrayList <Integer> numbers = new ArrayList<Integer>();
		 int lengthA = vetA.length;
		 int lengthB = vetB.length;
		 int defaultLength = lengthA;
		 
		 if (lengthB > lengthA)  {
			 defaultLength = lengthB;
		 }
		 for (int i = 0; i < defaultLength; i++) {
			 for (int j = 0; j < defaultLength; j++) {
				 if (vetA[i] == vetB[j]) {
				 numbers.add(vetA[i]);
				 }
			 }
		 }
		 
		 return numbers;
	 }
	 
	 
	 
	 
	 // Exercise 15
	 public ArrayList<Integer> removeNumber (int[] vetA, int k) {
		 ArrayList <Integer> numbers = new ArrayList<Integer>();
		 int lengthA = vetA.length;
		 int defaultLength = lengthA;
		 
		 for (int i = 0; i < defaultLength; i++) {
				 if (vetA[i] != k) {
				 numbers.add(vetA[i]);
				 }
		 }
		 
		 return numbers;
	 }
	 
	 
	 
	 
	 // Exercise 16
	 public boolean verifyPalindrome (int[] vet) {
		 int j = vet.length;
		 for (int i = 0; i < vet.length; i++) {
				 if (vet[i] == vet[j]) {
				 j--;
				 } else {
					 return false;
				 }
		 }
		 
		 return true;
	 }
	 
	 
	 
	 
	 // Exercise 17
	 public boolean verifyPrime(int k) {
		    if (k <= 1) {
		        return false;
		    }
		    for (int i = 2; i * i <= k; i++) {
		        if (k % i == 0) {
		            return false; // Encontrou um divisor, não é primo
		        }
		    }
		    return true;
		}
	 
	 
	 
	 
	 // Exercise 18
//	 public String invertString (String string) {
//		 int lengthA = vetA.length;
//		 int defaultLength = lengthA;
//		 
//		 for (int i = 0; i < defaultLength; i++) {
//				 if (vetA[i] != k) {
//				 numbers.add(vetA[i]);
//				 }
//		 }
//		 
//		 return String;
//	 }
	 
	 
	 
	 
	 
	 // Exercise 19
	 public double CompoundInterest (double valorInitial, double rate, int period) {		 
		 double realRate = rate/100;
		 int capitalization = 12;
		 
		 // calculo
		 double amount = (valorInitial*Potentiation((1 + (realRate/capitalization)), (capitalization*period)));
		 
		 return amount;
	 }
	 
	 
	 
	 // Exercise 20
	 public boolean perfectNumber (int number) {
		 if (number <= 1) {
	            return false;
	        }

	        int sum = 1;

	        for (int i = 2; i <= number / 2; i++) {
	            if (number % i == 0) {
	                sum += i;
	            }
	        }

	        return sum == number;
	 }
	 
	 
	 
	 // Exercise 21
	 public void shrinkVector (int length) {
		 if (length < 0) {
			 return;
		 }
		 
		 int index = length;
		 int vector[] = new int[index];
		 
		 do {
			 for (int i = length; i <= 1; i--) {
				 index = i;
			 }
			 
		 } while (vector.length != 1); 
	 }
	 
	 
	 
	 
	 // Exercise 22
	 public void imprimirForma(int linhas, int colunas) {
	        for (int i = 0; i < linhas; i++) {
	            for (int j = 0; j <= i; j++) {
	                System.out.print(j + " ");
	            }
	            System.out.println();
	        }

	        System.out.println();

	        char[] caracteres = {'@', '*'};
	        for (int i = 0; i < linhas; i++) {
	            for (int j = 0; j < colunas; j++) {
	                System.out.print(caracteres[(i + j) % 2] + " ");
	            }
	            System.out.println();
	        }
	    }
	 
}