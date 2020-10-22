
//https://www.facebook.com/honey.agrawal.12935/posts/770711770445417
// Subscribed from 1MS19CS135 Utkarsh 

import java.util.Scanner;
public class SpecialNumber { 
  
    public static void main(String[] args) { 
	Scanner input = new Scanner(System.in); 
	int n = input.nextInt(); 
	input.close(); 
	if (isSpecialNumber(n)) { 
	    System.out.printf("%d is a special number.\n", n); 
	} else { 
	    System.out.printf("%d is not a special number.\n", n); 
	} 
    } 
 
    public static boolean isSpecialNumber(int n) { 
	int i = n, factorialSum = 0; 
	while (i > 0) { 
	    int digit = i % 10; 
	    i /= 10; 
	    factorialSum += factorial(digit); 
	} 
	return factorialSum == n ? true : false; 
    } 
 
    public static int factorial(int n) { 
	int factorial = 1; 
	int i = n < 0 ? -n : n; 
	while (i > 0) { 
	    factorial *= i; 
	    i--; 
	} 
	return n < 0 ? -factorial : factorial; 
    } 
} 
