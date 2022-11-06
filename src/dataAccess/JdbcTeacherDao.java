package dataAccess;

import entities.Teacher;

public class JdbcTeacherDao implements TeacherDao{
    @Override
    public void add(Teacher teacher) {
        System.out.println("JDBC ile veritabanına eklendi " + teacher.getName());
    }
}
