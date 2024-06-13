import Ingredientes.Pan;
import Ingredientes.Carne.Carne;
import Ingredientes.Extras.Extras;

import java.util.ArrayList;
import java.util.List;

public class Hamburguesa {
    private Pan pan;
    private Carne carne;
    private List<Extras> extras;

    public Hamburguesa() {
        extras = new ArrayList<>();
    }

    public void setPan(Pan pan) {
        this.pan = pan;
    }

    public void setCarne(Carne carne) {
        this.carne = carne;
    }

    public void addExtra(Extras extra) {
        extras.add(extra);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(pan.representacion()).append("\n");
        sb.append(carne.representacion()).append("\n");
        for (Extras extra : extras) {
            sb.append(extra.representacion()).append("\n");
        }
        sb.append(pan.representacion()).append("\n");
        return sb.toString();
    }
}
