import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TransportLine {
    private Bus bus;
    private double price;
   private List<Person>people=new ArrayList<>();
    private int id;
    static int contorId=-2;

    public TransportLine(Bus bus, double price) {
        this.bus = bus;
        this.price = price;
        contorId=contorId+3;
        id=contorId;
    }

    public Bus getBus() {
        return bus;
    }

    public double getPrice() {
        return price;
    }

    public List<Person> getPeople() {
        return people;
    }

    public int getId() {
        return id;
    }

    public void addPersonToTransportLine(Person p) throws NoSpaceRemaingException {
        if(people.size()<bus.getCapacity() &&p.getSalary()>=price){
            people.add(p);
            p.setSalary(p.getSalary()-price);
        }
        else{
            throw new NoSpaceRemaingException("nu exista spatiu");
        }
    }

    public List<String> getOrderNameOfPersonsList(){
        people.sort(Comparator.comparing(Person::getName));
        List<String> numePeople=new ArrayList<>();
        for( Person p:people){
            numePeople.add(p.getName());
        }
        return numePeople;
    }
}
