package MyFirstProject;

public class ReportCard {
    /**
     Mетод convertGrades принимает один целочисленный аргумент
     - результат теста и возвращает символ A, B, C or D в
     зависимости от этого аргумента.
     */
    public static char convertGrades( int testResult){
        char grade;
        if (testResult >= 90){
            grade = 'A';
        }else if (testResult >= 80 && testResult < 90){
            grade = 'B';
        }else if (testResult >= 70 && testResult < 80){
            grade = 'C';
        }else {
            grade = 'D';
        }
        return grade;}
    public static void main(String[] args){
        char yourGrade = ReportCard.convertGrades(88);
        System.out.println("Ваша первая оценка " + yourGrade);
        switch (yourGrade){
            case 'A':
                System.out.println("Превосходная работа!");
                break;
            case 'B':
                System.out.println("Хорошая работа!");
                break;
            case 'C':
                System.out.println("Надо подтянуть знания!");
                break;case 'D':
                System.out.println("Будь посерьёзнее!");
                break;
        }
        yourGrade = ReportCard.convertGrades(79);
        System.out.println("Ваша вторая оценка " + yourGrade);
        switch (yourGrade){
            case 'A':
                System.out.println("Превосходная работа!");
                break;
            case 'B':
                System.out.println("Хорошая работа!");
                break;
            case 'C':
                System.out.println("Надо подтянуть знания!");
                break;case 'D':
                System.out.println("Будь посерьёзнее!");
                break;
        }
    }
}