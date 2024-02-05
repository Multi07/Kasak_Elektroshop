package elektroshop;

public class Fridge {




    public String znacka;
    public String model;
    public int rokVyroby;
    public Type mira;
    public String miravysledek;



    public Fridge(int rokVyroby, Type mira) {
        this.mira = mira;
        this.rokVyroby = rokVyroby;
    }

    public Type getMira() {
        return mira;
    }

    public String PrintInfo() {
        if (mira == Type.A) {
            miravysledek= "very low";
        }
        else if (mira == Type.B) {
            miravysledek= "low";
        }
        else if (mira == Type.C) {
            miravysledek= "normal";
        }
        else if (mira == Type.D) {
            miravysledek= "Above normal";
        }
        else if (mira == Type.E) {
            miravysledek= "high";
        }
        else if (mira == Type.F) {
            miravysledek= "very high";
        }
        else if (mira == Type.G) {
            miravysledek= "Extremely high";
        }

        return "Lednička byla vyrobena v roce "+rokVyroby+":"+miravysledek;
    }


}
