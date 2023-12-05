import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class FoodRepositoryImpl implements FoodRepository {
    private List<Food> foods = new ArrayList<>();

    @Override
    public List<Food> findAll() {
        return new ArrayList<>(foods);
    }

    @Override
    public Food findById(int id) {
        for (Food food : foods) {
            if (food.getId() == id) {
                return food;
            }
        }
        return null;
    }

    @Override
    public void save(Food food) {
        foods.add(food);
    }

    @Override
    public void delete(int id) {
        foods.removeIf(food -> food.getId() == id);
    }
    @Override
    public void deleteById(String id) {
        Iterator<Food> iterator = foods.iterator();
        while (iterator.hasNext()) {
            Food food = iterator.next();
            if (Objects.equals(food.getId(), id)) {
                iterator.remove();
                break;
            }
        }
    }
}
