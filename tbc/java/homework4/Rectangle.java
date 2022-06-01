package tbc.java.homework4;

public class Rectangle {
    private double length;
    private double width;

    private double defaultWidth=0;
    private double defaultLength=0;


    private static final double MAX_LENGTH ;
    private static final double MAX_WIDTH ;


    static {
        MAX_LENGTH =20;
        MAX_WIDTH =10;
    }


    public Rectangle(double length) {
        this.setLength(length);
        this.setWidth(defaultWidth);
    }

    public Rectangle(double width, double length) {
        this.setLength(length);
        this.setWidth(width);
    }

    public Rectangle () {
        this.setLength(defaultLength);
        this.setWidth(defaultWidth);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if(length>MAX_LENGTH) {
            this.length = MAX_LENGTH;
        }else {
            this.length=length;
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width>MAX_WIDTH) {
            this.width=MAX_WIDTH;
        }else {
            this.width = width;
        }
    }

    public double getArea() {
        return length*width;
    }

    public double getPerimeter() {
        return 2*(length+width);
    }

    public int compareArea(Rectangle rec) {
        if(this.getArea()>rec.getArea()) {
            return 1;
        }else if (this.getArea()<rec.getArea()){
            return -1;
        }else {
            return 0;
        }
    }

    public static Rectangle getMaxAreaObject(Rectangle [] recArray) {
        Rectangle maxAreaRect = recArray [0];
        Rectangle currRect;

        for(int i=0; i<recArray.length; i++) {
            if(recArray[i].getArea()> maxAreaRect.getArea()){
                maxAreaRect=recArray[i];
            }
        }
        return maxAreaRect;

    }
}
