public class Main {
    public static void main(String[] args) {
        Triangle rightTriangle = new Triangle();
        rightTriangle.a = 2.5;
        rightTriangle.b = 2.5;
        rightTriangle.c =5.5 ;
        System.out.println(rightTriangle.a);
        System.out.println(rightTriangle.b);
        System.out.println(rightTriangle.c);
        rightTriangle.area();
    }
}