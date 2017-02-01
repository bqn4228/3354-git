package adder;

public class Main {

    public static void main(String[] args) {
        try {
            int result = addArguments(args);
            System.out.println(result);
        } catch(InputMismatchException a){
		System.out.println("Invalid input");
	catch (Exception e) {
            System.err.println("Please provide three values to add");
        } 
    }

    private static int addArguments(String[] args) {
if(args[0] == "-")
	return -Integer.valueOf(args[1]) - Integer.valueOf(args[2]);
else
        return Integer.valueOf(args[0]) + Integer.valueOf(args[1]) + Integer.valueOf(args[2]);
    }
}
