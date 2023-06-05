package animals;

public abstract class Animal {
    private String name;
    private int age;
    private int weight;
    private String color;


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {

        return String.format("Привет! Меня зовут %s, мне %s, я вешу - %d кг, мой цвет - %s",
                getName(), getYearPadej(), getWeight(), getColor()
        );
    }

    private String getYearPadej() {
        int ostatok = getAge() % 10;

        if (getAge() == 0) {
            return "менее года";
        }

        if (ostatok >= 5 || getAge() >= 11 && getAge() <= 14) {
            return getAge() + " лет";
        }
        if (ostatok == 1) {
            return String.format("% год", getAge());
        }
        if (ostatok >= 2) {
            return getAge() + " года";
        }
        return " года";
    }

    public void say() {
        System.out.println("Я говорю");
    }

    public void go() {
        System.out.println("Я иду");
    }

    public void eat() {
        System.out.println("Я ем");
    }

    public void drink() {
        System.out.println("Я пью");
    }
}
