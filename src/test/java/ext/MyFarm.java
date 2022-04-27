package ext;

public class MyFarm {
    public static void main(String[] args) {
        //создание экземпляра
        Cat oli=new Cat ("oli");
        Cat oli2=new Cat ("Marfa");
        Dog dog1=new Dog("Alex");
        Dog dog2=new Dog("Dus9i");


        //вызов метода
        oli.say();
        oli2.eat();
        dog1.say();
        dog2.eat();
        //выведем имя
        System.out.println(oli.getName());

        //изменим имя
        oli.setName("Kuz'ma");
        //выведем новое имя
        System.out.println(oli.getName());
        //вызвали метод
        dog1.getColor();


    }
}
