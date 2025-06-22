
public class Nicecar {

    private Engine engine;
    private Media player = new CDPlayer();

    public Nicecar() {
        engine = new PowerEngine();
    }

    public Nicecar(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        engine.start();
    }

    public void stop() {
        engine.stop();
    }

    public void acc() {
        engine.acc();
    }

    public void play(){
        player.start();
    }

    public void pause() {
        player.stop();
    }

    public void upgradeEngine() {
        this.engine = new ElectricEngine();
    }



}
