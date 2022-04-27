package ext;

//implements  наследование от интерфейса должна быть обязательная реализация
// extends пасширение класса методами из другого класса
public class Dog extends Animals implements AnimalColor{
    //конструктор
    //super это для выбора переменной из супер класса
    public Dog(String name) {
        super(name);
    }

    public void say (){
        System.out.println("Гав");
    }


    //переопределение метода интерфейса
    @Override
    public void getColor() {
        System.out.println("Red");
    }
}
