import java.util.ArrayList;
import java.util.List;

public class UserRepository implements IUserRepository {
    private List<User> users = new ArrayList<>();

    @Override
    public User getId(Long id) {
        for (User user : users) {
            if (user.id.equals(id)) {
                return user;
            }
        }
        return null;
    }

    @Override
    public List<User> getAll() {
        return new ArrayList<>(users);
    }

    @Override
    public void salvar(User user) {
        users.add(user);
    }

    @Override
    public void delete(Long id) {
        users.removeIf(user -> user.id.equals(id));
    }
}
