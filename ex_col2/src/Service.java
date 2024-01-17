import java.util.List;

public interface Service<T,ID> {
        T findEntityByld(ID i) throws NotFoundEntityException;
        List<String> getEntitiesNameStartWithSubstring(String s);
        void addEntity(T t);

}
