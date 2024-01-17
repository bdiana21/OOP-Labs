import java.util.ArrayList;
import java.util.List;

public class Room implements Sellable{

    private int floor;
    private List<Person> people=new ArrayList<>();
    private int capacity;
    private int number;
    private double price;

    public Room() {
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public List<Person> getPeople() {
        return people;
    }

    public void setPeople(List<Person> people) {
        this.people = people;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int getTotalNumberOfPerson() {

        return people.size();
    }

    @Override
    public double getTotalPriceValue() {
        return price;
    }
    private void addPerson(Person person){
            people.add(person);
    }
    private List<String> getPeopleNames(){
        List<String> numePeople=new ArrayList<>();
        for(Person p: people){
            numePeople.add(p.getName());
        }
        return numePeople;
    }
    private void remove(List<Person> listaP){
        people.removeAll(listaP);
    }
}
