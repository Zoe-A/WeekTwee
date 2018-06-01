package week2;

public class OefMatrix {
    public static void main(String[] args) {
        int[][] a = {
                {1,2,3},
                {2,3,5},
        };

        int[][] b = {
                {1,2},
                {3,2},
                {1,4},
        };
        print (a);
        print(b);
        int[][] c = mul(a,b);
        print(c);

    }

    private static void print(int[][]matrix) {
        for (int[] row : matrix){
            for (int cell : row){
                System.out.println(cell + "\t");
            }
        }
    }

    public static int[][] bereidVoor(int[][] a, int[][] b){
        if (a[0].length == b.length) {
            System.out.println(b.length);
            System.out.println("Ok");
        } else {
            return null;
        }
        return p;
    }

}
