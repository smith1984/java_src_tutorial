package Ch_8;

class indexOfDemo{
    public static void main(String args[]){
        String s="Всегда слова обдумывая чьи-то\n"+
                "Ты видеть должен, что за ними скрыто.\n"+
                "И помни, что уменье что-то скрыть\n"+
                "Порой ценней уменья говорить!";
        System.out.println(s);
        System.out.println("1: "+s.indexOf('а'));
        System.out.println("2: "+s.lastIndexOf('а'));
        System.out.println("3: "+s.indexOf("то"));
        System.out.println("4: "+s.indexOf('а',10));
        System.out.println("5: "+s.indexOf("то",10));}
}