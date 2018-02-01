package gabriel.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="tb_customer_account")
public class Cliente implements Comparable<Cliente> {

@Id	
@Column(name="id_customer") 
private int idCustomer ;


@Column(name="cpf_cnpj")
private int cpfCnpj;


@Column(name="nm_customer")
private String nmCurstomer;


@Column(name="is_active")
private Boolean isActive;


@Column(name="vl_total")
private int vlTotal;


public int getIdCustomer() {
	return idCustomer;
}

public void setIdCustomer(int idCustomer) {
	this.idCustomer = idCustomer;
}

public int getCpfCnpj() {
	return cpfCnpj;
}

public void setCpfCnpj(int cpfCnpj) {
	this.cpfCnpj = cpfCnpj;
}

public String getNmCurstomer() {
	return nmCurstomer;
}

public void setNmCurstomer(String nmCurstomer) {
	this.nmCurstomer = nmCurstomer;
}

public Boolean getIsActive() {
	return isActive;
}

public void setIsActive(Boolean isActive) {
	this.isActive = isActive;
}

public int getVlTotal() {
	return vlTotal;
}

public void setVlTotal(int vlTotal) {
	this.vlTotal = vlTotal;
}

@Override
public int compareTo(Cliente cli) {
	
	if(this.getVlTotal()  > cli.getVlTotal() ){
		return -1;
		
	}else{
		
		if(this.getVlTotal()  < cli.getVlTotal()){
			return 1;
		}else{
			return 0;
		}
			
	}
	
}

@Override
public String toString() {
	return "Cliente [idCustomer=" + idCustomer + ", cpfCnpj=" + cpfCnpj
			+ ", nmCurstomer=" + nmCurstomer + ", isActive=" + isActive
			+ ", vlTotal=" + vlTotal + "]";
}



	
	
	
	
	
}
