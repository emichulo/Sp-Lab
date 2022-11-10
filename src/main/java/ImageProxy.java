import java.awt.*;
import java.util.List;

public class ImageProxy implements Element, Picture{
    private String url;
    private Dimension dim;
    private Image realImage;

    public ImageProxy(String Url){
        url = Url;
    }

    @Override
    public void print() {
        loadImage();
        realImage.print();
    }

    @Override
    public void add(Element element) {

    }

    @Override
    public void remove(Element element) {

    }

    @Override
    public Element get(int index) {
        return null;
    }

    @Override
    public String url() {
        return null;
    }

    @Override
    public Dimension dim() {
        return null;
    }

    @Override
    public String content() {
        return null;
    }

    public Image loadImage(){
        if(realImage == null){
            realImage = new Image(url);
        }

        return realImage;
    }
}
