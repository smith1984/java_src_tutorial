package Ch_8;

class SubStringConstr{
    public static void main(String args[]){
        byte ascii[]={65,66,67,68,69,70};
        String strBig=new String(ascii);
        System.out.println(strBig);
        String strSmall=new String(ascii,2,3);
        System.out.println(strSmall);}
}