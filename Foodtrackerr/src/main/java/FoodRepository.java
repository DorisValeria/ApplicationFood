import java.util.List;

public interface FoodRepository {
    List<Food> findAll();
    Food findById(int id);
    void save(Food aliment);
    void delete(int id);

     default void deleteById(String id) {

    }
}
