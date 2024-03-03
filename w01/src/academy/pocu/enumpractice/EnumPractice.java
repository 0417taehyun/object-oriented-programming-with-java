package academy.pocu.enumpractice;

enum Season {
    SPRING("Spring"),
    SUMMER("Summer"),
    FALL("Fall"),
    WINTER("Winter");

    private String season;
    public String getSeason() {
        return season;
    }

    Season(String season) { // 언제나 private
        this.season = season;
    }

    public static void main(String[] args) {
        Season spring = Season.SPRING;
        System.out.printf("Season: %s %s", spring.getSeason(), System.lineSeparator());
    }
}

public class EnumPractice {
}
