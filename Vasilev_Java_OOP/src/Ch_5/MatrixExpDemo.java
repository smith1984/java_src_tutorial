package Ch_5;

class MatrixExp{
    // Количество слагаемых в ряде для экспоненты:
    private final static int N=100;
    // Размер матрицы:
    private int n;
    // Ссылка на матрицу:
    private double[][] matrix;
    // Конструктор (размер матрицы и диапазон случайных значений):
    MatrixExp(int n,double Xmin,double Xmax){
        double x=Math.abs(Xmax-Xmin);
        int i,j;
        this.n=n;
        matrix=new double[n][n];
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                matrix[i][j]=x*Math.random()+Xmin;}
        }}
    // Конструктор (на основе существующей матрицы):
    MatrixExp(double[][] matrix){
        this.n=matrix[0].length;
        this.matrix=new double[n][n];
        int i,j;
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                this.matrix[i][j]=matrix[i][j];}}
    }
    // Конструктор (единичная матрица заданного ранга):
    MatrixExp(int n){
        this.n=n;
        matrix=new double[n][n];
        int i,j;
        for(i=0;i<n;i++){
            for(j=0;j<i;j++){
                matrix[i][j]=0;}
            matrix[i][i]=1;
            for(j=i+1;j<n;j++){
                matrix[i][j]=0;}}
    }
    // Конструктор (заполнение одним числом):
    MatrixExp(int n,double a){
        this.n=n;
        matrix=new double[n][n];
        int i,j;
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                matrix[i][j]=a;}
        }}
    // Метод для отображения матрицы:
    void show(){
        int i,j;
        for(i=0;i<n;i++){
            for(j=0;j<n-1;j++){
                System.out.print(Math.round(1000*matrix[i][j])/1000.0+"\t");}
            System.out.print(Math.round(1000*matrix[i][n-1])/1000.0+"\n");
        }}
    // Метод для вычисления суммы матриц:
    MatrixExp sum(MatrixExp B){
        MatrixExp t=new MatrixExp(n,0);
        int i,j;
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                t.matrix[i][j]=matrix[i][j]+B.matrix[i][j];}}
        return t;}
    // Метод для вычисления произведения матрицы на число:
    MatrixExp prod(double x){
        MatrixExp t=new MatrixExp(matrix);
        int i,j;
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                t.matrix[i][j]*=x;}}
        return t;}
    // Метод для вычисления произведения матриц:
    MatrixExp prod(MatrixExp B){
        MatrixExp t=new MatrixExp(n,0);
        int i,j,k;
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                for(k=0;k<n;k++){
                    t.matrix[i][j]+=matrix[i][k]*B.matrix[k][j];}
            }}
        return t;}
    // Метод для вычисления матричной экспоненты:
    MatrixExp mExp(){
        MatrixExp t,q;
// Начальное значение - единичная матрица:
        t=new MatrixExp(n);
// Начальная добавка:
        q=new MatrixExp(matrix);
        int i;
// Вычисление ряда для экспоненты:
        for(i=1;i<=N;i++){
            t=t.sum(q);
            q=q.prod(this).prod(1.0/(i+1));}
        return t;}
}
class MatrixExpDemo{
    public static void main(String[] args){
// Исходная матрица (поле объекта):
        MatrixExp A=new MatrixExp(3,-1,1);
        System.out.println("Матрица A:");
// Отображение исходной матрицы:
        A.show();
        System.out.println("Матрица exp(A):");
// Вычисление матричной экспоненты и отображение результата:
        A.mExp().show();
    }}