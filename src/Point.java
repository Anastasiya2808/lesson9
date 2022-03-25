
import java.util.Objects;

// все классы в языке наследуются в Object
// implements Cloneable - необходим , если происходит вызов метода
// clone родителя - Object, т.е super.clone()
public class Point {
    private int x;
    private int y;

    public Point (int x, int y){
        setX(x);
        setY(y);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    // другой вариант генерации equals
    /* @Override
   * public boolean equals(Object o) {
   *  if (this == o) return true;
   *  if (o == null || getClass() != o.getClass()) return false;
   * Point point = (Point) o;
   * return x == point.x && y == point.y;
     } */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Point)) return false;
        Point point = (Point) o;
        return x == point.x && y == point.y;
    }

    @Override
    public int hashCode(){
        return Objects.hash(x,y);
    }

    @Override
    public Point clone(){
        try {
            return (Point) super.clone(); // если примитивы в данных
        } catch (CloneNotSupportedException e){
            e.printStackTrace();
            return null;
        }
    }


    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

}
