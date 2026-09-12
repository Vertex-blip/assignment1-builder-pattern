public class Main {
    public static void main(String[] args) {
        PCDirector director = new PCDirector();

        GamingPC gamingPC = director.buildGamingPC(new GamingPC.Builder());
        GamingPC budgetPC = director.buildBudgetPC(new GamingPC.Builder());

        GamingPC customPC = new GamingPC.Builder()
                .setCpu("Intel Core i7-14700K")
                .setGpu("NVIDIA RTX 4070 Ti")
                .setRamGb(32)
                .setStorageGb(1000)
                .setCooling("Liquid Cooling")
                .setRgbLighting(true)
                .build();

        System.out.println("Gaming PC:");
        System.out.println(gamingPC);

        System.out.println("Budget PC:");
        System.out.println(budgetPC);

        System.out.println("Custom PC:");
        System.out.println(customPC);
    }
}