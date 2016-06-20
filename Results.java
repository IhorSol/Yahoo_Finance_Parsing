package XML.HomeWork.Task3;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Ihor Solohub.
 */
@XmlRootElement(name = "results")
public class Results {

    @XmlElement(name = "rate")
    private List<Rate> rates = new ArrayList<>();

    public Results() {
    }

    public List<Rate> getRates() {
        return rates;
    }

    @Override
    public String toString() {
        return "Results " +
                " rates: " + rates;
    }
}
