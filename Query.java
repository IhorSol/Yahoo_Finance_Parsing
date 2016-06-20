package XML.HomeWork.Task3;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Ihor Solohub.
 */
@XmlRootElement(name = "query")
public class Query {

    @XmlElement(name = "results")
    private Results results;

    public Query() {
    }

    public Results getResults() {
        return results;
    }

    @Override
    public String toString() {
        return "Query " + results;
    }
}
