package study.basic.CRUDList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * Created by andy on 07/03/2017.
 */
public class SwitchList {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<Student>();
        students.add(new Student("Tom",5,0));//name ,age ,id
        students.add(new Student("Jerry",6,1));


        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("请输入编号：0 新增；1 删除；2 修改；3 遍历");
            int i = sc.nextInt();
            switch (i){
                case 0:
                    System.out.println("请输入学号:");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.println("请输入姓名:");
                    String name=sc.nextLine();
                    System.out.println("请输入年纪:");
                    int age = sc.nextInt();

                    Student student = new Student(name,id,age);
                    students.add(student);
                    System.out.println("新增用户成功："+student.toString());
                    break;
                case 1:
                    System.out.println("请输入要删除学生的学号：");
                    id = sc.nextInt();
                    Iterator<Student> iterator = students.iterator();
                    while (iterator.hasNext()){
                        Student student1 = iterator.next();
                        if(student1.getId() == id){
                            System.out.println("删除："+student1.toString());
                            iterator.remove();
                            break;
                        }
                    }
                    break;
                case 2:
                    System.out.println("请输入学生学号:");
                    id = sc.nextInt();
                    sc.nextLine();
                    System.out.println("请输入姓名:");
                    name=sc.nextLine();
                    System.out.println("请输入年纪:");
                    age = sc.nextInt();
                    iterator = students.iterator();
                    while (iterator.hasNext()){
                        Student student1 = iterator.next();
                        if(student1.getId() == id){
                            student1.setName(name);
                            student1.setAge(age);
                            break;
                        }
                    }
                    break;
                case 3:
                    for (Student s:students
                         ) {
                        System.out.println(s);
                    }
                    break;
                default:
                    System.out.println("请输入编号：0 新增；1 删除；2 修改；3 遍历");
            }




        }






    }
}
