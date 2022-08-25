public class MainClass {

    public static void main(String[] args) {
        AajTak observer1 = new MumbaiAajTak();
        AajTak observer2 = new DelhiAajTak();
        AajTak observer3 = new PatnaAajTak();

        CentalAajTak centalAajTak = new CentalAajTak();
        centalAajTak.registerObserver(observer1);
        centalAajTak.registerObserver(observer2);
        centalAajTak.registerObserver(observer3);

        News news1 = new News("Heavy rain in Delhi", News.NewsType.DELHI);
        centalAajTak.updateObserver(news1);

        centalAajTak.unregisterObserver(observer2);
        System.out.println("**********");

        News news2 = new News("Rains stopped in Mumbai", News.NewsType.MUMBAI);

        centalAajTak.updateObserver(news2);
    }
}
//the observer design pattern is
//utilized for any time taking operations like connecting to a server or any d/b transaction
//filtering or processing a list or reading writing to a file


//here we have one to many communication b/w one subject and multiple observers
//All the observers have to register with the subject
//i.e their instance should be created in the subject

//https://www.digitalocean.com/community/tutorials/observer-design-pattern-in-java