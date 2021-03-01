package com.study.hp.ymxy.list;

public class LinkedList<E> implements List<E> {

    private class Node {
        private E data;
        private Node next;

        public Node(E data, Node next) {
            this.data = data;
            this.next = next;
        }

        public Node(E data) {
            this(data, null);
        }
    }

    private Node head;

    private int size;

    public LinkedList() {
        head = null;
        size = 0;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(E o) {
        Node p = head;
        while (p != null) {
            if (p.data.equals(o)) {
                return true;
            }
            p = p.next;
        }
        return false;
    }

    @Override
    public int indexOf(E o) {
        int index = 0;
        Node p = head;
        while (p != null) {
            if (p.data.equals(o)) {
                return index;
            }
            index++;
            p = p.next;
        }
        return -1;
    }

    @Override
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("数组下标越界...");
        }
        Node p = head;
        for (int i = 0; i < index; i++) {
            p = p.next;
        }
        return p.data;
    }

    @Override
    public void set(int index, E e) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("数组下标越界...");
        }
        Node p = head;
        for (int i = 0; i < index; i++) {
            p = p.next;
        }
        p.data = e;

    }

    @Override
    public void add(int index, E e) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("数组下标越界...");
        }
        if (index == 0) {
            addFirst(e);
        } else if (index == size) {
            addLast(e);
        } else {
            Node p = head;
            for (int i = 0; i < index; i++) {
                p = p.next;
            }
            Node newNode = new Node(e, p.next);
            p.next = newNode;
            size++;
        }
    }

    //开头插入
    private void addFirst(E e) {
        Node node = new Node(e, head);
        head = node;
        size++;
    }

    //结尾插入
    private void addLast(E e) {
        Node node = new Node(e, null);

        if (head == null) {
            head = node;
        } else {
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = node;
        }
        size++;
    }


    @Override
    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("数组下标越界...");
        }
        if (index == 0) {
            return removeFirst();
        } else if (index == size) {
            return removeLast();
        } else {
            Node p = head;
            for (int i = 0; i < index - 1; i++) {
                p = p.next;
            }
            Node result = p.next;
            p.next = p.next.next;
            p = null;
            size--;
            return result.data;
        }
    }

    //删除头
    private E removeFirst() {
        if (head == null)
            return null;
        Node node = head;
        head = head.next;
        size--;
        return node.data;
    }

    //删除结尾
    private E removeLast() {
        if (head == null)//空
            return null;

        Node last = null;

        if (head.next == null) {//只有一个节点
            last = head;
            head = null;
        } else {
            Node p = head;
            while (p.next.next != null) {
                p = p.next;
            }
            last = p.next;
            p.next = null;
        }
        return last.data;
    }
}
