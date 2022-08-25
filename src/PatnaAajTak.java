public class PatnaAajTak implements AajTak {


    @Override
    public void onUpdate(News news) {
        System.out.println("Update received in PatnaAajTak from subject " + news.news);
    }

    @Override
    public News.NewsType getNewsType() {
        return News.NewsType.PATNA;
    }
}
