package business;

import core.loging.Logger;
import dataAccess.CategoryDao;
import entities.Category;

import java.util.List;

public class CategoryManager {
    private CategoryDao categoryDao;
    private Logger[] loggers;
    private List<Category> categories;

    public CategoryManager(CategoryDao categoryDao, Logger[] loggers, List<Category> categories) {
        this.categoryDao = categoryDao;
        this.loggers = loggers;
        this.categories = categories;
    }

    public void add(Category category) throws Exception {
        for (Category categories : categories) {
            if (categories.getCategoryName().equals(category.getCategoryName())) {
                throw new Exception("Kategori ismi tekrar edilemez");
            }
        }
        categoryDao.add(category);
        categories.add(category);

        for (Logger logger : loggers) {
            logger.log(category.getCategoryName());
        }
    }
}

