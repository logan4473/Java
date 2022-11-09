public class Arr {
    public static void main(String[] args) {
        int[][] mat = new int[2][2];
        mat[0][0] = 1;

        for(int row=0;row<mat.length;row++)
        {
            for(int col=0;col<mat[row].length;col++)
            {
                System.out.print(mat[row][col]+" ");
            }
            System.out.print('\n');
        }

        int[][] mat2 = {{1,2,3},{4,5,6}};

        int[][] mat3 = new int[2][];
        mat3[0] = new int[2];
        mat3[1] = new int[3];
        int c = 1;
        for(int i=0;i<mat3.length;i++)
        {
            for(int j=0;j<mat3[i].length;j++)
            {
                mat3[i][j] = c;
                System.out.print(mat3[i][j]+" ");
                c++;
            }
            System.out.print('\n');
        }

    }   
}
