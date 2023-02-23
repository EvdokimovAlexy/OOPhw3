package org.example;//Создать список по аналогии LinkedList (список связанных элементов), реализовать в нем iterable интерфейс.
//Список должен содержать элементы со ссылкой на следующий элемент

public class Main {
    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.addFirst("Февраля");
        linkedList.addFirst("23");
        linkedList.addFirst("Праздником");
        linkedList.addFirst("С");
        for (String item: linkedList) {
            System.out.println(item);
        }
    }
}