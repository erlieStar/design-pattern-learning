package com.javashitang.creational.abstractfactory;

public class Test {

    public static void main(String[] args) {
        CourseFactory courseFactory = new JavaCourseFactory();
        Video video = courseFactory.getVideo();
        Article article = courseFactory.getArticle();
        // 学习Java视频
        video.study();
        // 学习Java笔记
        article.study();
    }
}
