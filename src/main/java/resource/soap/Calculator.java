package resource.soap;

import Bean.ProduitDto;
import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(endpointInterface = "resource.soap.CalculatorSoap")
public class Calculator implements CalculatorSoap {


    public Calculator() {
    }

    public int somme(int a, int b) {

        return a + b;
    }

    public ProduitDto getProduit() {
        final ProduitDto produitDto= new ProduitDto();
        System.out.println("ProduitDto: "+produitDto);
        produitDto.setId(10);
        produitDto.setDescription("Mock");
        return produitDto;
    }
}
