public class SafeFrame implements Context {
    private State _state = DayState.getInstance();

    public String _title;
    public SafeFrame(String title){
        _title = title;
    }

    @Override
    public void setClock(int hour) {
        // TODO Auto-generated method stub
        _state.doClock(this, hour);
    }
    @Override
    public void changeState(State state) {
        // TODO Auto-generated method stub
        System.out.println(_state + " から " + state + " へ状態が変更しました");
        _state = state;
    }
    @Override
    public void callSecurityCenter(String msg) {
        // TODO Auto-generated method stub
        System.out.println("Call! " + msg);
    }
    @Override
    public void recordLog(String msg) {
        // TODO Auto-generated method stub
        System.out.println("Record " + msg);
    };
}