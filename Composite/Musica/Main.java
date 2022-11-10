public class Main {
    
    public static void main(String[] args) {
        PlayList playList = new PlayList("Musgas 2.0");
        playList.adicionar(new Musica("Non Stop","Jonny", 1.00f));
        playList.adicionar(new Musica("Close eyes", "DVRST", 1.00f));
        playList.adicionar(new PodCast("NerdCast1000", "Nando Moura", 1.00f));

        playList.tocar();
    }
}
