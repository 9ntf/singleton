import filter.Filter;
import logger.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        Scanner scanner = new Scanner(System.in);

        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");
        System.out.println("Введите размер списка:");
        int arraySize = scanner.nextInt();
        System.out.println("Введите верхнюю границу для значений:");
        int treshold = scanner.nextInt();
        logger.log("Создаем и заполняем список");
        ArrayList<Integer> list = createArray(arraySize, treshold);
        System.out.println("Вот случайный список:");
        for (Integer l : list) {
            System.out.print(l + " ");
        }
        System.out.println("\nВведите порог для фильтра:");
        int f = scanner.nextInt();
        Filter filter = new Filter(f);
        List<Integer> result = filter.filterOut(list);
        logger.log("Выводим результат на эктан");
        System.out.print("Отфильтрованный список: ");
        for (Integer l : result) {
            System.out.print(l + " ");
        }
        logger.log("Завершаем программу");

    }

    private static ArrayList<Integer> createArray(int arraySize, int treshold) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arraySize; i++) {
            list.add(random.nextInt(treshold));
        }
        return list;
    }
}