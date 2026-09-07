public class Report {
    // Өнімнің (Product) сипаттамалары
    private final String title;
    private final String content;
    private final String author;
    private final String format;

    // Жабық (private) конструктор - сырттан тек Builder арқылы шақырылады
    private Report(Builder builder) {
        this.title = builder.title;
        this.content = builder.content;
        this.author = builder.author;
        this.format = builder.format;
    }

    // Тек оқуға арналған методтар (Getters)
    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getAuthor() {
        return author;
    }

    public String getFormat() {
        return format;
    }

    @Override
    public String toString() {
        return "Report: [Title: '" + title + "', Content: '" + content +
                "', Author: '" + author + "', Format: '" + format + "']";
    }

    // Ішкі Builder класы
    public static class Builder {
        private String title;
        private String content;
        private String author;
        private String format;

        // Clean Code ережесі: әр функция қысқа және тек бір міндет атқарады
        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setContent(String content) {
            this.content = content;
            return this;
        }

        public Builder setAuthor(String author) {
            this.author = author;
            return this;
        }

        public Builder setFormat(String format) {
            this.format = format;
            return this;
        }

        // Соңғы өнімді жинап шығаратын әдіс
        public Report build() {
            if (title == null || title.trim().isEmpty()) {
                throw new IllegalStateException("Қате: Report тақырыбы (title) бос болмауы керек!");
            }
            return new Report(this);
        }
    }
}