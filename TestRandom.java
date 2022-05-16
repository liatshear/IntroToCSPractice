/* Tests the "quality" of Java's Math.random function.
*/
public  class  TestRandom {
	static int a = 0;
	public static void main(String[]  args) {
		// Complete the program code here:
        int times = Integer.parseInt(args[0]);
        int i = 0;
        int greater = 0;
        int less = 0;
        while (i < times){
            double random = Math.random();
            if(random > 0.5){
                greater++;
            }
            else{
                less++;
            }
            i++;
        }
        System.out.println("> 0.5: " + greater + " times");
        System.out.println("<= 0.5: " + less + " times");
        double ratio = ((double)greater) / ((double)less);
        System.out.println("Ratio: " + ratio);
    }
         
}
