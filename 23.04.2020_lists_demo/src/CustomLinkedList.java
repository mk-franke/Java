public class CustomLinkedList<E> implements CustomList<E> {

    private Node<E> first;
    private Node<E> last;
    private int size;

    @Override
    public int size() {
        return size;
    }

    @Override
    public void append(E o) {
        if (size > 0) {
            Node newNode = new Node(o, null, last);
            last.next = newNode;
            last = newNode;
        } else {
            Node newNode = new Node(o, null, null);
            first = newNode;
            last = newNode;
        }
        size++;
    }

    @Override
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node ret = getNode(index);
        return (E)ret.value;
    }

    private Node getNode(int index) {
        Node ret = first;
        for (int i = 0; i < index; i++) {
            ret = ret.next;
        }
        return ret;
    }

    @Override
    public E removeById(int index) {
        return null;
    }

    @Override
    public boolean remove(E e) {
        return false;
    }

    private static class Node<E> {
        E value;
        Node next;
        Node prev;

        public Node(E value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }

}
