package Ch_1;

class ComplNums{
    public static void main(String args[]){
        double x=1.0,y=-1.0;
        int n=5;
        double r,phi;
        double Re,Im;
        r=Math.sqrt(x*x+y*y);
        phi=Math.atan2(y,x);
        Re=Math.pow(r,n)*Math.cos(n*phi);
        Im=Math.pow(r,n)*Math.sin(n*phi);
        System.out.println("Re="+Re);
        System.out.println("Im="+Im);}
}
