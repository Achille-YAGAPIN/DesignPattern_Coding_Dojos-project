package fr.ensicaen.gl;

public abstract class MyList{
    protected MyImplementation _impl;
    public abstract void push(Object o);
    public abstract Object pop();
    public  abstract boolean isEmpty();
}
