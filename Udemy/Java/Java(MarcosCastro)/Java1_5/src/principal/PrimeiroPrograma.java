//aula operadores l�gicos, de atribui��o e aritm�ticos

package principal;

public class PrimeiroPrograma {
	public static void main(String[] args) {
		
		int n1, n2, n3;
		
		n1 = 10;
		n2 = 20;
		n3 = 15;
		
		n1++;
		n2--;
		n3 += 4;
		
		System.out.println(n1 < n2 || n1 == n2);
		System.out.println(n1 < n2 && n1 == n2);
		System.out.println(!(n1 > n2));
		
		System.out.println(n1);
		System.out.println(n2);	
	
	
	}
}
