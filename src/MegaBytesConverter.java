public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes >= 0) {
            int MB = kiloBytes / 1024;
            int kb = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + MB + " MB and " + kb + " KB");
        } else {
            System.out.println("Invalid Value");
        }
    }

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1);
    }
}
