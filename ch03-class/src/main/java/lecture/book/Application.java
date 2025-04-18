package lecture.book;

public class Application {
    public static void main(String[] args) {
        Book myBook = new Book();   // new는 heap에다가 공간을 만듦 -> heap에 Book이라는 공간이 생김
        
        myBook.title = "해리포터와 마법사의 돌";
        myBook.author= "조엔 K 롤링";
        myBook.coverType= "하드커버";
        myBook.pageCount = 320;

        // 제목을 해리포터와 혼혈왕자
        Book myBook2 = new Book();
        myBook2.title = "해리포터와 혼혈왕자";
        myBook2.author = "조엔 K 롤링";
        myBook2.coverType = "소프트커버";
        myBook2.pageCount = 320;

        myBook.getTitle();
        myBook2.getTitle();

        System.out.println(myBook2.toString());

        Book myBook3 = new Book("bear", "자바가 좋아요", "하드타입", 50);
    }
}
