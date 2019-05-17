
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.banque.entity.Client;
import org.banque.entity.Compte;
import org.banque.entity.CompteCourant;
import org.banque.entity.CompteEpargne;
import org.banque.entity.Entreprise;
import org.banque.entity.Particulier;
import org.banque.persistence.DAOCo;
import org.banque.persistence.DAOCompte;
import org.banque.persistence.DAOEnt;
import org.banque.persistence.DAOEntreprise;
import org.banque.persistence.DAOPar;
import org.banque.persistence.DAOParticulier;
import org.banque.service.BanqueServiceImplementation;
import org.banque.service.ClientService;
import org.banque.service.ClientServiceImplementation;
import org.banque.service.CompteService;
import org.banque.service.CompteServiceImplementation;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;


public class BanqueServiceImplementationTest {

	private BanqueServiceImplementation bsi;
	
	private ClientServiceImplementation cs;
			
	@Mock
	DAOCo daoco;
	
	@Mock 
	DAOPar daop;
	
	@Mock 
	DAOEnt daoe;
	

	
	private Client c1;
	private Client c2;
	private CompteCourant cco1;
	private CompteCourant cco2;
	private CompteEpargne cep1;
	private CompteEpargne cep2;
	private Compte c01;
	private Compte c02;
	
	@BeforeEach
	public void setup() {
		bsi = new BanqueServiceImplementation();
		bsi.setClientService(cs);
		daop = new DAOParticulier();
		daoe = new DAOEntreprise();
		daoco = new DAOCompte();
		cs.setDAOEntreprise(daoe);
		cs.setDAOParticulier(daop);
		c1= new Particulier();
		c2= new Entreprise();
		cco1 = new CompteCourant();
		cco2 = new CompteCourant();
		cep1 = new CompteEpargne();
		cep2 = new CompteEpargne();

	}
	
	@Test
	public void auditer_Should_Decline_Audit_If_Balance_Under_Limit_For_Particulier() {
		List<Client> lc = new ArrayList<Client>();
		c1.setCompteco(cco1);
		cco1.setSolde(-6000);
		lc.add(c1);
		when(cs.trouverToutClient()).thenReturn(lc);
		boolean result = bsi.auditer();
		verify(cs).trouverToutClient();
		assertFalse(result);
	}
	
	@Test
	public void auditer_Should_Accept_Audit_If_Balance_Over_Limit_For_Particulier() {
		List<Client> lc = new ArrayList<Client>();
		c1.setCompteco(cco1);
		cco1.setSolde(1000);
		lc.add(c1);
		when(cs.trouverToutClient()).thenReturn(lc);
		boolean result = bsi.auditer();
		verify(cs).trouverToutClient();
		assertTrue(result);
	}
	
	@Test
	public void virement_Should_Proceed_If_Remains_Over_Limit() {
		cco1.setSolde(4000);
		cco2.setSolde(500);
		when(daoco.afficherCompteParNumero(1L)).thenReturn(cco1);
		when(daoco.afficherCompteParNumero(2L)).thenReturn(cco2);
		boolean result = bsi.faireVirement(1L, 2L, 500L);
		verify(daoco.afficherCompteParNumero(1L));
		verify(daoco.afficherCompteParNumero(2L));
		assertTrue(result);
	}
	
//	@Test
//	public void virement_Should_Cancel_If_Remains_Over_Limit() {
//		cco1.setSolde(800);
//		cco2.setSolde(500);
//		boolean result = bsi.faireVirement(cco1, cco2, 2000L);
//		assertFalse(result);
//	}
}
