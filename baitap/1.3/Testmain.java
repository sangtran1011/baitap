public class Testmain {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(1.2f, 3.4f);
        System.out.println(r1);
        Rectangle r2 = new Rectangle();
        System.out.println(r2);
        r1.setLength(5.6f);
        r1.setWidth(7.8f);
        System.out.println(r1);
        System.out.println("Length is: " + r1.getLength());
        System.out.println("Width is: " + r1.getWidth());
        System.out.println("area is: " + r1.getArea());
        System.out.println("Perimeter is: " + r1.getPerimeter());
    }
}
