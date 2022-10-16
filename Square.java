public class Square extends Shape implements Colorable{

    private double side = 0;
    public Square(double side){
        this.side = side;
    }
    public Square (double side,String color,boolean filled){
        setShape(color,filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square" +
                "side=" + side +
                super.toString()
                ;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides.");

    }
}
