public class Box {
    private double volume;
    private double berat;

    public Box() {
    }

    public Box(double volume, double berat) {
        this.volume = volume;
        this.berat = berat;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getBerat() {
        return berat;
    }

    public void setBerat(double berat) {
        this.berat = berat;
    }

    @Override
    public String toString() {
        return "Volume: " + volume + ", Berat: " + berat;
    }
}