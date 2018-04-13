package resource.soap;


import Bean.ProduitDto;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface CalculatorSoap {

    @WebMethod
    int somme(final int a, final int b);

    @WebMethod
    ProduitDto getProduit();
}
