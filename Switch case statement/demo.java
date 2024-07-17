


//  This is the simplest Switch Case statement.

public class demo {
    public static void main(String[] args) {
    
    String day= "Sunday";
    String result = "";

    switch (day) {
        case "Tuesday" -> result = "10am ";    //You can use operators for such operations
        
        case "Wednesday" -> result = "11am";
            
    
        default -> result = "9am";                  
    }
    System.out.println(result);

    }
}
