import java.net.URL;

/**
 * 代理模式 可以先加载一个图片来代替真实的图片 等待图片加载好了之后再重新加载一下
 */
public class ImageViewer {

    public static void main(String[] args) throws Exception {
        String image = "http://image.jpg";
        URL url = new URL(image);
        HighResolutionImage highResolutionImage = new HighResolutionImage(url);
        ImageProxy imageProxy = new ImageProxy(highResolutionImage);
        imageProxy.showImage();
    }
}