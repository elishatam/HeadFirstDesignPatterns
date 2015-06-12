public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
        mallard.display();

        Duck model = new ModelDuck();
        model.performFly(); //Uses the flyBehavior object set in the ModelDuck's construction (FlyNoWay)
        model.setFlyBehavior(new FlyRocketPowered()); //Invokes the model's inherited behavior setter method
        model.performFly(); //Model duck dynamically changed its flying behavior. Can't do this if the implementation lives inside the Duck class.
    }
}