package InheritanceInterface;

interface Game {
    int MAX_SCORE = 100;

    void play();
}

class Football implements Game {
    public void play() {
        System.out.println("Playing Football. Max Score: " + MAX_SCORE);
    }
}

class Interface16 {
    public static void main(String[] args) {
        Football football = new Football();
        football.play();
    }
}

