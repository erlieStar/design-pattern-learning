package creational.factorymethod;

public class Test {

    public static void main(String[] args) {
        VideoFactory videoFactory = new JavaVideoFactory();
        Video video = videoFactory.getVideo();
        // 学习Java视频
        video.study();
    }
}
