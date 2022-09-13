package lab2;

/**
 * A RabbitModel is used to simulate the growth
 * of a population of rabbits. 
 */
public class RabbitModel2
{
  
	//
	private int Rabbits;
  
  /**
   * Constructs a new RabbitModel.
   */
  public RabbitModel2()
  {
    
	  Rabbits = 0;
  }  
 
  /**
   * Returns the current number of rabbits.
   * @return
   *   current rabbit population
   */
  public int getPopulation()
  {
    
    return Rabbits %= 5;
  }
  
  /**
   * Updates the population to simulate the
   * passing of one year.
   */
  public void simulateYear()
  {
	  Rabbits += 1;
	 // years += 1;
  }
  
  /**
   * Sets or resets the state of the model to the 
   * initial conditions.
   */
  public void reset(){
	  Rabbits = 0;
  }
}
