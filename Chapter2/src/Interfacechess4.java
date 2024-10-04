interface Game {
    int PLAYER_COUNT = 4;
    void play();
}

class Chess implements Game {
    public void play() {
        System.out.println("Playing Chess with " + PLAYER_COUNT + " players.");
    }
}

class Interfacechess4 {
    public static void main(String[] args) {
        Chess chess = new Chess();
        chess.play();
    }
}

