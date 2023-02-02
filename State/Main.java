public class Main {
    public static void main(String[] args){
        SafeFrame frame = new SafeFrame("Sample");
        frame.changeState(NightState.getInstance());
    }
}