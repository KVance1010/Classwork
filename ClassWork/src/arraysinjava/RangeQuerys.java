package arraysinjava;

public class RangeQuerys {

	public static void main(String[] args) {
		int L = 2, R= 5;
		System.out.println("sum of natural numbers L to R is: "+ sumInRange(L,R));
	}
		private static int sumInRange (int l, int r) {
			return sumNatural(r) - sumNatural(l-1);
			
		}
		
		public static int sumNatural (int n) {
			int sum = ( n *(n+1) )/2;
			return sum;
		}

	}


