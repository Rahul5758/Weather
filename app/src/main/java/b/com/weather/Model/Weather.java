package b.com.weather.Model;

/**
 * Created by Thapliyal on 1/26/2018.
 */

public class Weather {

    private int ID;
    private String main;
    private String description;
    private String icon;

    public Weather(int id, String main, String description, String icon) {
        ID = id;
        this.main = main;
        this.description = description;
        this.icon = icon;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getMain() {
        return main;
    }

    public void setMain(String main) {
        this.main = main;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}
