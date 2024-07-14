




public class demo {
    public static void main(String[] args) {
    
    String day= "Sunday";
    String result = "";

    switch (day) {
        case "Tuesday" -> result = "10am "; 
        
        case "Wednesday" -> result = "11am";
            
    
        default -> result = "9am";                  
    }
    System.out.println(result);

    }
}