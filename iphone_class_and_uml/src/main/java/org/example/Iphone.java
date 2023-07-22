package org.example;

public class Iphone implements IMusicPlayer, IPhoneDevice, IInternetBrowser{
    //Music Player
    private boolean isPlaying;
    private String currentMusic;
    //Phone Device
    private boolean isCalling;
    private boolean isVoiceMail;
    //Internet Browser
    private int numTabs;
    private String currentUrl;


    //Music Player methods
    @Override
    public void play() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void selectMusic(String music) {

    }

    //Phone Device methods
    @Override
    public void call(String phoneNumber) {

    }

    @Override
    public void answerCall() {

    }

    @Override
    public void startVoiceMail() {

    }

    //Internet Browser methods
    @Override
    public void addNewTab() {
    }

    @Override
    public void displayPage(String url) {

    }

    @Override
    public void updatePage() {

    }
}
