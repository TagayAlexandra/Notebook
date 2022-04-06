package by.epam.tr.view;

public class View {
    public static final String START_MENU = "Выберите действие:" + "\n" +
            "1  - Добавить заметку" + "\n" +
            "2  - Удалить заметку " + "\n" +
            "3  - Просмотреть заметки " + "\n" +
            "4  - Найти заметку по дате добавления " + "\n" +
            "5  - Найти заметку по данным" + "\n" +
            "6  - Завершить работу";

    public static final String INPUT_DATE = "Введите данные";
    public static final String INPUT_DATE_YEAR = "Введите Год";
    public static final String INPUT_DATE_MOUNTS = "Введите Месяц";
    public static final String INPUT_DATE_DAY = "Введите День";
    public static final String END = "Выберите действие:" + "\n" +
            "1  - Продолжить" + "\n" +
            "2  -  Завершить ";

    public static <T> void println(T inf) {
        System.out.println(inf);
    }
}
