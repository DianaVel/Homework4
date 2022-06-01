package tbc.java.homework4;

public class Main {
    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle();
        System.out.println("Rectangle 1- width: "+rec1.getWidth()+"; Length: "+rec1.getLength());

        Rectangle rec2 = new Rectangle(25);
        System.out.println("Rectangle 2- width: "+rec2.getWidth()+"; Length: "+rec2.getLength());

        Rectangle rec3 = new Rectangle(15,19);
        System.out.println("Rectangle 3- width: "+rec3.getWidth()+"; Length: "+rec3.getLength());

        Rectangle [] recArray= {rec1,rec2,rec3};
        Rectangle maxRect =  Rectangle.getMaxAreaObject(recArray);
        System.out.println("Max Rectangle width: "+maxRect.getWidth()+"; Length: "+maxRect.getLength());
    }
}