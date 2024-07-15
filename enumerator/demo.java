enum Status {
    Running, Failed, Pending, Success;
}



public class demo {
    public static void main(String[] args) {
    
        // int i = 5;
        // Status s = Status.Running;
        // System.out.println(s + " : " +   s.ordinal()); // This will print status and order no.



        // int j = 10;
        // Status [] ss = Status.values();
        // System.out.println(ss[0]);      // This will return according to values.


        int k = 5;
        Status ss[] = Status.values();
        for (Status s:ss) 
        {
            System.out.println(s + ": " + s. ordinal());
        }
    }

}
