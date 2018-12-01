package Ch_3;

class MyTArray{
    public static void main(String[] args){
// »ндексные переменные:
        int i,j,k;
// ќбъ¤вление трехмерного массива:
        byte[][][] epsilon=new byte[3][3][3];
// ќбнуление элементов массива:
        for(i=0;i<3;i++)
            for(j=0;j<3;j++)
                for(k=0;k<3;k++)
                    epsilon[i][j][k]=0;
// ≈диничные элементы массива:
        epsilon[0][1][2]=epsilon[1][2][0]=epsilon[2][0][1]=1;
// Ёлементы со значением -1:
        epsilon[1][0][2]=epsilon[0][2][1]=epsilon[2][1][0]=-1;
    }
}