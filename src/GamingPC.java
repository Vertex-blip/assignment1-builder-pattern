public class GamingPC {
    private final String cpu;
    private final String gpu;
    private final int ramGb;
    private final int storageGb;
    private final String cooling;
    private final boolean rgbLighting;

    private GamingPC(Builder builder) {
        this.cpu = builder.cpu;
        this.gpu = builder.gpu;
        this.ramGb = builder.ramGb;
        this.storageGb = builder.storageGb;
        this.cooling = builder.cooling;
        this.rgbLighting = builder.rgbLighting;
    }

    public String getCpu() {
        return cpu;
    }

    public String getGpu() {
        return gpu;
    }

    public int getRamGb() {
        return ramGb;
    }

    public int getStorageGb() {
        return storageGb;
    }

    public String getCooling() {
        return cooling;
    }

    public boolean isRgbLighting() {
        return rgbLighting;
    }

    @Override
    public String toString() {
        return "GamingPC Specification:\n" +
                " - CPU: " + cpu + "\n" +
                " - GPU: " + gpu + "\n" +
                " - RAM: " + ramGb + "GB\n" +
                " - Storage: " + storageGb + "GB SSD\n" +
                " - Cooling: " + cooling + "\n" +
                " - RGB Lighting: " + (rgbLighting ? "Yes" : "No") + "\n";
    }

    public static class Builder {
        private String cpu;
        private String gpu;
        private int ramGb;
        private int storageGb;
        private String cooling = "Air";
        private boolean rgbLighting;

        public Builder setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder setGpu(String gpu) {
            this.gpu = gpu;
            return this;
        }

        public Builder setRamGb(int ramGb) {
            this.ramGb = ramGb;
            return this;
        }

        public Builder setStorageGb(int storageGb) {
            this.storageGb = storageGb;
            return this;
        }

        public Builder setCooling(String cooling) {
            this.cooling = cooling;
            return this;
        }

        public Builder setRgbLighting(boolean rgbLighting) {
            this.rgbLighting = rgbLighting;
            return this;
        }

        public GamingPC build() {
            if (cpu == null || gpu == null) {
                throw new IllegalStateException("CPU and GPU cannot be null");
            }
            return new GamingPC(this);
        }
    }
}