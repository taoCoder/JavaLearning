package Chapter20170811;

/**
 * Created by huangtao8 on 2017/8/24.
 */
public class Dog {
    private String name;

    private String color;

    private String type;

    public Dog(String name, String color, String type) {
        this.name = name;
        this.color = color;
        this.type = type;
    }

    public void wagTail(){
        System.out.println(this.name+"摇尾巴");
    }

    public void eat(){
        System.out.println(this.name+"啃骨头");
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
