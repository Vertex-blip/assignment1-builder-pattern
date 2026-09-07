public class Main {
    public static void main(String[] args) {
        // 1. Толық параметрлері бар есеп құрастыру (Method Chaining арқылы)
        Report annualReport = new Report.Builder()
                .setTitle("Жылдық қаржылық есеп")
                .setContent("Жылдық табыс 25%-ға ұлғайды.")
                .setAuthor("Алихан")
                .setFormat("PDF")
                .build();

        // 2. Кейбір параметрлері жоқ қарапайым есеп құрастыру
        Report quickReport = new Report.Builder()
                .setTitle("Жедел хабарлама")
                .setContent("Сервер сәтті іске қосылды.")
                .build();

        // Нәтижені консольге шығару
        System.out.println(annualReport);
        System.out.println(quickReport);
    }
}