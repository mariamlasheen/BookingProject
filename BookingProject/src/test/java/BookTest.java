import org.example.BookPage;
import org.testng.annotations.Test;

public class BookTest extends BaseTest{
    BookPage bookPage = new BookPage(driver);

    @Test(priority = 0, enabled = true)
    private void checkLink() throws InterruptedException {
        bookPage.setFrom();
        bookPage.setTo();
        bookPage.chooseDay();
        bookPage.clickOnSearch();
        bookPage.SelectSeat();
        bookPage.scroll();
        bookPage.selectSet();
        bookPage.clickChooseBoardPointAndDropPoint();
        bookPage.EnterData();
        bookPage.cardInfo();





    }

}
