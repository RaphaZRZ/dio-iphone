package cellphone;

import browser.InternetBrowser;
import music.MusicPlayer;
import telephone.Telephone;

public class Iphone implements MusicPlayer, Telephone, InternetBrowser {
    private boolean isPlayingMusic = false;
    private boolean isCalling = false;
    private boolean isConnected = false;

    @Override
    public void playMusic() {
        System.out.println("Playing the music...");
        this.isPlayingMusic = true;
    }

    @Override
    public void pauseMusic() {
        System.out.println("Pausing the music...");
        this.isPlayingMusic = false;
    }

    @Override
    public void connect() {
        System.out.println("Connecting to the internet...");
        this.isConnected = true;
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnecting from the internet...");
        this.isConnected = false;
    }

    @Override
    public void browse() {
        if (isConnected)
            System.out.println("Browsing... Success");
        else
            System.out.println("Browsing... Error, out of signal!");
    }

    @Override
    public void call() {
        System.out.println("Calling...");
        this.isCalling = true;
    }

    @Override
    public void endCall() {
        System.out.println("Ending call...");
        this.isCalling = false;
    }

    public void showStatus() {
        System.out.printf("Playing Music: %s\nCalling: %s\nConnect to the internet: %s\n\n",
                this.isPlayingMusic, isCalling, isConnected);
    }
}