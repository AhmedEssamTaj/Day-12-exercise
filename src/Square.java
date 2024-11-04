public class Square extends Rectangle {

    public Square(){
        super(1,1);
    }
    public Square (double side){

        super(side, side);

    }

    public Square (double side, String color, boolean filled){

    }

    public double getSide (){
    return super.getLength();
    }
    public void setSide (double side){
        super.setLength(side);
    }

    @Override
    public String toString() {
        return "A square with side of = " + getSide() + " which is a subclass of " + super.toString() ;
    }
}
