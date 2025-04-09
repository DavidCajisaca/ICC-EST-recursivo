public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Llamada recursiva");
        int numero = 5;
        System.out.println("El factorial de " + numero + " es: " + facto(numero));
        //fibonnaci
        ejercicio e = new ejercicio();
        int fibo=10;
        System.out.println("El fibonacci de " + fibo + " es: " + e.fibonacci(fibo));
        //suma consecutiva
        int suma=5;
        System.out.println("La suma consecutiva de " + suma + " es: " + e.sumaconse(suma));

    }
    public static int facto(int n){
        if (n == 0) {
            System.out.println("caso base");
            return 1;
        } 
        int resultado = n*facto(n-1);
        System.out.println("Calculando factorial de " + n +" fartorial("+(n-1) +")  = " + resultado);
        return resultado;
    }
}
