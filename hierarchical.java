package oop;

public class hierarchical {
    public static void main(String[] args) {

        mango m = new mango();
        m.name = "Alphonso";
        m.cost = 300;
//        System.out.println(m.mango());

        maaza m1 = new maaza();
        m1.name = m.getName();
        m1.cost = m.getCost();
        System.out.println("Class maaza called");
        System.out.println(m1.mango());
        System.out.println();

        slice s = new slice();
        s.name = m.getName();
        s.cost = m.getCost();
        System.out.println("Class slice called");
        System.out.println(s.mango());
    } // end of main ()
} // end of hierarchical class

class mango{

    String name;
    int cost;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public boolean mango(){
        System.out.println("I am Used in Making Mango Juice");
        System.out.println("I am the Queen of all Fruits!");
        return true;
    } // end of mango ()

} // end of class mango

class maaza extends mango{

    public boolean mango(){
        System.out.println(name + " is only used in making mango juices");
        System.out.println("Cost is " + cost);
        return true;
    }

} // end of class maaza

class slice extends mango{

    public boolean mango(){
        System.out.println(name + " is only used in making mango juices");
        System.out.println("Cost is " + cost);
        return true;
    }
}

