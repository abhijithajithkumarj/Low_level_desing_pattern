package patterns.objectpool;

public class StockRoomPoolDemo {

    ObjectPool<StockRoom> pool;


    private void setUp(int size){
        pool =new StockRoomPool(size);

    }

    private int getSize(){
        return pool.size();
    }

    private void  printIntId(StockRoom stockRoom){
        System.out.println(stockRoom.getInstanceId());

    }

    private void  printPoolSize(StockRoomPoolDemo demo){
        System.out.println(demo.getSize());
    }

    public static void main(String[] args) {
       StockRoomPoolDemo stockRoomPoolDemo =new StockRoomPoolDemo();
       stockRoomPoolDemo.setUp(5);


       StockRoom firstObject=stockRoomPoolDemo.pool.borrowObject();
        stockRoomPoolDemo.printIntId(firstObject);


        stockRoomPoolDemo.printPoolSize(stockRoomPoolDemo);
    }
}
