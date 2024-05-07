import model.ReadFile;
import presenter.Menu;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        new Menu().start(new ReadFile(
                "C:\\Users\\Пользователь\\Desktop\\GeekBR\\PHP\\phpLesson\\OpenServer\\domains\\java_less\\basket_java\\src\\bd\\"
                ,"input.txt").fileToArray());
    }
}