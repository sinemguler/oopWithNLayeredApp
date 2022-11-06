package dataAccess;

import entities.Teacher;

public class HibernateTeacherDao implements TeacherDao{
    @Override
    public void add(Teacher teacher) {
        System.out.println("Hibernate ile veritabanına eklendi " + teacher.getName());
    }
}
