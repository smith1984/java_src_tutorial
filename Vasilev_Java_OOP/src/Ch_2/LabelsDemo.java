package Ch_2;

class LabelsDemo{
    public static void main(String[] args){
        MyLabel:
        for(int i=1;i<=100;i++){
            for(int j=1;j<=100;j++){
                if(i!=j) continue;
                if((j%3==0)||(i%2==0)) break;
                if(i+j>20) break MyLabel;
                System.out.println(i+":"+j);}
        }}}