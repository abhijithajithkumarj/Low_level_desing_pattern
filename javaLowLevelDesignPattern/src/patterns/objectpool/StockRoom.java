package patterns.objectpool;

public class StockRoom {

    private int shockNumber;
    private int instanceId=this.hashCode();

    public StockRoom(int shockNumber){
        this.shockNumber=shockNumber;

    }




    public int getShockNumber() {
        return shockNumber;
    }

    public int getInstanceId() {
        return instanceId;
    }
}
