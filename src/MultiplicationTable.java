public class MultiplicationTable {
    public static void main(String[] args) {
        //Task 1
        //Write a program that prints out a multiplication table 12 X 12

        for (int i = 1; i <= 12 ; i++){
            for(int j = 1; j <= 12; j ++){
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
    }
}