package view;

public enum Commands {

    ADD_TOY ("ADD_TOY - Команда добавления игрушек в автомат"),
    REMOVE_TOYS("REMOVE_TOYS - Команда удаления всех игрушек из автомата"),
    VIEW_TOYS ("VIEW_TOYS - Команда просмотра игрушек в автомате"),
    HELP ("HELP - Инструкция по эксплуатации автомата :)"),
    WIN_TOY ("WIN_TOY - Выиграть игрушку в автомате"),
    EXIT ("EXIT - Завершить работу"),
    NONE ("----------------------------------------------------");

    private String title;
    Commands(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}