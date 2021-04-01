package com.study.hp.ymxy.list;

public class Test001 {
    public static void main(String[] args) {
//        List<Integer> arraylist = new ArrayList<Integer>();
        List<Integer> list = new LinkedList<Integer>();
        for (int i = 0; i < 50; i++) {
            list.add(i, i);
        }
        for (int i = 0; i < list.getSize(); i += 5)
            list.remove(i);
        for (int i = 0; i < list.getSize(); i++) {
            System.out.println("The " + i + "th element is " + list.get(i));
        }
    }
}
