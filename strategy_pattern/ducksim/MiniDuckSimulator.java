package ducksim;

public class MiniDuckSimulator {
    public static void main(String args[]) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();
        mallard.setFlyBehavior(new FlyNoWay());
        mallard.setQuackBehavior(new Squeak());
        mallard.performFly();
        mallard.performQuack(); 
    }
}
