package creational.abstractfactory;

public class JavaCourseFactory extends CourseFactory {
    public Video getVideo() {
        return new JavaVideo();
    }

    public Article getArticle() {
        return new JavaArticle();
    }
}
