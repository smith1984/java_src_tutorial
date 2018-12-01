package Ch_4;

class SMatrix{
    // Размер матрицы:
    private int n;
    // Объектная переменная:
    private int[][] Matrix;
    // Определение размера и создание матрицы:
    void setBase(int n){
        this.n=n;
        Matrix=new int[n][n];}
    // Заполнение случайными числами:
    void setRND(){
        int i,j;
        for(i=0;i<n;i++)
            for(j=0;j<n;j++)
                Matrix[i][j]=(int)(Math.random()*10);
    }
    // Заполнение одинаковыми числами:
    void setVal(int a){
        int i,j;
        for(i=0;i<n;i++)
            for(j=0;j<n;j++)
                Matrix[i][j]=a;
    }
    // Заполнение последовательностью цифр:
    void setNums(){
        int i,j;
        for(i=0;i<n;i++)
            for(j=0;j<n;j++)
                Matrix[i][j]=(i*n+j)%9+1;
    }
    // Единичная матрица:
    void setE(){
        int i;
        setVal(0);
        for(i=0;i<n;i++)
            Matrix[i][i]=1;
    }
    // Отображение матрицы:
    void show(){
        int i,j;
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                System.out.print(Matrix[i][j]+(j==n-1?"\n":" "));}
        }
    }
    // След матрицы:
    int Sp(){
        int i,s=0;
        for(i=0;i<n;i++) s+=Matrix[i][i];
        return s;}
    // Определитель матрицы:
    int det(){
        int D=0;
        switch(n){
// Матрица размерами 1 на 1:
            case 1:
                D=Matrix[0][0];
                break;
// Матрица размерами 2 на 2:
            case 2:
                D=Matrix[0][0]*Matrix[1][1]-Matrix[0][1]*Matrix[1][0];
                break;
            case 3:
// Матрица размерами 3 на 3:
                int i,j,A,B;
                for(j=0;j<n;j++){
                    A=1;
                    B=1;
                    for(i=0;i<n;i++){
                        A*=Matrix[i][(j+i)%n];
                        B*=Matrix[n-i-1][(j+i)%n];}
                    D+=A-B;}
                break;
// Прочие случаи:
            default:
                int k,sign=1;
                SMatrix m;
                for(k=0;k<n;k++){
                    m=new SMatrix();
                    m.setBase(n-1);
                    for(i=1;i<n;i++){
                        for(j=0;j<k;j++) m.Matrix[i-1][j]=Matrix[i][j];
                        for(j=k+1;j<n;j++) m.Matrix[i-1][j-1]=Matrix[i][j];
                    }
                    D+=sign*Matrix[0][k]*m.det();
                    sign*=(-1);
                }
        }
        return D;}
    // Транспонирование матрицы:
    void trans(){
        int i,j,s;
        for(i=0;i<n;i++)
            for(j=i+1;j<n;j++){
                s=Matrix[i][j];
                Matrix[i][j]=Matrix[j][i];
                Matrix[j][i]=s;}
    }
}
class MatrixDemo{
    public static void main(String[] args){
// Создание объекта:
        SMatrix obj=new SMatrix();
// Определение размера матрицы и ее создание:
        obj.setBase(3);
// Заполнение случайными числами:
        obj.setRND();
// Единичная матрица:
//obj.setE();
// Заполнение единицами:
//obj.setVal(1);
// Заполнение последовательностью цифр:
//obj.setNums();
        System.out.println("Исходная матрица:");
        obj.show();
        System.out.println("После транспонирования:");
// Транспонирование матрицы:
        obj.trans();
        obj.show();
// Вычисление следа матрицы:
        System.out.println("След матрицы: "+obj.Sp());
// Вычисление определителя матрицы:
        System.out.println("Определитель матрицы: "+obj.det());
    }}