 class nested_if_else5 {
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

