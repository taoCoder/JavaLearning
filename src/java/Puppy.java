import java.lang.*;

public class Puppy {
    int puppyAge;
    public Puppy(String name){
        System.out.println("小狗的名字是："+name);
    }
    public void setAge(int age){
        puppyAge=age;
    }
    public int getAge(){
        System.out.println("小狗的名字是："+puppyAge);
        return puppyAge;
    }
    public static void main(String[] args){
        Puppy myPuppy=new Puppy("huangtao");
        myPuppy.setAge(3);
        myPuppy.getAge();
        System.out.println("变量值是："+ myPuppy.puppyAge);
    }
}
