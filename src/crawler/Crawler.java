
package crawler;

public class Crawler {
    
    public static String location;
    
    public static void main(String[] args) {
        
        location = "entreance"; 
        

        while (true){ // this while loop runs the entire time the program is running
            switch (location){ // this switch contains all in-game locations
                case "entreance":
                    Entreance.run();
                    location = "hallway";
                    break;
                case "hallway":
                    Hallway.run();
                    break;
                case "basement":
                    Basement.run();
                    break;
                case "kitchen":
                    Kitchen.run();
                    break;
                case "livingroom":
                    LivingRoom.run();
                    break;
                case "bedroom":
                    Bedroom.run();
                    break;
                case "attic":
                    Attic.run();
                    break;
            
            } // end switch
        
        } // end continous while-loop
    } //end main
    
}
