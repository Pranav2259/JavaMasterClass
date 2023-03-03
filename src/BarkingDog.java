public class BarkingDog {

    public static boolean shouldWakeUp(boolean barking, int houroftheday) {
        if (barking) {
            if (houroftheday >= 0 && houroftheday <= 23) {
                if (houroftheday < 8 || houroftheday > 22) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true,15));
    }
}
