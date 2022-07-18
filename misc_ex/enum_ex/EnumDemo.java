/*
java Enum example
*/
public class EnumDemo {
    public static void getRandomStateDemo() {
        USStates state = USStates.getRandomState();
        System.out.println(state.toString());
    }

    public static void getStateByNameDemo(String name) {

        try {
            USStates state = USStates.BY_NAME(name);
            System.out.println(state.toString());
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
    }

    public static void main(String args[]) {
        getRandomStateDemo();
        getStateByNameDemo("California");
    }
}
