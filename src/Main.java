import java.util.*;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Queue<Person> queueForAttr = generateClient();
        Iterator iter = queueForAttr.iterator();
        while (iter.hasNext()) {
            System.out.println("----------Очередь на покатушки---------");
            for (Person item :
                    queueForAttr) {
                System.out.println(item.getName() + " билетов: " + item.getTikets());
            }
            input("Чтобы загнать чувака на аттракцион, нажми ENTER");
            Person promVar = queueForAttr.poll();
            if (promVar.getTikets() > 0) {
                System.out.println("Катаццо пошел: " + promVar.getName() + " билетов: " + promVar.getTikets());
                promVar.composter();
                if (promVar.getTikets() > 0) {
                    queueForAttr.add(promVar);
                }
                input("Чтобы чувак прокатился нажми ENTER");
            }

        }
    }

    public static LinkedList<Person> generateClient() {

        List<String> namesList = Arrays.asList("Вася Васечкин", "Петя Сидоров", "Саша Иванов", "Хельга Рюриковна", "Арнольд Шварцнегр");
        LinkedList<Person> persList = new LinkedList<>();
        Random rnd = new Random();
        for (String name : namesList) {
            Person person = new Person(name, 1 + rnd.nextInt(7));
            persList.add(person);
        }
        return persList;
    }

    public static String input(String message) {
        System.out.println(message);
        String outline = sc.nextLine();
        return outline;
    }
}