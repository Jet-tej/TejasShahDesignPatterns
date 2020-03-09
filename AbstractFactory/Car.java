public abstract class Car {
  
  private CarType model = null;
  private Location location = null;
 
  public Car(CarType model, Location location){
    this.model = model;
    this.location = location;
  }
 
  protected abstract void construct();
 
  //getters and setters
 
  @Override
  public String toString() {
    return "Model- "+model + " built in "+location;
  }
}