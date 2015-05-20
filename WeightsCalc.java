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
    * Sets the available weights to the parameter
    * @param List<Weights> a list of the available weights
    */
   public void setAvailableWeights(List<Weights> anAvailableWeights)
   {
      this.availableWeights = anAvailableWeights;
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
    * Asks the user to input the weight of their bar and the weight
    * and number of any weight plates they have avilable.  Will keep
    * asking for new weights until the user presses enter.  Does
    * not do any error checking so input that can't be parsed will
    * cause the program to crash
    */
   public void inputWeights()
   {
      //create a String for all user input
      String input;
      //create Strings requesting user input
      String requestPlatesString = "Please enter the weight of a plate set or press enter to quit >";
      String requestNumberString = "Please enter the number of these plates >";
      
      //Ask user for initial input
      System.out.println("Please enter the weight of your bar >");
      
      //get the input and set the bar weight
      input = this.userInput();      
      this.setBarWeight(Double.parseDouble(input));  
    
      //Ask the user to enter the weight of the first set of plates
      System.out.println(requestPlatesString);
      input = this.userInput();
      while(!(input.equals("")))
      {
         //Make a new Weights object
         Weights aWeight = new Weights();
         //Set the weight of the plates to user input
         aWeight.setWeightPlates(Double.parseDouble(input));
         
         //Ask the user to enter the number of plates in this set
         System.out.println(requestNumberString);
         input = this.userInput();
         
         //Set the number of plates to user input
         aWeight.setNumberOfPlates(Integer.parseInt(input));
         
         //Add the newly created weights to WeightCalc's list of Weights
         this.getAvailableWeights().add(aWeight);
         
         //Ask the user for a new weight set
         System.out.println(requestPlatesString);
         input = this.userInput();
      }      
   }

   /**
    * runCalc asks the user to input their bar weight and available weights
    * Then it will asks the user to input a target weight and display how to
    * load the side of a barbell to achieve this target weight repeatedly
    * until the user enters an empty String for a target weight
    */
   public void runCalc()
   {
      this.inputWeights();
      System.out.println(this.toString());
   }
   
   /**
    * toString returns the weight of the bar followed by the weight and number
    * of each set of plates in descending order
    * @return the weight of the bar and number and weight of the plates
    */
   @Override
   public String toString()
   {
      String returnString = "";
      
      returnString += "Bar: " + this.getBarWeight() + "\n";
      returnString += "Weight : Numbers of plates\n";
      
      //copy the Weights list then sort it in descending order
      List<Weights> aWeightsList = this.getAvailableWeights();
      Collections.sort(aWeightsList);
      Collections.reverse(aWeightsList);
      
      for(Weights aWeight : aWeightsList)
      {
         returnString += aWeight.getWeightPlates() + " : " +
            aWeight.getNumberOfPlates() + "\n";
      }
      
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
