public class PCDirector {
    public GamingPC buildGamingPC(GamingPC.Builder builder) {
        return builder
                .setCpu("Intel Core i9-14900K")
                .setGpu("NVIDIA RTX 4090")
                .setRamGb(64)
                .setStorageGb(2000)
                .setCooling("Liquid Cooling")
                .setRgbLighting(true)
                .build();
    }

    public GamingPC buildBudgetPC(GamingPC.Builder builder) {
        return builder
                .setCpu("AMD Ryzen 5 7600")
                .setGpu("NVIDIA RTX 4060")
                .setRamGb(16)
                .setStorageGb(512)
                .build();
    }
}