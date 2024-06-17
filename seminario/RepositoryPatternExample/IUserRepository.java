import java.util.List;

public interface IUserRepository {
    User getId(Long id);
    List<User> getAll();
    void salvar(User user);
    void delete(Long id);
}
