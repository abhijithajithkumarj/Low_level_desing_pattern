package patterns.objectpool;

public class StockRoomPool extends ObjectPool<StockRoom>{


    private int stockNumber;
    public StockRoomPool(int size){
        super(size);
    }
    @Override
    public StockRoom create() {

        return new StockRoom(stockNumber);
    }
}
