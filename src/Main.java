public class Main {
    public static void main(String[] args) {
        Report fullReport = new Report.Builder()
                .setTitle("Financial Report")
                .setContent("Revenue increased by 20%")
                .setAuthor("Alikhan")
                .setFormat("PDF")
                .build();

        Report quickReport = new Report.Builder()
                .setTitle("Status Update")
                .setContent("Task completed successfully")
                .build();

        System.out.println(fullReport);
        System.out.println(quickReport);
    }
}
