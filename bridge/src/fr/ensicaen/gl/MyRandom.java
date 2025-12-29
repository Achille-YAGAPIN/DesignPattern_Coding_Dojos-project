package fr.ensicaen.gl;

import java.util.Random;

public class MyRandom extends MyList{
    private Random _rand = new Random();
    public MyRandom(MyImplementation impl) {this._impl = impl;}

    @Override
    public void push(Object o) {_impl.addElementAt(_impl.getSize(), o);}

    @Override
    public Object pop() {
        if (isEmpty()) return null;
        return _impl.removeElementAt(_rand.nextInt(_impl.getSize()));
    }

    @Override
    public boolean isEmpty(){return _impl.getSize() == 0;}
}
