public class main {
    public static void main(){


        var blueSquare = new BlueShapeDecorator(new Square());
        var boldblueSquare = new BoldShapeDecorator(BlueShapeDecorator(new Square()));
        var redSquare = new BoldShapeDecorator(RedShapeDecorator(new Square()));
    


        var shapes = new Shape[]{blueSquare, boldblueSquare,redSquare };

        shapes[2] = new BoldShapeDecorator(redSquare);


        var context = new Context();
        for(Shape shape : shapes){
            shape.draw(context);
        }
    
    }
    
}


























































  //build
  board.square[i] <- EmptySquare
  board.squares[i] = new HouseDecorator( board.square[i]);

  //landon
  board.squares[i].landedOn(player);