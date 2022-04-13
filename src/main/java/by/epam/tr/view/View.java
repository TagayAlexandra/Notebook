package by.epam.tr.view;

public class View {
    public  final String START_MENU = "Выберите действие:" + "\n" +
            "1  - Добавить заметку" + "\n" +
            "2  - Удалить заметку " + "\n" +
            "3  - Просмотреть заметки " + "\n" +
            "4  - Найти заметку по дате добавления " + "\n" +
            "5  - Найти заметку по данным" + "\n" +
            "6  - Завершить работу";

    public  final String INPUT_DATE = "Введите данные";
    public  final String INPUT_DATE_YEAR = "Введите Год";
    public  final String INPUT_DATE_MOUNTS = "Введите Месяц";
    public  final String INPUT_DATE_DAY = "Введите День";
    public  final String END = "Выберите действие:" + "\n" +
            "1  - Продолжить" + "\n" +
            "2  -  Завершить ";

    public  <T> void println(T inf) {
        System.out.println(inf);
    }
}
