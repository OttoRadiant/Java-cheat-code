
class AbhiException extends Exception{

    public AbhiException(String string)
    {
        super(string);
    }
}

public class demo {

    public static void main(String[] args) {
     int i = 20;
     int j = 0;

     try {
        j = 18/0;
        if (j == 0)
        throw new AbhiException("Cant input zero" );
     }
     catch(ArithmeticException e){
        j = 18/1;
        System.out.println("Printed the default output"+ e);
    }
     catch(AbhiException e){
        System.out.println("Something went wrong" + e);
     }
     System.out.println(j);
    
    }

    }
    


