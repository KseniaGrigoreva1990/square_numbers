import ru.netology.javaqa.numbers.scr.SQRService;

public class Main {
    public static void main(String[] args) {
        SQRService program = new SQRService();
        int total = program.sqrNum(100, 200);

        System.out.println(total);
    }

}
