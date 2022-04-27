package javaSimple;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Collections {
    public static void main(String[] args) {

        //задание массивов (списки заданной длины), нумерация с нуля
        int [] nums = new int[3];
        nums[0]=1;
        nums[1]=2;
        nums[2]=3;

        // try - обработка ошибок, чтобы если произойдет ошибка внутри try, то программа напишит ошибку, но продолжит выполняться
        try{
        nums[3]=1;}
        //catch тип ошибки
        catch(IndexOutOfBoundsException ex){
            ex.printStackTrace();
            //finally который выполняется всегда, вне зависимости от того перехватилась ошибка или нет
        }finally {
            System.out.println("ooops");
        }
        System.out.println(nums[2]);


        //задание массива строк
        String [] str = {"2","4","8"};
        System.out.println(str[1]);

        //задание коллекции
        ArrayList<String> list = new ArrayList<>();
        list.add("sdfasdasd");
        list.add("aaaaaaaaa");
        list.add("22222222222");

        //Получение значений из коллекции
        list.get(2);

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }


        // реализация forEach, сравнивание с размером
        for(String s:list){
            System.out.println(s.length());
        }

        //тоже самое но через лямбду
        list.forEach(s -> System.out.println("strim"+s));


//фильтрации с помощью стримов и лямбды
        list.stream().filter(s -> s.length()<14).forEach(s -> System.out.println("filtr "+s));

        list.stream().filter(s -> s.contains("a")).forEach(s -> System.out.println("filtr2 "+s));



        ArrayList<String> secondList = (ArrayList<String>) list.stream().filter(s ->s.length()<14).collect(Collectors.toList());
        secondList.forEach(s -> System.out.println("second list item"+ s));


//карты
        HashMap<String,String> map = new HashMap<>();
        map.put("Key1","Value1");
        map.put("Key2","Value1");
        map.put("Key3","Value1");
        map.put("Key4","Value1");
        map.put("Key5","Value1");
        System.out.println(map.get("Key1"));

//Математическое множество set, сюда записыываем все ключи
        Set<String> set;
        set=map.keySet();
        set.forEach(s -> System.out.println("keys "+s));

        for (String s:set){
            System.out.println("Значение ключа"+s+"="+map.get(s));
        }

        for (Map.Entry<String,String> m:map.entrySet()){
            System.out.println("Key"+m.getKey());
            System.out.println("Key"+m.getValue());
        }


        //Домашнее задание
        System.out.println("Домашнее задание");
        //Наполнение коллекции
        list.add("Тест1");
        list.add("Тестовое значение2");
        list.add("Тест3");
        list.add("Тест4");

        //Вывод данных коллекций
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.get(4));
        System.out.println(list.get(5));
        System.out.println(list.get(6));


        //Фильтрация
        list.stream().filter(s -> s.length()>10).forEach(s -> System.out.println("Фильтрация по длине: "+s));

        list.stream().filter(s -> s.contains("Тест")).forEach(s -> System.out.println("Фильтрация по содержимому: "+s));



    }
}
