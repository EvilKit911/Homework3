public class Main {
    public static void main(String[] args) {

        //задача 1
        int a = 12;
        byte b = 14;
        short c = 13;
        long d = 44;
        float e = 4.7f;
        double f = 145.12;
        System.out.println("Значение переменной a с типом int равно " + a );
        System.out.println("Значение переменной b с типом byte равно " + b );
        System.out.println("Значение переменной c с типом short равно " + c );
        System.out.println("Значение переменной d с типом long равно " + d );
        System.out.println("Значение переменной e с типом float равно " + e );
        System.out.println("Значение переменной f с типом double равно " + f );
        System.out.println(" ");


        //задача 2

        float a1 = 27.12f;
        long b1 = 987678965549L;
        byte c1 = 2;
        int d1 = 786;
        boolean lie = false;
        short e1 = 569;
        int f1 = -159;
        char g1 = 27897;
        double h1 = 67.0;


        //задача 3

        int pupilsLudmila = 23;
        int pupilsAnna = 27;
        int pupilsEkaterina = 30;

        int allPaperByu = 480;
        int allPupils = pupilsAnna + pupilsEkaterina + pupilsLudmila;
        int paperOnePupils = allPaperByu / allPupils;
        System.out.println("На каждого ученика расчитано "+ paperOnePupils + " листов бумаги");
        System.out.println(" ");

        //задача 4

        int proizvod2Minuts = 16;
        int proizvod1Minuts = proizvod2Minuts / 2; // высчитываю сколько бутылок в минуту

        int proizvod20Minuts = proizvod1Minuts * 20;
        System.out.println("За 20 минут работы машины произвела бутылок " + proizvod20Minuts + "штук");
        int hourSutki = 24;
        int minutSutki = hourSutki * 60;
        int proizvod24Hour = minutSutki * proizvod1Minuts;
        System.out.println("За сутки работы машины произвела бутылок " + proizvod24Hour + "штук");

        int threeDays = minutSutki * 3;
        int proizvodThreeDays = threeDays * proizvod1Minuts;
        System.out.println("За 3 дня работы машины произвела бутылок " + proizvodThreeDays + "штук");

        int oneMonth = minutSutki * 30;
        int proizvodMonth = oneMonth * proizvod1Minuts;
        System.out.println("За месяц работы машины произвела бутылок " + proizvodMonth + "штук");
        System.out.println(" ");

        //задача 5
        int needCansPaint = 120;
        int needWhitePaintOneRoom = 2;
        int needBrownPaintOneRoom = 4;

        int needAllPaint = needWhitePaintOneRoom + needBrownPaintOneRoom;
        int roomSchool = needCansPaint / needAllPaint;
        int buyWhitePaint = roomSchool * needWhitePaintOneRoom;
        int buyBrownPaint = roomSchool * needBrownPaintOneRoom;
        System.out.println("В школе где " + roomSchool + " классов, нужно " + buyWhitePaint + " банок белой краски и " + buyBrownPaint + " банок коричневой краски"  ) ;
        System.out.println(" ");


        //задача 6

        int bananAll = 5;
        int weightOneBanan = 80;// грамм

        int milkAll = 200; // милилитров
        int weightMilkOne = 105;// грамм
        int weightMilkTwo = weightMilkOne * 2; // не уверен в правильности данного действия

        int icekreamAll = 2;
        int iceKreamOne = 100;// грамм

        int eggAll = 4;
        int eggOne = 70;// грамм

        float blender = (bananAll * weightOneBanan) + weightMilkTwo + (icekreamAll * iceKreamOne) + (eggAll * eggOne) ;
        float blenderKg = blender / 1000;
        System.out.println(blenderKg + "кг вес завтрака");
        System.out.println(" ");

        // задача 7

        int needDelKg = 7;
        int needDelGr = needDelKg * 1000;

        int delOne = 250;
        int delTwo = 500;

        int planPitOne = needDelGr / delOne;
        int planPitTwo = needDelGr / delTwo;
        System.out.println(planPitOne + " столько дней уйдет если спортсмен будет терять в день по " + delOne + " грамм и столько дней" + planPitTwo + " если будет терять по " + delTwo ) ;
        int srednieZnachenie = (planPitOne + planPitTwo ) / 2; // не уверен в правильности...
        System.out.println(srednieZnachenie + " может потребоваться дней в среднем, чтобы добиться результата похудения");
        System.out.println(" ");


        // задача 8
        // если кто-то будет читать этот комент то знай что деньги считают до копейки =)

        float masha = 67760f;          int monthYear = 12;
        float denis = 83690f;
        float krist = 76230f;

        float mashaPlus = (masha / 100) * 110 ;
        float denisPlus = (denis / 100) * 110 ;
        float kristPlus = (krist / 100) * 110 ;

        float mashaYear = masha * monthYear;      float mashaYearPlus = mashaPlus * monthYear;
        float denisYear = denis * monthYear;      float denisYearPlus = denisPlus * monthYear;
        float kristYear = krist * monthYear;      float kristYearPlus = kristPlus * monthYear;

                        float mashaIncreased = mashaYearPlus - mashaYear;
                        float denisIncreased = denisYearPlus - denisYear;
                        float kristIncreased = kristYearPlus - kristYear;

        System.out.println("Маша теперь получает " + mashaPlus + " рублей, годовой доход вырос на " + mashaIncreased + " рублей");
        System.out.println("Денис теперь получает " +denisPlus + " рублей, годовой доход вырос на " + denisIncreased + " рублей");
        System.out.println("Кристина теперь получает " +kristPlus + " рублей, годовой доход вырос на " + kristIncreased + " рублей");

    }
}