public class Rectangle {
    String color;
    int length;
    int width;


    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (obj == null || obj.getClass() != this.getClass()) {
            return false;


        }
        Rectangle r = (Rectangle) obj;
        return width == r.width
                && length == r.length
                && color == r.color;

    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + length;
        result = prime * result + width;
        result = prime * result + color.hashCode();
        return result;
    }

    public Rectangle(String color, int length, int width) {
        this.color = color;
        this.length = length;
        this.width = width;
    }
}