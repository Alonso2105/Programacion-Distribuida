package tareaUno;

public class SomethingIsWrong {
    public static void main(String[] args) {
        //No esta referenciado, myRect = new Rectangle();
        Rectangle myRect = new Rectangle();
        myRect.width = 40;
        myRect.height = 50;
        System.out.println("myRect's area is " + myRect.area());
    }
}
