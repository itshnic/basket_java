import model.ReadFile;
import presenter.Menu;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        new Menu().start(new ReadFile(
                "D:\\Users\\Пользователь\\Desktop\\GeekBR\\SERVER\\OSPanel\\domains\\lessons\\java_less\\basket_java\\src\\bd\\"
                ,"input.txt").fileToArray());
    }
}