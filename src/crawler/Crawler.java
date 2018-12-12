
package crawler;

public class Crawler {
    
    public static String location;
    
    public static void main(String[] args) {
        
        location = "";
        

        while (true){
            switch (location){
                case "basement":
                    Basement.run();
                    break;
                case "kitchen":
                    Kitchen.run();
            
            } // end switch
        
        } // end continous while-loop
    } //end main
    
}
