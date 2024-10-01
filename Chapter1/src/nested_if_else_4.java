//Traffic Light Action
/**
 * Determine actions based on traffic light colors and the presence of pedestrians. The rules are:

Green light: "Drive" if no pedestrian is waiting, "Slow down" if a pedestrian is waiting.
Yellow light: "Prepare to stop", regardless of pedestrians.
Red light: "Stop", regardless of pedestrians.
 */
public class nested_if_else_4 {
    public static void main(String args[]){
        String trafficLight = "Yellow";
        boolean isPedestrian = true;

        if("Green".equals(trafficLight)){
            if(isPedestrian){
                System.out.print("Slow down");
            }
            else{
                System.out.print("Drive");
            }
        }
        else if("Yellow".equals(trafficLight)){
            System.out.print("Prepare to stop");
        }
        else{
            System.out.print("Stop");
        }
    }
}
