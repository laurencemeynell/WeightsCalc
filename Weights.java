/**
 * A weight object represents a number of weight plates of the same weight
 * The object stores the weight of the plates and the number of plates available
 * 
 * @author Laurence Meynell 
 * @version 20/May/2015
 */
public class Weights
{
   private double weightPlates; //weight of the plates
   private int numberOfPlates; //number of plates

   /**
    * Zero argument constructor for objects of class Weights
    * Sets the weight of the plates to 0.0 and the number of plates to 0
    */
   public Weights()
   {
      this(0.0, 0);
   }
   
   /**
    * Two argument constructor for objects of class Weights
    * @param aWeightPlates the weight of the plates
    * @param aNumberOfPlates the numer of plates available
    */
   public Weights(double aWeightPlates, int aNumberOfPlates)
   {
      this.weightPlates = aWeightPlates;
      this.numberOfPlates = aNumberOfPlates;
   }
   
   /**
    * Returns the weight of the available weight plates
    * @return the weight of the weight plates
    */
   public double getWeightPlates()
   {
      return this.weightPlates;
   }
   
   /**
    * Returns the number of available weight plates
    * @return the number of available weight plates
    */
   public int getNumberOfPlates()
   {
      return this.numberOfPlates;
   }
   
   /**
    * Sets of weight of the available plates to the argument
    * @param the weight of the available plates
    */
   public void setWeightPlates(double aWeightPlates)
   {
      this.weightPlates = aWeightPlates;
   }
   
   /**
    * Sets the number of available plates to the argument
    * @param the number of available plates
    */
   public void setNumberOfPlates(int aNumberOfPlates)
   {
      this.numberOfPlates = aNumberOfPlates;
   }
}
