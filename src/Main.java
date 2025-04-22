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

    System.out.println("Задача 4");
    float q;
    q= (float) 16 /2;
    System.out.println("Количество бутылок, произв. за 1 мин.  - " +q+ " шт.");
        int doneMinutes20 = (int) (q * 20);
    System.out.println("За 20 минут, будет произведено " +doneMinutes20+ " шт. бутылок");
        int doneMinutesDay = (int) (((24*60) * 1) *q);
    System.out.println("За сутки, будет произведено " +doneMinutesDay+ " шт. бутылок");
        int doneMinutes3Days = (int) (((24*60) * 3) * q);
    System.out.println("За сутки, будет произведено " +doneMinutes3Days+ " шт. бутылок");
       int doneMinutes30Days = (int) (((24*60) * 30) * q);
   System.out.println("За месяц - 30 дней, будет произведено " +doneMinutes30Days+ " шт. бутылок");

   System.out.println("Задача 5");
   byte totalNumberCans = 120;
        byte oneClass = 2 + 4;
        int totalNumberClasses = (int) totalNumberCans / oneClass;  // количество классов - 20
        int numberWhitePaint = (int) totalNumberClasses * 2; // 40 банок белой
        int numberBlackPaint = (int) totalNumberClasses * 4; // 80 банок черной
   System.out.println("В школе, где " +totalNumberCans+ " классов, нужно " +numberWhitePaint+  " банок белой краски и " +numberBlackPaint+ " банок коричневой краски");

   System.out.println("Задача 6");


    }
}