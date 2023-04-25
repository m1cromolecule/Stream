import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<User> users = List.of(new User(1L, "baijan", 20, "baijan@gmail.com"),
                new User(1L, "rmamor", 22, "rmamor@gmail.ru"),
                new User(2L, "islam", 26, "islam@mail.ru"),
                new User(3L, "beka", 7, "beka@gmail.com"),
                new User(4L, "ars", 20, "ars@gmail.ru"),
                new User(5L, "batman", 19, "batma@gmail.com"),
                new User(6L, "chika", 53, "chika@mail.ru"),
                new User(7L, "bema", 17, "bema@mail.com"),
                new User(8L, "karaganda", 45, "karaganda@mail.ru"),
                new User(9L, "amir", 33, "amir@mail.ru"),
                new User(10L, "obolo", 28, "obolo@mail.com"));
//aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
        System.out.println("1");
//aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa


        List<User> userDtos1 = users.stream()
                .sorted(Comparator.comparingInt(User::getAge))
                .toList();
        userDtos1.forEach(System.out::println);

//aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
        System.out.println("2");
//aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa


        List<User> userDtos2 = users.stream()
                .filter(u -> u.getId() % 2 == 0)
                .toList();
        userDtos2.forEach(System.out::println);

//aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
        System.out.println("3");
//aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa


        List<User> userDtos3 = users.stream()
                .filter(userDto -> userDto.getLogin().length() <= 5)
                .toList();
        userDtos3.forEach(System.out::println);

//aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
        System.out.println("4");
//aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa


        List<User> userDtos4 = users.stream()
                .filter(userDto -> userDto.getEmail().endsWith(".com"))
                .toList();
        userDtos4.forEach(System.out::println);

//aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
        System.out.println("5");
//aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa

        
        List<String> userDtos5 = users.stream()
                .map(User::getEmail)
                .toList();
        System.out.println("Emails:");
        userDtos5.forEach(System.out::println);

//aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
        System.out.println("6");
//aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa


        int userDtos6 = users.stream()
                .mapToInt(User::getAge)
                .sum();
        System.out.println(userDtos6);

//aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
        System.out.println("7");
//aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa

        
        Map<String, String> userDtos7 = users.stream()
                .collect(Collectors.toMap(User::getLogin, User::getEmail));
        System.out.println(userDtos7);

    }
}
