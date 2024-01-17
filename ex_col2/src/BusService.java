import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BusService implements Service<Bus,Integer> {
    Map<Integer,Bus> buses=new HashMap<>();

    public BusService() {
    }

    @Override
    public Bus findEntityByld(Integer i) throws NotFoundEntityException {
        Bus aux=buses.get(i);
        if(aux!=null){
            return aux;
        }
        else throw new NotFoundEntityException("nu s a gasit entitatea");

    }

    @Override
    public List<String> getEntitiesNameStartWithSubstring(String s){
        List<String> numeBus=new ArrayList<>();
       /* for(int i=1;i< buses.size();i=i+3){
            if(buses.get(i).getName().startsWith(s)){
                numeBus.add(buses.get(i).getName());
            }
        }*/
        for(Bus b: buses.values()){
            if(b.getName().startsWith(s)){
                numeBus.add(b.getName());
            }
        }
        return numeBus;
    }

    @Override
    public void addEntity(Bus b) {
        buses.put(b.getId(),b);
    }



}
