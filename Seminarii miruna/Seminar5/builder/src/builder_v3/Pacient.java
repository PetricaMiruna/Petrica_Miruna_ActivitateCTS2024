package builder_v3;

public class Pacient {
    private boolean patRabatabil;
    private boolean micDejunInclus;
    private boolean papuciDeCamera;
    private boolean halatPentruInterior;

    public Pacient(boolean patRabatabil, boolean micDejunInclus, boolean papuciDeCamera, boolean halatPentruInterior) {
        this.patRabatabil = patRabatabil;
        this.micDejunInclus = micDejunInclus;
        this.papuciDeCamera = papuciDeCamera;
        this.halatPentruInterior = halatPentruInterior;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pacient{");
        sb.append("patRabatabil=").append(patRabatabil);
        sb.append(", micDejunInclus=").append(micDejunInclus);
        sb.append(", papuciDeCamera=").append(papuciDeCamera);
        sb.append(", halatPentruInterior=").append(halatPentruInterior);
        sb.append('}');
        return sb.toString();
    }

    public static class PacientBuilder implements Builder{
        private boolean patRabatabil;
        private boolean micDejunInclus;
        private boolean papuciDeCamera;
        private boolean halatPentruInterior;

        public PacientBuilder() {
            this.patRabatabil=false;
            this.micDejunInclus=false;
            this.papuciDeCamera=false;
            this.halatPentruInterior=false;
        }

        @Override
        public Pacient build() {
            return new Pacient(patRabatabil, micDejunInclus, papuciDeCamera, halatPentruInterior);
        }

        public PacientBuilder setPatRabatabil(boolean patRabatabil){
            this.patRabatabil=patRabatabil;
            return this;
        }

        public PacientBuilder setMicDejunInclus(boolean micDejunInclus){
            this.micDejunInclus=micDejunInclus;
            return this;
        }

        public PacientBuilder setPapuciDeCamera(boolean papuciDeCamera){
            this.papuciDeCamera=papuciDeCamera;
            return this;
        }

        public PacientBuilder setHalatDeInterior(boolean halatDeInterior){
            this.halatPentruInterior=halatDeInterior;
            return this;
        }
    }
}
