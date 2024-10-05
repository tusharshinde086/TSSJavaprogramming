
public class program14 {
    public static void main(String args[]){
        int[] numbers = {10,20,30,40,50};
        int sum = 0;

        for(int num:numbers){
            sum+=num;
        }
            System.out.println("Sum of array elements: "+sum);
            int numOfElement = numbers.length;
            int avg;
            avg = sum/numOfElement;
            System.out.println("Avarage of elements in array: "+avg);
    }
}

