public class ImageLoaderFactory {

    public ImageLoader create(String imagePath){
        if(imagePath.contains(".jpg")){
            return new JPGImageLoader();
        }
        if(imagePath.contains(".bmp")){
            return new BMPImageLoader();
        }
        return null;
    }
}
