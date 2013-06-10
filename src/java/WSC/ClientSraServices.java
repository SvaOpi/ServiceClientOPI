/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package WSC;

import com.dataejbsra.ws.ROb;

/**
 *
 * @author Juan
 */
public class ClientSraServices {

    public ROb ValidarLogin(Long personCedule, Long companyId) {

        try {
//            java.lang.Long personCedule = 0;
//            java.lang.Long companyId = 0;
            java.lang.String personPassword = "";
            com.dataejbsra.ws.CompanyPersonWS_Service service = new com.dataejbsra.ws.CompanyPersonWS_Service();
            com.dataejbsra.ws.CompanyPersonWS port = service.getCompanyPersonWSPort();
            // TODO process result here
            com.dataejbsra.ws.ROb result = port.validateRelation(personCedule, companyId, personPassword);
            System.out.println("Result = " + result);
                    return result;

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public ROb EncontrarPersonaPorId(Long cedule) {

        try {
//            java.lang.Long cedule = 0;
            com.dataejbsra.ws.PersonWS_Service service = new com.dataejbsra.ws.PersonWS_Service();
            com.dataejbsra.ws.PersonWS port = service.getPersonWSPort();
            // TODO process result here
            com.dataejbsra.ws.ROb result = port.findByCedule(cedule);
            System.out.println("Result = " + result);
                    return result;

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
