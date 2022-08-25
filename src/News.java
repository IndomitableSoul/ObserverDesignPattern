public class News {
    enum NewsType{
        DELHI, MUMBAI, PATNA;
    }
    String news;
    NewsType type;

    public News(String news, NewsType type) {
        this.news = news;
        this.type = type;
    }
}
