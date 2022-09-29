package core.basesyntax;

public abstract class Figure implements FirugeInformation, areaOfFigure {

    private String color;

    public Figure() {

    }

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}