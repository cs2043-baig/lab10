public class Fibonacci {
  int fib(int n){
       if(n <= 2) {
          return 1;
      }
 	else{
	   return fib(n-1) + fib(n-2);
 	}
  }
   public static void main(String [] args){
    Fibonacci f = new Fibonacci();
    System.out.println("fib(10)=" + f.fib(10));
    }	
      
}