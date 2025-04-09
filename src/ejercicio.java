public class ejercicio {
    public int fibonacci(int n) {
       if(n==0 || n==1){
             return n;
       }
       return fibonacci(n-1) + fibonacci(n-2);

    }
    public int sumaconse (int n){
        if(n==1){
            return 1;
        }
        return n + sumaconse(n-1);
    }  
}
