package Stacks_and_Queues.Animal_Shelter;

public class Animal {
    protected String name;
    private Integer number;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public boolean isOlderThan(Animal a) {
        return a.getNumber() > this.number;
    }
}
