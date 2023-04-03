//Реализуйте очередь с помощью LinkedList со следующими методами:
//enqueue() - помещает элемент в конец очереди, 
//dequeue() - возвращает первый элемент из очереди и удаляет его, 
//first() - возвращает первый элемент из очереди, не удаляя.

import java.util.LinkedList;

public class task_2_hw_3 {
    public static void main(String[] args) {
        LinkedList<String> list_of_objects = new LinkedList<String>();
        String text = "";
        while(!text.contains("!stop"))
        {
            text = input_class.Str("Введите текст: ");
            if (!text.contains("!stop")) {list_of_objects.add(text);};
        }
        System.out.println(list_of_objects);
        first(list_of_objects);
        System.out.println(list_of_objects);
        enqueue(list_of_objects);
        System.out.println(list_of_objects);
        dequeue(list_of_objects);
        System.out.println(list_of_objects);


    }
    
    public static void first (LinkedList<String> list_of_objects)
    {
        System.out.println(list_of_objects.getFirst());
    }

    public static void dequeue (LinkedList<String> list_of_objects)
    {
        System.out.println(list_of_objects.removeFirst());
    }

    public static void enqueue (LinkedList<String> list_of_objects)
    {
        int i = input_class.Int("Введите индекс от 0 до "+ list_of_objects.size() + ": ");
        String swap = list_of_objects.remove(i);
        list_of_objects.addLast(swap);

    }

}
