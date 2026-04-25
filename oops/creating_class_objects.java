public class creating_class_objects {
    public static void main(String[] args) {
        Pen p1=new Pen();
        p1.setColor("Red");
        p1.setTip(4);
        System.out.println(p1.color);

    }
}
class Pen{
    String color;
    int tip;

    void setColor(String newColor){
        color=newColor;
    }

    void setTip(int newTip){
        tip=newTip;
    }
}
/*
✅ 1. Start with the definition
"In Java, a class is a blueprint or template for creating objects. 
It defines variables (data) and methods (behavior) that the objects created from it will have.
 An object is an instance of a class — it's a real-world entity created using the class."

✅ 2. Give a real-life analogy
"Think of a class as a blueprint for a car. 
It describes what a car should have – like wheels, engine, and color – but it's not a real car. 
An object is the actual car built from that blueprint. You can create many car objects from the same blueprint."
 */