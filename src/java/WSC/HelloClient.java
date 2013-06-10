/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package WSC;

/**
 *
 * @author Juan
 */
import javax.xml.ws.WebServiceRef;

public class HelloClient {

    @WebServiceRef(wsdlLocation = "http://juan-pc:8080/PersonWS/PersonWS?wsdl")
    static RegisterBirth service;
    static FindByCedule buscar;
//    static HelloService service;

    public static void main(String[] args) {
        try {
            HelloClient client = new HelloClient();
            client.doTest(args);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void doTest(String[] args) {
        try {
//            System.out.println("Retrieving the port from the following service: " + service);
//            Hello port = service.getHelloPort();

//            buscar.setCedule(Long.MIN_VALUE);
//            service.setName("joselito");
//            System.out.println("nacio joselito");

            try {
                java.lang.String name1 = "";
                com.dataejbsra.ws.PersonWS_Service service = new com.dataejbsra.ws.PersonWS_Service();
                com.dataejbsra.ws.PersonWS port = service.getPersonWSPort();
                // TODO process result here
                com.dataejbsra.ws.ROb result = port.registerBirth("joselito");
                System.out.println("Result = " + result + result.isSuccess()+ "    ");
               
            } catch (Exception ex) {
                ex.printStackTrace();
            }

//            String name;
//            if (args.length > 0) {
//                name = args[0];
//            } else {
//                name = "No Name";
//            }
//
//            String response = port.sayHello(name);
//            System.out.println(response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}