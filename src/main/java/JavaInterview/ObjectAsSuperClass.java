package JavaInterview;

//Object class in java.lang package, sits at top of the class hierarchy tree.
// Every class is a descendant, direct or indirect of object class.

//Hashcode and Equals Method

import java.util.HashSet;
import java.util.Objects;

public class ObjectAsSuperClass {

    public String name;
    public int age;

    ObjectAsSuperClass(String n, int a) {
        this.name = n;
        this.age = a;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "ObjectAsSuperClass{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ObjectAsSuperClass)) return false;
        ObjectAsSuperClass that = (ObjectAsSuperClass) o;
        return getAge() == that.getAge() &&
                Objects.equals(getName(), that.getName());
    }
/*
    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge());
    }*/


    public static void main(String[] args) {

        ObjectAsSuperClass o1 = new ObjectAsSuperClass("abc", 24);
        ObjectAsSuperClass o2 = new ObjectAsSuperClass("abc", 25);
        ObjectAsSuperClass o3 = new ObjectAsSuperClass("abc", 24);

        HashSet<ObjectAsSuperClass> set = new HashSet<>();
        set.add(o1);
        System.out.println(set.contains(o3));
        System.out.println("o1.hascode(): " + o1.hashCode() + " o2.hashcode(): " + o3.hashCode());
        System.out.println("o1.equal(o2) : " + o1.equals(o2) + " o1.equals(o3) : " + o1.equals(o3));
    }

    //comment or uncomment hashcode method to see difference

/*
    Now can you see why if two objects are considered equal, their hashcodes must also be equal?
    Otherwise, you'd never be able to find the object since the default hashcode method in class Object virtually
    always comes up with a unique number for each object, even if the equals() method is overridden in such a way
    that two or more objects are considered equal. It doesn't matter how equal the objects are if their
    hashcodes don't reflect that. So one more time: If two objects are equal, their hashcodes must be equal as well.
*/


}

