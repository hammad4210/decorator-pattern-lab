public class Circle implements Shape {
   private double cost;

   public Circle() {
      this.cost = 15.0; // Base cost for Circle
   }

   @Override
   public void draw() {
      System.out.println("Shape: Circle");
   }

   @Override
   public double computeCost() {
      return cost;
   }
}