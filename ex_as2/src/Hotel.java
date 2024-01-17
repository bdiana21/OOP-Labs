import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Hotel implements Sellable{
    private int numberOfFloors;
    private List<Person> employers=new ArrayList<>();
    private List<Room> rooms=new ArrayList<>();
    private String name;

    public Hotel() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private Map<Person,List<Room>> getListOfRoomsForPerson(){
        Map<Person,List<Room>> mapPerson=new HashMap<>();
        for (Room r:rooms){
            for (Person p:r.getPeople()){
                if(!mapPerson.containsKey(p)){
                    mapPerson.put(p,new ArrayList<>());
                }
                mapPerson.get(p).add(r);
            }
        }
        return mapPerson;
    }
    private void addRoom(Room room){
            rooms.add(room);
    }
    private void accomodatePerson(Person person, Room room) throws NotEnoughMoneyAccommodation {
        if(room.getTotalNumberOfPerson()<room.getCapacity()){
            if(person.getSalary()>=room.getPrice()){
                room.getPeople().add(person);
            }
            else{
                throw new NotEnoughMoneyAccommodation("nu avem bani");
            }
        }
    }

    @Override
    public int getTotalNumberOfPerson() {
        int nrPers=0;
        for(Room r:rooms){
            nrPers=nrPers+r.getTotalNumberOfPerson();
        }
        return nrPers;
    }

    @Override
    public double getTotalPriceValue() {
        double pretCamere=0;
        for(Room r:rooms){
            pretCamere=pretCamere+r.getTotalPriceValue();
        }
        return pretCamere;
    }
}
