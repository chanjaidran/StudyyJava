package SolidPrinciples.LiskovSubsPrinciple;

public class LsvWithoutViolation {




        public static void main(String[] args) {
            flyingBird sparrow = new Sparrow();
            makeBirdFly(sparrow);  // ✅ Works

            Bird penguin = new Penguin();
            penguin.eat();         // ✅ Works

            // makeBirdFly(penguin); ❌ Compile-time error — and that’s GOOD!
        }


    public static void makeBirdFly(flyingBird bird) {
        bird.fly();
    }

}

interface Bird
{
    void eat();
}

interface flyingBird extends Bird
{
    void fly();
}

class Sparrow implements flyingBird {
    public void eat() {
        System.out.println("Sparrow eats seeds.");
    }

    public void fly() {
        System.out.println("Sparrow is flying.");
    }
}

class Penguin implements Bird {
    public void eat() {
        System.out.println("Penguin eats fish.");
    }
}