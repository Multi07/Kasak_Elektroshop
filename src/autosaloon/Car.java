package autosaloon;

public class Car {

    public enum condition {
        bad,
        good,
        damaged,
        excellent;
    }
    public int rokVyroby;
    public int ujeteKM;
    public String barva;
    public String condition;

    public Car(int rokVyroby, int ujeteKM, String barva, String condition) {
        this.rokVyroby = rokVyroby;
        this.ujeteKM = ujeteKM;
        this.barva = barva;
        this.condition = condition;
    }

    public int getRokVyroby() {
        return rokVyroby;
    }

    public int getUjeteKM() {
        return ujeteKM;
    }

    public String getBarva() {
        return barva;
    }

    public String getCondition() {
        return condition;
    }

    public String printinfo() {
        return "Auto bylo vyrobeno v roce "+rokVyroby+" Ujelo "+ujeteKM+" Km a je "+barva+", jeho condice je "+condition;
    }

}


