public class Rectangle implements Shape {
   private double cost;

   public Rectangle() {
      this.cost = 10.0; // Base cost for Rectangle
   }

   @Override
   public void draw() {
      System.out.println("Shape: Rectangle");
   }

   @Override
   public double computeCost() {
      return cost;
   }
}