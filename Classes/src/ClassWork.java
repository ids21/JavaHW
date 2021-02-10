class Student {
    String name;
    int group;
    static int count=0;
    public void Print() {
        System.out.println(name);
    }
    public Student() {
        name="Sasha";
        group=1;
        //this ("fsf",1);
    }
    public Student(String n, int g){
        name =n;
        group =g;
        count++;
    }

}
public class ClassWork {
    public static void main(String[] args) {
        Student st;
        st = new Student("Lasda",23);

    }
}
//Задания
/*
Разработать класс Множество(класс уникалььных обьктов)
int [] elements;
int n;
Mnog();
Mnog(int n);
Mnog(int []elements);
Печать
boolean Add(int);
boolean Find(int);
boolean Delete(int);
==
union
intersect
разность

 */

