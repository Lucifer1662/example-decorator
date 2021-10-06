

class Context{
    //some gui functionality
    public void setColour(String colour){}
    public void setBold(boolean bold){}
    public void path(String[] path){}
    public void fill(){}
}

//geneic interface
interface Shape{
    void draw(Context context);
}


//Component
class Square implements Shape{
    void draw(Context context){
        context.path(new String[]{"0,0","1,0","0,1","1,1"});
        context.fill();
    }
}

//Abstract decorator
abstract class ShapeDecorator implements Shape{
    Shape shape;

    public ShapeDecorator(Shape shape){
        this.shape = shape;
    }

    void draw(Context context){
        this.shape.draw(context);
    }
}


class RedShapeDecorator extends ShapeDecorator{

    public RedShapeDecorator(Shape shape){
        super(shape);
    }

    void draw(Context context){
        super.draw(context);
        context.setColour("Red");
    }
}

class BlueShapeDecorator extends ShapeDecorator{

    public BlueShapeDecorator(Shape shape){
        super(shape);
    }

    void draw(Context context){
        super.draw(context);
        context.setColour("Blue");
    }
}

class BoldShapeDecorator extends ShapeDecorator{
    public BoldShapeDecorator(Shape shape){
        super(shape);
    }

    void draw(Context context){
        super.draw(context);
        context.setBold(true);
    }
}






