public class DelhiAajTak implements AajTak {


    @Override
    public void onUpdate(News news) {
        System.out.println("Update received in DelhiAajTak from Subject " + news.news);
    }

    @Override
    public News.NewsType getNewsType() {
        return  News.NewsType.DELHI;
    }
}
