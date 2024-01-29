package patterns.objectpool;

import java.util.concurrent.ConcurrentLinkedQueue;

public abstract class ObjectPool<t> {

    private ConcurrentLinkedQueue<t> pool;

    ObjectPool(int size){
        pool= new ConcurrentLinkedQueue<t>();
    }


    public  abstract t create();


    private void initialize(int size){
       for(int i=0; i<size; i++){
           pool.add(create());
       }
    }

    public t borrowObject(){
        t object=pool.poll();
        if (object==null){
            object=create();
        }
        return object;
    }


    public void returnObject(t object){
        if (object==null){
            return;
        }
        pool.offer(object);

    }

    public int size(){
        return pool.size();
    }

}
