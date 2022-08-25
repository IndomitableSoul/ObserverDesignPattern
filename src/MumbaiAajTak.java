public class MumbaiAajTak implements AajTak {


    public void onUpdate(News news){

        System.out.println("Update received in MumbaiAajTak from subject "+news.news);
    }

    @Override
    public News.NewsType getNewsType() {
        return News.NewsType.MUMBAI;
    }
}
