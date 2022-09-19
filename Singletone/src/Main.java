public class Main {

    public static void main(String[] args) {

        SimpleCounter simpleCounterA = SimpleCounter.getInstance();
        SimpleCounter simpleCounterB = SimpleCounter.getInstance();
        SimpleCounter simpleCounterC = SimpleCounter.getInstance();

        System.out.println(simpleCounterA  ==  simpleCounterB);

        simpleCounterA.increment();
        simpleCounterB.increment();
        simpleCounterB.increment();
        simpleCounterA.increment();
        simpleCounterC.increment();
        simpleCounterC.increment();
        System.out.println(simpleCounterA.getCurrentCount());
        System.out.println(simpleCounterB.getCurrentCount());
    }

}
