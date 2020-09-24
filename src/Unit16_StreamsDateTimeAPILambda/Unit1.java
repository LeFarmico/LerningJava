import java.time.*;
import java.util.Date;

public class Unit1 {
    public static void main(String[] args) {
        //Дата, Веремя и часовой пояс
        ZonedDateTime moscowTime = ZonedDateTime.of(LocalDateTime.now(), ZoneId.of("Europe/Moscow"));

        //Объект даты в старом формате
        Date date = new Date();

        //Время
        LocalTime time = LocalTime.of(16, 30);
        time = time.withHour(14).plusMinutes(15);

        //Шаблон изменения времени
        Duration timeDuration = Duration.ofHours(2);

        LocalTime changedTime = time.plus(timeDuration);
        boolean isCheckTime = checkTime(LocalTime.of(12,00), Duration.ofHours(2));

        System.out.println(moscowTime);
        System.out.println(time);
        System.out.println(changedTime);
        System.out.println(isCheckTime);
        System.out.println(changeToNewFormat(date));
    }
    //Метод возвращает true, если переданное время + промежуток больше текущего времени
    public  static boolean checkTime(LocalTime time, Duration duration){
        return time.plus(duration).isAfter(LocalTime.now());
    }

    //Метод переводит объект java.util.Date в объект LocalTime в вашем часовом поясе
    public static LocalTime changeToNewFormat (Date oldFormatDate){
        Instant instant = oldFormatDate.toInstant();
        return LocalTime.ofInstant(instant,ZoneId.systemDefault());
    }
}
