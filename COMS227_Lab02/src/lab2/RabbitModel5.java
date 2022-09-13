package lab2;

/**
 * A RabbitModel is used to simulate the growth
 * of a population of rabbits. 
 */
public class RabbitModel5
{
  // TODO - add instance variables as needed
	private int Rabbits;
	private int lastYear;
	private int yearBefore;
  
  /**
   * Constructs a new RabbitModel.
   */
  public RabbitModel5()
  {
    // TODO
	  Rabbits = 1;
	  lastYear = 1;
	  yearBefore = 0;
  }  
 
  /**
   * Returns the current number of rabbits.
   * @return
   *   current rabbit population
   */
  public int getPopulation()
  {
    // TODO - returns a dummy value so code will compile
    return Rabbits;
   
  }
  
  /**
   * Updates the population to simulate the
   * passing of one year.
   */
  public void simulateYear()
  {
    // TODO
	  yearBefore = lastYear;
	  lastYear = Rabbits;
	  Rabbits = yearBefore + lastYear;
  }
  
  
  /**
   * Sets or resets the state of the model to the 
   * initial conditions.
   */
  public void reset()
  {
    // TODO
	  Rabbits = 1; 
	  lastYear = 1;
	  yearBefore = 0;
	  
  }
}
