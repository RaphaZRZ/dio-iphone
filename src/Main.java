import cellphone.Iphone;

public class Main {
    public static void main(String[] args) {
        Iphone iphoneSeven = new Iphone();

        System.out.println("1° iPhone status:");
        iphoneSeven.showStatus();

        System.out.println("===========================\n");

        iphoneSeven.playMusic();
        iphoneSeven.call();
        iphoneSeven.connect();
        iphoneSeven.browse();

        System.out.println();

        System.out.println("2° iPhone status:");
        iphoneSeven.showStatus();

        System.out.println("===========================\n");

        iphoneSeven.pauseMusic();
        iphoneSeven.endCall();
        iphoneSeven.disconnect();
        iphoneSeven.browse();

        System.out.println();

        System.out.println("3° iPhone status:");
        iphoneSeven.showStatus();
    }
}
