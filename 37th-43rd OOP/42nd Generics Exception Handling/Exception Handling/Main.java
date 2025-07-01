
public class Main {

    static int divide(int a, int b) throws ArithmeticException {
        if(b == 0){
            throw new ArithmeticException();
        }
        return a / b;
    }

    public static void main(String[] args) {
        
        int a = 5;
        int b = 0;
        // int c = a / b; // This will throw an ArithmeticException
        try {
            // int c = a / b; // This will throw an ArithmeticException
            // System.out.println("Result: " + c);

            // System.out.println("Result: " + divide(a, b));

            String name = "Sujal";
            if(name.equals("Sujal")) {
                throw new MyException("This is a custom exception");
            }

        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (MyException e) {
            System.out.println("Error: " + e.getMessage());
        }  catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("This block always executes.");
        }

    }

}
