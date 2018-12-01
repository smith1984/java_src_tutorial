package Ch_3;

class MatrTrans{
    public static void main(String args[]){
// Ранг матрицы:
        int n=4;
// Двухмерный массив:
        int[][] A=new int[n][n];
// Индексные и "рабочие" переменные:
        int i,j,tmp;
        System.out.println("Матрица до транспонирования:");
// Заполнение матрицы случайными числами:
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                A[i][j]=(int)(10*Math.random());
                System.out.print(A[i][j]+(j!=n-1?"  ":"\n"));}}
// Транспонирование матрицы:
        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                tmp=A[i][j];
                A[i][j]=A[j][i];
                A[j][i]=tmp;}}
// Вывод результата на экран:
        System.out.println("Матрица после транспонирования:");
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                System.out.print(A[i][j]+(j!=n-1?"  ":"\n"));}}
    }}