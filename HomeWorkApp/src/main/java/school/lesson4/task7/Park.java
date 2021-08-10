package school.lesson4.task7;

public class Park {
    private String title;
    private double price;
    private String workTime;

    public static class Builder {
        private String title;
        private double price;
        private String workTime;

        public Builder(String title, double price, String workTime) {
            this.title = title;
            this.price = price;
            this.workTime = workTime;
        }

        public String getTitle() {
            return title;
        }

        public Park build() {
            return new Park(this);
        }

        @Override
        public String toString() {
            return  "Аттракцион   " + '\'' + title + '\'' + "\n" +
                    "Стоимость:    " + price +"р. \n" +
                    "Время работы: " + workTime;
        }
    }

    private Park(Builder builder) {
        title = builder.title;
        price = builder.price;
        workTime = builder.workTime;
    }
}
