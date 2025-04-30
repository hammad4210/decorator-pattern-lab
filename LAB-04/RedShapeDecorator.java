public class RedShapeDecorator extends ShapeDecorator {
   private double decorationCost;

   public RedShapeDecorator(Shape decoratedShape) {
      super(decoratedShape);
      this.decorationCost = 5.0; // Cost for red decoration
   }

   @Override
   public void draw() {
      decoratedShape.draw();
      setRedBorder(decoratedShape);
      System.out.println("Total Cost: " + computeCost());
   }

   private void setRedBorder(Shape decoratedShape) {
      System.out.println("Border Color: Red");
   }

   @Override
   public double computeCost() {
      return decoratedShape.computeCost() + decorationCost; // Add decoration cost
   }
}
