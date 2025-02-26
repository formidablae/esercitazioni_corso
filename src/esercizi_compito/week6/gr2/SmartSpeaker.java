package esercizi_compito.week6.gr2;

public class SmartSpeaker extends SmartDevice{
    private boolean hasVoiceAssistant;

    public SmartSpeaker(String brand, String model, boolean hasVoiceAssistant) {
        super(brand, model);
        this.hasVoiceAssistant = hasVoiceAssistant;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SmartSpeaker that = (SmartSpeaker) o;
        return hasVoiceAssistant == that.hasVoiceAssistant;
    }

    @Override
    public int hashCode() {
        return super.hashCode() + (hasVoiceAssistant ? 1 : 0);
    }
}
