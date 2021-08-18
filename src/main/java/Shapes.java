public class Shapes {
    int length;
    int breadth;
    int area()
    {
        return length*breadth;
    }

}
class Rectangle extends Shapes
{

    Rectangle(int length,int breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }

}
