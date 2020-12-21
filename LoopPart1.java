//First I will declaare the package for this java file//
package LoopHW;

//This next piece code below vv is important somehow//
import java.util.*;

public class LoopPart1 {
    private int sumAnswer;
    private int productAnswer;
    //This below will store the numbers into an array//
    ArrayList<Integer> userNumbers = new ArrayList<Integer>();
    
    public void getUserNumbers () {
        Scanner mathematicalOperations = new Scanner(System.in);
        ArrayList<Integer> userNumbers = new ArrayList<Integer>();
        System.out.println("Please enter 5 numbers.");
        
        System.out.println("The first number: ");
        userNumbers.add(mathematicalOperations.nextInt());
        
        System.out.println("The second number: ");
        userNumbers.add(mathematicalOperations.nextInt());

        System.out.println("The third number: ");
        userNumbers.add(mathematicalOperations.nextInt());

        System.out.println("The fourth number: ");
        userNumbers.add(mathematicalOperations.nextInt());

        System.out.println("The fifth number: ");
        userNumbers.add(mathematicalOperations.nextInt());

        sumAnswer = userNumbers.stream().mapToInt(n -> n).sumAnswer(); //I wasn't sure how to fix this error//

        System.out.println("The sum of your numbers is " + sumAnswer);

        Collections.sort(userNumbers);

        int smallNumber = userNumbers.get(0);
        System.out.println("The smallest numerical value is " + smallNumber);

        int bigNumber = userNumbers.get(4);
        System.out.println("The largest numerical value is " + bigNumber);
    }

    public static void main(String[] args) throws Exception {
        LoopPart1 numbers = new LoopPart1();
        numbers.getUserNumbers();
    }
}
