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
        if(!isPlaying){
            System.out.println("Music playing.");
            isPlaying = true;
        } else{
            System.out.println("Music is already playing.");
        }
    }

    @Override
    public void pause() {
        if(isPlaying){
            System.out.println("Music paused.");
            isPlaying = false;
        } else{
            System.out.println("No music is playing to pause.");
        }
    }

    @Override
    public void selectMusic(String music) {
        currentMusic = music;
        System.out.println("Selected music: " + music);
    }

    //Phone Device methods
    @Override
    public void call(String phoneNumber) {
        if(!isCalling){
            System.out.println("Calling " + phoneNumber);
            isCalling = true;
        } else{
            System.out.println("Already on call.");
        }
    }

    @Override
    public void answerCall() {
        if(isCalling){
            System.out.println("Call answered.");
            isCalling = false;
        } else{
            System.out.println("No incoming call to answer.");
        }
    }

    @Override
    public void startVoiceMail() {
        if(!isVoiceMail){
            System.out.println("Voice mail started.");
            isVoiceMail = true;
        } else{
            System.out.println("Voice mail is already active.");
        }
    }

    //Internet Browser methods
    @Override
    public void displayPage(String url) {
        currentUrl = url;
        System.out.println("Displaying page: " + url);
    }

    @Override
    public void addNewTab() {
        numTabs++;
        System.out.println("Added a new tab. Total tabs: " + numTabs);
    }

    @Override
    public void updatePage() {
        System.out.println("Page updated: " + currentUrl);
    }
}
