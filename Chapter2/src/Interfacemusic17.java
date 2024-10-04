package InheritanceInterface;

interface MusicPlayer {
    void playMusic();
    void stopMusic();
}

class MP3Player implements MusicPlayer {
    public void playMusic() {
        System.out.println("Playing music");
    }

    public void stopMusic() {
        System.out.println("Stopping music");
    }
}

class Interfacemusic17 {
    public static void main(String[] args) {
        MP3Player player = new MP3Player();
        player.playMusic();
        player.stopMusic();
    }
}

