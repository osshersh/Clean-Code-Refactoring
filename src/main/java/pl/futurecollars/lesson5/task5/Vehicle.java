package pl.futurecollars.lesson5.task5;

public class Vehicle implements Engine {
    private boolean engineStarted;

    public void startEngine() {
        if (!engineStarted) {
            engineStarted = true;
        }
    }

    public void stopEngine() {
        if (engineStarted) {
            engineStarted = false;
        }
    }

    public boolean isEngineStarted() {
        return engineStarted;
    }

    public void setEngineStarted(boolean engineStarted) {
        this.engineStarted = engineStarted;
    }
}
