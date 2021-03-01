package com.study.hp.ymxy.list;

public interface List<E> {

    /**
     * 线性表的大小
     *
     * @return
     */
    int getSize();

    /**
     * 判断线性表是否为空
     *
     * @return
     */
    boolean isEmpty();

    /**
     * 判断线性表中是否包含元素o
     *
     * @param o
     * @return
     */
    boolean contains(E o);

    /**
     * 在线性表中查找元素o，若成功找到返回其位置index，否则返回-1
     *
     * @param o
     * @return
     */
    int indexOf(E o);

    /**
     * 获取线性表中位置为index的元素
     *
     * @param index
     * @return
     */
    E get(int index);

    /**
     * 将线性表中位置为index的元素位置设置为e
     *
     * @param index
     * @param e
     */
    void set(int index, E e);

    /**
     * 在线性表中位置为index处添加元素e
     *
     * @param index
     * @param e
     */
    void add(int index, E e);

    /**
     * 剔除并返回线性表中位置为index的元素
     *
     * @param index
     * @return
     */
    E remove(int index);
}
