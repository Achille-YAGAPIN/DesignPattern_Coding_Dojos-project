package fr.ensicaen.gl;

public class MyArrayList implements MyImplementation{
    private Object[] _data = new Object[100]; 
    private int _size = 0;

    @Override
    public void addElementAt(int index, Object o){
        for (int i = _size; i > index; i--) {
            _data[i] = _data[i - 1];
        }
        _data[index] = o;
        _size++;
    }

    @Override
    public Object removeElementAt(int index){
        Object removed = _data[index];
        for (int i = index; i < _size - 1; i++) {
            _data[i] = _data[i + 1];
        }
        _size--;
        return removed;
    }

    @Override
    public int getSize() { return _size;}
}
