package ext;
// extends пасширение класса методами из другого класса
//implements  наследование от интерфейса должна быть обязательная реализация
public class Cat extends Animals implements AnimalColor{

    //конструктор
    //super это для выбора переменной из супер класса
    public Cat(String name) {
        super(name);
    }

    public void say(){
        System.out.println("Мяу");
    }


    //переопределение метода интерфейса
    @Override
    public void getColor() {
        System.out.println("Blue");
    }
}
