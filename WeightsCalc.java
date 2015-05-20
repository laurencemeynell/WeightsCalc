import java.util.*;
/**
 * Write a description of class WeightsCalc here.
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
