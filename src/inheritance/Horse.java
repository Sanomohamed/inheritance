
package inheritance;

public class Horse {
    String name,color;
        int dataoB;

    public Horse(String name, String color, int dataoB) {
        this.name = name;
        this.color = color;
        this.dataoB = dataoB;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDataoB() {
        return dataoB;
    }

    public void setDataoB(int dataoB) {
        this.dataoB = dataoB;
    }
  
}
