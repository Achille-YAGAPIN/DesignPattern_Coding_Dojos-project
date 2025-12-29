package fr.ensicaen.gl;

public class MyFifo extends MyList{
    
    public MyFifo(MyImplementation impl) {this._impl = impl;}

    @Override
    public void push(Object o) {_impl.addElementAt(_impl.getSize(), o);}

    @Override
    public Object pop() {
        if (isEmpty()) return null;
        return _impl.removeElementAt(0);
    }

    @Override
    public boolean isEmpty(){return _impl.getSize() == 0;}
}
