import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        UserRepository userRepository = new UserRepository();

        User user1 = new User(1L, "john_doe", "john@example.com");
        User user2 = new User(2L, "jane_smith", "jane@example.com");

        userRepository.salvar(user1);
        userRepository.salvar(user2);

        User usuarioEspecifico = userRepository.getId(1L);
        System.out.println("Específico User: " + usuarioEspecifico);


        List<User> todosUsuários = userRepository.getAll();
        System.out.println("All Users:");
        for (User user : todosUsuários) {
            System.out.println(user);
        }

        System.out.println("Deletando usuário 2: ");
        userRepository.delete(2L);


        List<User> todosUsuáriosPosExclusao = userRepository.getAll();
        System.out.println("Todo usuário Users pos exclusão:");
        for (User user : todosUsuáriosPosExclusao) {
            System.out.println(user);
        }
    }
}
