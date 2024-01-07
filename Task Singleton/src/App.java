public class App {
    public static void main(String[] args) throws Exception {
        IphoneSettings settings1 = IphoneSettings.getInstance();

        settings1.setBrightness(150);
        settings1.setWifi(false);
        System.out.println("Brightness level is " + settings1.getBrightness());
        System.out.println("Wifi Status is " + settings1.getWifi());

    }
}
