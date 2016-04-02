
public class Main{

    public static void main(String[] args)  {

//2.13.4
        try {
            System.out.println(Shape.parseShape("Circle:Blue:3"));
            System.out.println(Shape.parseShape("Rectangle:Red:10,11"));
            System.out.println(Shape.parseShape("Triangle:pink:1,2,3"));
            System.out.println(Shape.parseShape("OMG"));
        }catch (InvalidShapeStringException e){
            System.out.println("incorrect data input. Example: Rectangle:Red:10,11");
        }

    }
}