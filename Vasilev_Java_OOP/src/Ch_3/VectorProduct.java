package Ch_3;

class VectProduct{
    public static void main(String args[]){
        double[] a,b,c;
        a=new double[]{1,2,-1};
        b=new double[]{3,-1,2};
        c=new double[3];
        int k;
        double s=0;
        System.out.print("Произведение векторов:\n[a.b]=<");
        for(k=0;k<3;k++){
            s+=a[k]*b[k];
            c[k]=a[(k+1)%3]*b[(k+2)%3]-a[(k+2)%3]*b[(k+1)%3];
            System.out.print(c[k]+(k!=2?";":">\n"));}
        System.out.println("a.b="+s);}
}
