package gabriel.App;

import gabriel.Model.Cliente;
import gabriel.Service.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;




public class RunApp {

	public static void main(String[] args) {
		
	Random valor = new Random();	
	Service objService = new Service();	
    BigDecimal soma = new BigDecimal("0.00");
	BigDecimal media = null ;
    
		for(int ind =0 ; ind < 3000;ind++){
			
		Cliente ObjCliente = new Cliente();	
			
		ObjCliente.setIdCustomer(ind);
		ObjCliente.setIsActive(Boolean.valueOf(true));	
		ObjCliente.setNmCurstomer("cliente"+ind);	
		ObjCliente.setVlTotal(valor.nextInt(1000));
		objService.Save(ObjCliente);
		}
		
		
		
  List<Cliente> clientes = objService.ListarTodos();
		
		
		
 clientes = clientes.stream().sorted((c1,c2) ->  c1.compareTo(c2) ).
  filter(c -> (c.getVlTotal() > 560) && ((c.getIdCustomer() >= 1500) && (c.getIdCustomer() <= 2500)) )
 .collect(Collectors.toList());
		
  
  
   
  
 
    clientes.stream().forEach(   c -> System.out.println(c.toString()) );
 
    
    for(Cliente objCliente : clientes){
    	
    	soma = soma.add( new BigDecimal( objCliente.getVlTotal()));
    	
    }
    
    media = soma.divide(new BigDecimal( String.valueOf(clientes.size())),0   );
    
	System.out.println("Media -> "+media);



		  
		

	}
	
	
	
	
	

}




