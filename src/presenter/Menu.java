package presenter;

import view.View;

import java.util.Scanner;

public class Menu {
    String welcome;
    String menu_title;
    String[] text_menu;
    String request;
    String result;

    public Menu() {
        this.welcome = "Добро пожаловать в меню программы!";
        this.menu_title = "Введите цифру согласно пункта меню: ";
        this.text_menu = new String[]{
                "1 - поиск самых длинных названий",
                "2 - подсчет количества слов в файле",
                "3 - поиск повторяющихся слов",
                "9 - выход из программы"};
        this.request = "Введите номер -> ";
        this.result = "Результат -> ";
    }

    public void start(String[] array) {
        GetInfo info = new GetInfo();
        View view = new View();
        boolean flag = true;
        view.printTxtFormat(this.welcome);
        while (flag) {
            view.printTxtFormat(this.menu_title);
            for(String txt:this.text_menu) {
                view.printTxt(" " + txt,true);
            }
            view.printTxt("",true);
            Scanner iScanner = new Scanner(System.in);
            view.printTxt(this.request,false);
            switch (iScanner.nextInt()) {
                case 1:
                    view.printTxtFormat(this.result+info.count(array)+" наименований!");
                    break;
                case 2:
                    view.printTxtFormat(this.result+info.maxLongNameProduct(array));
                    break;
                case 3:
                    int count = 1;
                    for(var item : info.duplicate(array).entrySet()){
                    view.printTxtFormat(count+". "+item.getKey()+": "+item.getValue()+" шт.");
                    count++;
                }
                    break;
                case 9:
                    flag = false;
                    view.printTxtFormat(" До встречи) ");
                    break;
                default:
                    view.printTxtFormat(" Нет такой команды ");
            }

        }
    }
}
