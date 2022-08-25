import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CentalAajTak {

    List<AajTak> observers = new ArrayList<>();

    public void registerObserver(AajTak observer){
        this.observers.add(observer);
    }

    public void updateObserver(News news){


//        AajTak aajTak = observers.stream().filter(observer -> observer.getNewsType() == news.type).findFirst().orElse(null);
//        aajTak.onUpdate(news);

        observers.stream().filter(observer -> observer.getNewsType() == news.type).forEach(observers -> observers.onUpdate(news));
        //observers.forEach(observer -> observer.onUpdate(news));
//        observers.forEach(observer ->
//        {
//
//            if(observer.getNewsType() == news.type){
//
//
//                observer.onUpdate(news);
//            }
//        });
    }

    public void unregisterObserver(AajTak observer){
        this.observers.remove(observer);
    }
}
