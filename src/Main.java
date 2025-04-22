public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
    int a = 1_222_222_222;
        System.out.println("Значение переменной  'a' с типом int равно " +a);
    byte b = 22;
        System.out.println("Значение переменной  'b' с типом byte равно " +b);
    short c = 22_222;
        System.out.println("Значение переменной  'c' с типом short равно " +c);
    long d = -2_222_222_222_222_222_222L;
        System.out.println("Значение переменной  'd' с типом long равно " +d);
    float e = 2.21E01f;
        System.out.println("Значение переменной  'e' с типом float равно " +e);
    double y = (double) 5 /2;
        System.out.println("Значение переменной  'y' с типом double равно " +y);

        System.out.println("Задача 2");
    double aa = 27.12;
    long bb = 987_678_965_549L;
    double cc = 2.786;
    short dd = 569;
    short ee = -159;
    short ww = 21897;
    byte tt = 67;
        System.out.println("Переменная-тип: " +aa+ " - double, "  +bb+ " - long, "
                +cc+ " - double, " +dd+ " - short, " +ee+ " - short, " +ww+ " - short, " +tt+ " - byte.");

    System.out.println("Задача 3");
        byte totalNumberHeads = 23 + 27 + 30;
    System.out.println("Общее количество учеников - " +totalNumberHeads+ " чел.");
        short sheetsPaper = 480;
    System.out.println("Количество листов на всех учеников - " +sheetsPaper+ " шт.");
        int sheetsPaperPerson = sheetsPaper / totalNumberHeads;
    System.out.println("Количество листов на одного ученика - " +sheetsPaperPerson+ " шт.");

    System.out.println("Задача 3");
    }


}