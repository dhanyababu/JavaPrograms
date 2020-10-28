package Mjuk19_package;

public class CoverageProgram {
    public boolean CheckNumber(int n){
        if (n > 0) {
            System.out.println("Number is greater than Zero");
            return true;
        }
        else if (n == 0){
            System.out.println("Number is Zero");
            return false;
        }
        else {
            System.out.println("Numver is Less than zero");
            return false;
        }
    }

    public void hello(){
        System.out.println("Hej");
    }
}
