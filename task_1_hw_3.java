//Пусть дан LinkedList с несколькими элементами. 
//Реализуйте метод(не void), который вернет “перевернутый” список.

import java.util.LinkedList;

public class task_1_hw_3 {

    public static void main(String[] args) {
        LinkedList<String> list_of_objects = new LinkedList<String>();
        String text = "";
        while(!text.contains("!stop"))
        {
            text = input_class.Str("Введите текст: ");
            list_of_objects.add(text);
        }
        System.out.println(list_of_objects);
        LinkedList<String>  new_array = reverse(list_of_objects);
        System.out.println(new_array);
    }
    public static LinkedList<String> reverse (LinkedList<String> list_of_objects)
    {
        LinkedList<String> new_array = new LinkedList<String>();
        for(int i = list_of_objects.size()-1; i >= 0; i--) 
        {
            new_array.add(list_of_objects.removeLast());
        }
        return new_array;
    }
}