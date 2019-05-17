
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import org.banque.entity.Client;
import org.banque.entity.Entreprise;
import org.banque.entity.Particulier;
import org.banque.persistence.DAOEntreprise;
import org.banque.persistence.DAOParticulier;
import org.banque.service.ClientServiceImplementation;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;


/**
 * Classe ClientServiceImplementationTest qui conetient l'ensemble des 
 * méthodes de test pour tester les méthodes contenues dans la classe
 * ClasseServiceImplementation.
 * 
 * @author Marwa & Ihab
 *
 */
public class ClientServiceImplementationTest {

	private static final long ID = 1L;
	private Particulier p;
	private Entreprise e;
	
	@Mock
	DAOEntreprise daoe;
	
	@Mock
	DAOParticulier daop;
	
	private ClientServiceImplementation csi;
	
	
	/**
	 * Méthode permettant de paramétrer les conditions dans lesquelles chaque
	 * test va être effectué.
	 */
	@BeforeEach
	public void setup() {
		MockitoAnnotations.initMocks(this);
		csi = new ClientServiceImplementation();
		csi.setDAOEntreprise(daoe);
		csi.setDAOParticulier(daop);
	}
	
	/**
	 * Méthode permettant de tester si la recherche d'un client particulier
	 * retourne bien un client particulier.
	 * 
	 */
	@Test
	public void trouverClient_Should_Find_A_Client_If_Particulier() {
		p = new Particulier();
		when(daop.afficherClientParId(ID)).thenReturn(p);
		boolean result = p.equals(csi.trouverClient(ID));
		verify(daop).afficherClientParId(ID);
		assertTrue(result);
	}
	
	/**
	 * Méthode permettant de tester si la recherche d'un client entreprise
	 * retourne bien un client entreprise.	 
	 *  
	 */
	@Test
	public void trouverClient_Should_Find_A_Client_If_Entreprise() {
		e = new Entreprise();
		when(daoe.afficherClientParId(ID)).thenReturn(e);
		boolean result = e.equals(csi.trouverClient(ID));
		verify(daoe).afficherClientParId(ID);
		assertTrue(result);
	}
	
	/**
	 * Méthode permettant de tester si la recherche d'un client particulier
	 * ne retourne pas de client lorsque le client trouvé est un entreprise.
	 * 
	 */
	@Test
	public void trouverClient_Should_Not_Find_A_Client_If_Entreprise() {
		e = new Entreprise();
		p = new Particulier();
		when(daop.afficherClientParId(ID)).thenReturn(p);
		boolean result = e.equals(csi.trouverClient(ID));
		verify(daop).afficherClientParId(ID);
		assertFalse(result);
	}
	
	/**
	 * Méthode permettant de tester si la recherche d'un client entreprise
	 * ne retourne pas de client lorsque le client trouvé est un particulier.
	 * 
	 */
	@Test
	public void trouverClient_Should_Not_Find_A_Client_If_Particulier() {
		e = new Entreprise();
		p = new Particulier();
		when(daoe.afficherClientParId(ID)).thenReturn(e);
		boolean result = p.equals(csi.trouverClient(ID));
		verify(daoe).afficherClientParId(ID);
		assertFalse(result);
	}
	
	/**
	 * Méthode permettant de tester si la recherche de la liste de Client
	 * retourne bien une liste de Clients.
	 * 
	 */
	@Test
	public void trouverToutClient_Should_Return_A_Client_List() {
		List<Client> lc = new ArrayList<Client>();
		List<Client> lcp = new ArrayList<Client>();
		List<Client> lce = new ArrayList<Client>();
		when(daop.afficherTout()).thenReturn(lcp);
		when(daoe.afficherTout()).thenReturn(lce);
		boolean result = lc.equals(csi.trouverToutClient());
		verify(daoe).afficherTout();
		verify(daop).afficherTout();
		assertTrue(result);
	}
	

}
