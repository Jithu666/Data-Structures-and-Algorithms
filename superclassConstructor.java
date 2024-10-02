package oop.SuperClassConstructor;

public class superclassConstructor {
    public static void main(String[] args) {

        int area  = 6;
        area a = new area(area);
//        shape s = new shape(area);

    } // end of main ()
} // end of Executable logic code


// subclass
class shape {
    protected int x;
    public shape(int x){
        this.x = x;
        System.out.println("Value of x is " + x);
    }
}

class area extends shape{
    public area(int x) {
        super(x);
    }
}