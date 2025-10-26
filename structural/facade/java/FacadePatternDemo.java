// 1. The complex subsystem classes
class Projector {
    public void on() {
        System.out.println("Projector is on");
    }
    public void off() {
        System.out.println("Projector is off");
    }
    public void setInput(String input) {
        System.out.println("Projector input set to " + input);
    }
}

class Screen {
    public void down() {
        System.out.println("Screen is down");
    }
    public void up() {
        System.out.println("Screen is up");
    }
}

class SoundSystem {
    public void on() {
        System.out.println("Sound system is on");
    }
    public void off() {
        System.out.println("Sound system is off");
    }
    public void setVolume(int level) {
        System.out.println("Sound system volume set to " + level);
    }
}

class DvdPlayer {
    public void on() {
        System.out.println("DVD Player is on");
    }
    public void off() {
        System.out.println("DVD Player is off");
    }
    public void play(String movie) {
        System.out.println("Playing movie: \"" + movie + "\"");
    }
}

// 2. The Facade class
class HomeTheaterFacade {
    private Projector projector;
    private Screen screen;
    private SoundSystem soundSystem;
    private DvdPlayer dvdPlayer;

    public HomeTheaterFacade(Projector projector, Screen screen, SoundSystem soundSystem, DvdPlayer dvdPlayer) {
        this.projector = projector;
        this.screen = screen;
        this.soundSystem = soundSystem;
        this.dvdPlayer = dvdPlayer;
    }

    // A simplified method to watch a movie
    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        screen.down();
        projector.on();
        projector.setInput("DVD");
        soundSystem.on();
        soundSystem.setVolume(11);
        dvdPlayer.on();
        dvdPlayer.play(movie);
    }

    // A simplified method to end the movie
    public void endMovie() {
        System.out.println("\nShutting movie theater down...");
        dvdPlayer.off();
        soundSystem.off();
        projector.off();
        screen.up();
    }
}

// 3. The Client code
public class FacadePatternDemo {
    public static void main(String[] args) {
        // Instantiate the subsystem components
        Projector projector = new Projector();
        Screen screen = new Screen();
        SoundSystem soundSystem = new SoundSystem();
        DvdPlayer dvdPlayer = new DvdPlayer();

        // Create the facade with the subsystem components
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(projector, screen, soundSystem, dvdPlayer);

        // Use the simplified interface
        homeTheater.watchMovie("Raiders of the Lost Ark");
        homeTheater.endMovie();
    }
}
