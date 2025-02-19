public class Shape {

    private String color;
    private boolean filled;

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    public Shape(){
        this.color = "green";
        this.filled = true;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        if (filled){
            return "a shape with a color of "+color+" and filled ";
        }
        return "a shape with a color of "+color+" and not filled ";
    }
}
