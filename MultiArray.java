public class MultiArray {
    public static void main(String[] args) {
        int a[][]={{2,5,7},{4,7,8},{7,6,0}};
        int b[][]={{4,7,5},{5,2,3},{6,8,3}};

        int c[][]=new int[3][3];

        for(int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                c[i][j]=0;
                for(int k=0;k<3;k++){
                    c[i][j]+=a[i][k]*b[k][j];
                }
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}
