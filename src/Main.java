import business.CategoryManager;
import business.CourseManager;
import core.loging.DatabaseLogger;
import core.loging.FileLogger;
import core.loging.Logger;
import core.loging.MailLogger;
import dataAccess.JdbcCategoryDao;
import dataAccess.JdbcCourseDao;
import entities.Category;
import entities.Course;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        List<Course> courses = new ArrayList<>();
        Course course1 = new Course(1, "Java Yazılım Kursu", 100);
        Course course2 = new Course(2, "C Yazılım Kursu", 200);
        Course course3 = new Course(3, "Java Yazılım Kursu", -1);

        List<Category> categories = new ArrayList<>();
        Category categories1 = new Category(1, "Yazılım");
        Category categories2 = new Category(2, "İngilizce");
        Category categories3 = new Category(3, "İngilizce");

        Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};
        CourseManager courseManager = new CourseManager(new JdbcCourseDao(), loggers, courses);
        CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(), loggers, categories);

        courseManager.add(course1);
        courseManager.add(course2);
        courseManager.add(course3);
        categoryManager.add(categories1);
        categoryManager.add(categories2);
        categoryManager.add(categories3);

    }
}