package Util;

public abstract class AbstractStarter {

    private final AbstractStarter singleton;
    private final String year;
    private final String day;
    private final String name;
    private final String input;

    public AbstractStarter(String year, String day, String name, String path){
        this.year = year;
        this.day = day;
        this.input = path;
        this.name = name;
        this.singleton = this;
    }

    public abstract void run();

    public String getInput() {
        return input;
    }

    public String getDay() {
        return day;
    }

    public String getYear() {
        return year;
    }

    public String getName() {
        return name;
    }

    public AbstractStarter getSingleton() {
        return singleton;
    }
}
