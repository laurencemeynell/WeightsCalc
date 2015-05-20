import java.util.*;
/**
 * WeightsCalc is a prototype to test some concepts for a simple program
 * It works out how many weights you should put on one side of a barbell
 * given a target weight, the weight of your bar and your available weights.
 * 
 * When run WeightsCalc will ask the user from the command line to input
 * the weight of their bar.  The it asks for the number and weights of the 
 * plates owned.  Then it asks for a target weight and performs the calculation.
 * 
 * If the user doesn't have the required plates to meet their target it shall warn them
 * and suggest a configuration that will get them as near as possible to their target.
 * 
 * @author Laurence Meynell 
 * @version 20/May/2015
 */
public class WeightsCalc
{
   // instance variables - replace the example below with your own
   private double barWeight;
   private List<Weights> availableWeights;

   /**
    * Zero argument constructor for objects of class WeightsCalc
    * Initalises bar weight to 0.0 and creates an empty List of available weights
    */
   public WeightsCalc()
   {
      // initialise instance variables
      this(0.0, new ArrayList<Weights>());
      //availableWeights = new TreeMap<>();
   }

   /**
    * Two argument contructor for objects of class WeightsCalc
    * @param aBar the weight of your bar
    * @param anAvailableWeights a List containing all your available weights
    */
   public WeightsCalc(double aBar, List<Weights> anAvailableWeights)
   {
      this.barWeight = aBar;
      this.availableWeights = anAvailableWeights;
   }
   
   /**
    * getBarWeight returns the weight of the bar
    * @return the weight of the bar
    */
   public double getBarWeight()
   {
      return this.barWeight;
   }
   
   /**
    * getAvailableWeights returns a List of all the available weights
    * @return all the available weights as a List
    */
   public List<Weights> getAvailableWeights()
   {
      return this.availableWeights;
   }
   
   /**
    * Sets the weight of the bar to the parameter
    * @param the weight of the bar to be set
    */
   public void setBarWeight(double aBarWeight)
   {
      this.barWeight = aBarWeight;
   }

   /**
    * userInput gets input from the user from the command line
    * It returns this input as a String
    * @return String whatever the user just inputted
    */
   public String userInput()
   {
      Scanner aScanner = new Scanner(System.in);
      String theInput = aScanner.nextLine();
      return theInput;
   }

   /**
    * runCalc asks the user to input their bar weight and available weights
    * Then it will asks the user to input a target weight and display how to
    * load the side of a barbell to achieve this target weight repeatedly
    * until the user enters an empty String for a target weight
    */
   public void runCalc()
   {
      //this.getWeights();
      System.out.println(this.toString());
   }
   
   /**
    * toString returns the weight of the bar followed by the weight and number
    * of each set of plates
    * @return the weight of the bar and number and weight of the plates
    */
   @Override
   public String toString()
   {
      String returnString = null;
      returnString += "Bar: " + this.getBarWeight();
      
      return returnString;
   }

   /**
    * main method runs the WeightsCalc program in the command line
    */
   public static void main(String[] args)
   {
      WeightsCalc weightsCalc = new WeightsCalc();
      weightsCalc.runCalc();
   }

}
