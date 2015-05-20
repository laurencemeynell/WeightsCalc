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
      this(0.0, new List<Weights>());
      //availableWeights = new TreeMap<>();
   }
   
   /**
    * Two argument contructor for objects of class WeightsCalc
    * @param aBar the weight of your bar
    * @param anAvailableWeights a List containing all your available weights
    */
   public WeightsCalc(double aBar, MultiSet<Weights> anAvailableWeights)
   {
      this.barWeight = aBar;
      this.availableWeights = anAvailableWeights;
   }
   
   


}
