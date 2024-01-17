import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TransportCompany {
    private  List<TransportLine> transportLines=new ArrayList<>();
    private String name;

    public TransportCompany(String name) {
        this.name = name;
    }

    public List<TransportLine> getTransportLines() {
        return transportLines;
    }

    public String getName() {
        return name;
    }
    public Map<Person,List<TransportLine>> getPersonsListOfTransportLines(){
        return null;
    }

    public Map<Integer,Double> mapTransportLineIdToTotalPricePayedByPeopleWithAgeHigherThan(int i){
        return null;
    }
}
