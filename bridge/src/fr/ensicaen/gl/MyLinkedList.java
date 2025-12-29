package fr.ensicaen.gl;

public class MyLinkedList implements MyImplementation{
    private class Node {
        Object data;
        Node next;
        Node(Object data) { this.data = data; }
    }

    private Node _head;
    private int _size = 0;

    @Override
    public void addElementAt(int index, Object o){
        Node newNode = new Node(o);
        if (index == 0) {
            newNode.next = _head;
            _head = newNode;
        } else {
            Node current = _head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
        _size++;
    }

    @Override
    public Object removeElementAt(int index){
        Object removedData;
        if (index == 0) {
            removedData = _head.data;
            _head = _head.next;
        } else {
            Node current = _head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            removedData = current.next.data;
            current.next = current.next.next;
        }
        _size--;
        return removedData;
    }

    @Override
    public int getSize() { return _size;}
}
