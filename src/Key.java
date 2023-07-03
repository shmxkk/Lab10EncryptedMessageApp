public class Key {
    //extends object
    private int id;
    private int shift;
    Key(int id, int shift){
        this.id = id;
        this.shift = shift;
    }
    public int getShift() {
        return shift;
    }
    public int getMultiplier() {
        return id;
    }    
}
