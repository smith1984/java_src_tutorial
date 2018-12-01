package Ch_3;

class MatrProd{
    public static void main(String args[]){
// Ранг квадратных матриц:
        int n=4;
// Массивы для реализации матриц:
        int[][] A,B,C;
        A=new int[n][n];
        B=new int[n][n];
        C=new int[n][n];
// Индексные переменные:
        int i,j,k;
// Заполнение матрицы А:
        System.out.println("Матрица A:");
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                A[i][j]=(int)(20*Math.random()-9);
                System.out.print(A[i][j]+(j!=n-1?"\t \t":"\n"));}}
// Заполнение матрицы В:
        System.out.println("Матрица B:");
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                B[i][j]=(int)(20*Math.random()-9);
                System.out.print(B[i][j]+(j!=n-1?"\t \t":"\n"));}}
// Вычисление матрицы С - произведение матриц А и В:
        System.out.println("Матрица C=AB:");
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                for(k=0;k<n;k++){
                    C[i][j]+=A[i][k]*B[k][j];}
                System.out.print(C[i][j]+(j!=n-1?"\t \t":"\n"));}}
    }}