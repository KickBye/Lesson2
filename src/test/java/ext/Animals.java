package ext;

public class Animals{
    private String name;

    //Конструктор, повторяет тоже самое что и сетнейм
    public Animals(String name){
        this.name=name;
    }

//обычный метод
    public void eat(){
        System.out.println("omnomnomno");
    }

//метод возвращающий имя
    public String getName() {
        return name;
    }

//метод передающий имя
    public void setName(String name) {
        this.name = name;
    }

    }

