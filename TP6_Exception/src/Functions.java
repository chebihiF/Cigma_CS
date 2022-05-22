public class Functions {

    public static double calcule(int a, int b) throws ArithmeticException, RuntimeException{
  /*      int c = 0 ;
        try {
            c = a/b;
        }catch (ArithmeticException ex){
            ex.printStackTrace();
        }*/

        if(b>a)
            throw new RuntimeException("A doit etre superieur a B ");

        return (double)a/b ;
    }

}
