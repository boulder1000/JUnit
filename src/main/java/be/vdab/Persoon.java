package be.vdab;
import java.util.List;

public class Persoon {

    private final List<String> voornamen;

    public Persoon(List<String> voornamen) {
        this.voornamen = voornamen;
    }

    public void addVoornaam(String voornaam) {
        if (voornaam.isBlank()) {
            throw new IllegalArgumentException("Voornaam mag niet leeg zijn");
        }
        if (voornamen.contains(voornaam)) {
            throw new IllegalArgumentException("Voornaam al in de lijst");
        }
        voornamen.add(voornaam);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < voornamen.size(); i++) {
            sb.append(voornamen.get(i));
            if (i < voornamen.size() - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
