
package crawler;

public class Crawler {
    
    public static String location;
    
    public static void main(String[] args) {
        
        location = "Aa"; 
        

        while (true){ // this while loop runs the entire time the program is running
            
            /*Now we set up the game map. It is a 5x5 grid that looks like this.
            
            Aa Ab Ac Ad Ae
            Ba Bb Bc Bd Be
            Ca Cb Cc Cd Ce
            Da Db Dc Dd De
            Ea Eb Ec Ed Ee
            
            The player can move around in it, find treasure, fight monsters etc. 
            The game map is built using the following switch:
            */
            
            switch (location){ 
                case "Aa": 
                    Locations.aa(); // method for whatever happens at that location. In it the variable 'location' must change value, either by user input or some other event.  
                    break; // That way the player will end up in a new location when the continuos for loop starts over.
               /* case "Ab": 
                    ab();
                    break;
                case "Ac": 
                    ac();
                    break;
                case "Ad": 
                    ad();
                    break;
                case "Ae":
                    ae();
                    break;
                
                case "ba": 
                    ba();
                    break;
                case "bb": 
                    bb();
                    break;
                case "bc": 
                    bc();
                    break;
                case "bd": 
                    bd();
                    break;
                case "be":
                    be();
                    break;
                
                case "ca": 
                    ca();
                    break;
                case "cb": 
                    cb();
                    break;
                case "cc": 
                    cc();
                    break;
                case "cd": 
                    cd();
                    break;
                case "ce":
                    ce();
                    break;
                
                case "da": 
                    da();
                    break;
                case "db": 
                    db();
                    break;
                case "dc": 
                    dc();
                    break;
                case "dd": 
                    dd();
                    break;
                case "de":
                    de();
                    break;
                
                case "ea": 
                    ea();
                    break;
                case "eb": 
                    eb();
                    break;
                case "ec": 
                    ec();
                    break;
                case "ed": 
                    ed();
                    break;
                case "ee":
                    ee();
                    break;
                    
             */           
            } // end of switch that makes game map
        
        } // end continous while-loop
    } //end main
    
}
