package XML.HomeWork.Task3;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author Ihor Solohub.
 */
public class Runner {
    public static void main(String[] args) {

        try {
            URL url = new URL("http://query.yahooapis.com/v1/public/yql?format=xml&q=select%20*%20from%20" +
                    "yahoo.finance.xchange%20where%20pair%20in%20(\"USDEUR\",%20\"USDUAH\")&env=store://datatables.org/alltableswithkeys");

            JAXBContext jaxbContext = JAXBContext.newInstance(Query.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            Query query = (Query) unmarshaller.unmarshal(url);
            System.out.println(query.getResults().getRates());

        } catch (JAXBException e) {
            e.printStackTrace();
        }catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
