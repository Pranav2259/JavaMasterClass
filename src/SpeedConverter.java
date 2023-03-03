public class SpeedConverter {
    public static long toMilesPerHour(double kilometersPerHour){
        if (kilometersPerHour<0){
            return -1l;
        }
        else {
            long milesPerHour = Math.round(kilometersPerHour / 1.609);
            return milesPerHour;
        }
    }
    public static void printConversion(double kilometersPerHour){
        if(kilometersPerHour>=0){
            long mph = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour+ " km/h = "+mph+" mi/h");}
        else{
            System.out.println("Invalid Value");
        }
    }

    public static void main(String[] args) {
        printConversion(634.4353);
        printConversion(300);
    }
}