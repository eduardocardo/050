
/**
 * Write a description of class Test0050 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test0050
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Test0050
     */
    public Test0050()
    {
        // initialise instance variables
        x = 0;
    }

    /**
    *Metodo que realiza la multiplicacion de dos numero enteros que damos como parametros
    */
   public int multiplicar(int a, int b)
   {
       int multiplicando = a;
       int multiplicador = 0;
       int resultado = 0;
       
        while(multiplicador < b)
       {
           
           resultado = resultado + multiplicando;
           multiplicador++;
       }
       
       return resultado;
   }
   
   /**
    * Metodo que realiza la division de dos numeros enteros que damos como parametros
    */
   public int dividir(int a,int b)
   {
       int valorA = valorAbsoluto(a);
       int valorB = valorAbsoluto(b);
       
       int cont = 0;
       int resultado = valorA;
       while(resultado>= valorB)
       {
           resultado = resultado - valorB;
           cont++;
       }
       if((a>0 || b>0) && (a<0 || b<0))
       {
           cont = 0 - cont;
       }
       return cont;
   }
   
   /**
    * Metodo para calcular el modulo de un numero entero entre otro
    */
   public int modulo(int a,int b)
   {
       int valorA = valorAbsoluto(a);
       int valorB = valorAbsoluto(b);
       
       int resultado = valorA;
       while(resultado>=valorB)
       {
           resultado = resultado - valorB;
           
       }
       if(a<0)
       {
           resultado = 0 - resultado;
       }
       return resultado;
   }
   
   /**
    * Metodo que calcula un numero elevado a otro
    */
   public int potencia(int a,int b)
   {
       int cont = 1;
       int resultado = a;
       if(b==0)
       {
           resultado = 1;
       }
       else
       {
           while(cont<b)
           {
               resultado = multiplicar(resultado,a);
               cont++;
           }
       }
       return resultado;
   }
   /**
    * metodo para conseguir el valor absoluto de un numero
    */
    private int valorAbsoluto(int n)
    {
        int resultado = 0;
        if (n >= 0)
        {
            resultado = n;
        }
        else
        {
            resultado = 0 - n;
        }
        return resultado;
    }
}
