package studio3;

import java.util.Scanner;

public class sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("find all prime numbers up to: ");
		int n = in.nextInt();
		boolean[] prime = new boolean[n+1];
		for (int i = 0; i <= n; i++){
			prime[i] = true;
			//System.out.println(prime[i]);
			
			
		}
		for (int p = 2; p*p <= n; p++) {
			//if (prime[p]) {
			for (int i = p*p; i <=n; i+=p) {
				prime[i] = false;
			}
			
		}
		
		
		for (int e = 1; e < n; e++) {
			if (prime[e]) {
				System.out.println(e);
			}
			
		}

	}

}
