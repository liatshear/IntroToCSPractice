// Demonstrates the Collatz conjecture. */
public class Collatz {
	public static void main(String args[]) {
	    // Complete the program code here:
            int N = Integer.parseInt(args[0]);
        int input = Integer.parseInt(args[0]);
        String mode = args[1];
        if (mode.equals("c")) {
            System.out.println("The first " + input + " hailstone sequences reached 1.");
        } else if (mode.equals("v")){
            for (int row = 1; row <= input; row++) {
                System.out.println();
                System.out.print(row + " ");
                int column = row;
                int count = 1;
                do{
                    if ((column % 2) == 0) {
                        column = column / 2;
                    } else {
                        column = (column * 3) + 1;
                    }
                    count++;
                    System.out.print(column);
                    System.out.print(" ");
                }while (column != 1);
                System.out.print("(" + count + ")");

            }
            System.out.println();
            System.out.println("The first " + input + " hailstone sequences reached 1.");

        }

              
         
	}
}
