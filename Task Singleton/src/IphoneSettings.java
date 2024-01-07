public class IphoneSettings {
    private static IphoneSettings instance;
    private static int brightness;
    private static boolean wifi;

    private IphoneSettings() {
    }

    public static IphoneSettings getInstance() {
        if (instance == null) {
            instance = new IphoneSettings();
        }
        return instance;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }

    public int getBrightness() {
        return brightness;

    }

    public void setWifi(boolean wifi) {

        this.wifi = wifi;

    }

    public boolean getWifi() {
        return wifi;

    }

}
