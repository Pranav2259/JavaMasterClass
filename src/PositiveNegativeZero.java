public class PositiveNegativeZero {
    public static void checkNumber(int num) {
        if(num>0){
            System.out.println("Positive");
        } else if (num<0) {
            System.out.println("Negative");
        }else{
            System.out.println("number equals to zero");
        }
    }
    public static void main(String[] args) {
        checkNumber(10);
        checkNumber(-10);
        checkNumber(0);
    }
}
