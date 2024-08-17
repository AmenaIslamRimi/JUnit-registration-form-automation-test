import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils {
    public static void scroll(WebDriver driver) {
        // Scroll down
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1500 )");
    }

//    public static void main(String[] args) {
//        Date today = new Date();
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
//        String formattedDate = simpleDateFormat.format(today);
//        System.out.println(formattedDate);
//
//    }
}
