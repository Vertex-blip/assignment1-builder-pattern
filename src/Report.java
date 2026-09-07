public class Report {
    private final String title;
    private final String content;
    private final String author;
    private final String format;

    private Report(Builder builder) {
        this.title = builder.title;
        this.content = builder.content;
        this.author = builder.author;
        this.format = builder.format;
    }

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
        return "Report{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", author='" + author + '\'' +
                ", format='" + format + '\'' +
                '}';
    }

    public static class Builder {
        private String title;
        private String content;
        private String author;
        private String format;

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

        public Report build() {
            if (title == null || title.isEmpty()) {
                throw new IllegalStateException("Title is required");
            }
            return new Report(this);
        }
    }
}