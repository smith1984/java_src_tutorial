package Ch_8;

class equalStringsDemo{
    public static void main(String args[]){
        String strA="Алексей Васильев";
        String strB=new String("Алексей Васильев");
        String strC="Васильев Алексей";
        String strD="АЛЕКСЕЙ ВАСИЛЬЕВ";
        System.out.println(strA+" то же самое, что "+strB+" --> "+strA.equals(strB));
        System.out.println(strA+" то же самое, что "+strC+" --> "+strA.equals(strC));
        System.out.println(strA+" то же самое, что "+strD+" --> "+strA.equals(strD));
        System.out.println(strA+" то же самое, что "+strD+" --> "+strA.equalsIgnoreCase(strD));
        System.out.println(strA+" то же самое, что "+strB+" --> "+(strA==strB));
    }}