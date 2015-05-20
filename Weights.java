/**
 * A weight object represents a number of weight plates of the same weight
 * The object stores the weight of the plates and the number of plates available
 * 
 * @author Laurence Meynell 
 * @version 20/May/2015
 */
public class Weights implements Comparable<Weights>
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
   
   /**
    * Compares Weights objects.  The Weights object with the larger
    * sized plates is bigger.
    * If both Weights have the same size weight plates then the Weights
    * with the larger number of plates is bigger.
    * If both the size and number of plates is equal then the Weights objects
    * are equal
    * @param the Weights object to be compared with the receiver
    * @return int negative if reciever is smaller, 0 if they are the same,
    * positive if the reciever is bigger
    */
   @Override
   public int compareTo(Weights aWeight)
   {
      if(this.getWeightPlates() != aWeight.getWeightPlates())
      {
         //If here then the Weights have different weight plates
         if(this.getWeightPlates() > aWeight.getWeightPlates())
         {
            //the reciever has bigger plates
            return 1;
         }
         else
         {
            //the reciever has smaller plates
            return -1;
         }
      }
      else
      {
         //plates are the same size so test number of plates
         return this.getNumberOfPlates() - aWeight.getNumberOfPlates();
      }
   }
   
}
