

public class Triangle {
    private double side1;
    private double side2;
    private double side3;

    public double getSide1(){
        return side1;
    }

    public double getSide2(){
        return side2;
    }

    public double getSide3(){
        return side3;
    }

    public void setSide1(double length){
        side1 = length;
    }

    public void setSide2(double length){
        side2 = length;
    }

    public void setSide3(double length){
        side3 = length;
    }

    public boolean isRightTriangle(){
        if (((side1 * side1) + (side2 * side2)) == (side3 * side3)){
            return true;
        }
        else if (((side1 * side1) + (side3 * side3)) == (side2 * side2)){
            return true;
        }
        else if(((side2 * side2) + (side3 * side3)) == (side1 * side1)){
            return true;
        }
        else{
            return false;
        }
    }

}
