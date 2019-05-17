package org.banque.test;

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

/**
 * Classe BanqueServiceImplementationTest qui conetient l'ensemble des m�thodes
 * de test pour tester les m�thodes contenues dans la classe
 * BanqueServiceImplementation.
 * 
 * @author Marwa & Ihab
 *
 */
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

	/**
	 * M�thode permettant de param�trer les conditions dans lesquelles chaque test
	 * va �tre effectu� au sein de la classe BanqueServiceImplementationTest.
	 */
	@BeforeEach
	public void setup() {
		bsi = new BanqueServiceImplementation();
		daop = new DAOParticulier();
		daoe = new DAOEntreprise();
		daoco = new DAOCompte();
		cs = new ClientServiceImplementation();
		cs.setDAOEntreprise(daoe);
		cs.setDAOParticulier(daop);
		c1 = new Particulier();
		c2 = new Entreprise();
//		cco1 = new CompteCourant();
//		cco2 = new CompteCourant();
		cep1 = new CompteEpargne();
		cep2 = new CompteEpargne();

	}

	/**
	 * M�thode permettant de tester si un virement est bien effectu� lorsque les
	 * conditions m�tier sont respect�es
	 * 
	 */
	@Test
	public void virement_Should_Proceed_If_Remains_Over_Limit() {
//		cco1 = new CompteCourant();
//		cco2 = new CompteCourant();
//		cco1.setSolde(4000);
//		cco2.setSolde(500);
//		when(daoco.afficherCompteParNumero(1L)).thenReturn(cco1);
//		when(daoco.afficherCompteParNumero(2L)).thenReturn(cco2);
//		boolean result = bsi.faireVirement(1L, 2L, 500L);
//		verify(daoco.afficherCompteParNumero(1L));
//		verify(daoco.afficherCompteParNumero(2L));
		boolean result = bsi.faireVirement(1616168L, 654328L, 50L);
		assertTrue(result);
	}
	
	/**
	 * M�thode permettant de tester si un virement est bien refus� lorsque les
	 * conditions m�tier ne sont pas respect�es
	 * 
	 */
	@Test
	public void virement_Should_Not_Proceed_If_Remains_Over_Limit() {
//		cco1 = new CompteCourant();
//		cco2 = new CompteCourant();
//		cco1.setSolde(4000);
//		cco2.setSolde(500);
//		when(daoco.afficherCompteParNumero(1L)).thenReturn(cco1);
//		when(daoco.afficherCompteParNumero(2L)).thenReturn(cco2);
//		boolean result = bsi.faireVirement(1L, 2L, 500L);
//		verify(daoco.afficherCompteParNumero(1L));
//		verify(daoco.afficherCompteParNumero(2L));
		boolean result = bsi.faireVirement(1616168L, 654328L, 50000L);
		assertFalse(result);
	}
	
	
//	@Test
//	public void auditer_Should_Decline_Audit_If_Balance_Under_Limit_For_Particulier() {
//		List<Client> lc = new ArrayList<Client>();
//		c1.setCompteco(cco1);
//		cco1.setSolde(-6000);
//		lc.add(c1);
//		when(cs.trouverToutClient()).thenReturn(lc);
//		boolean result = bsi.auditer();
//		verify(cs).trouverToutClient();
//		assertFalse(result);
//	}
//	
//	@Test
//	public void auditer_Should_Accept_Audit_If_Balance_Over_Limit_For_Particulier() {
//		List<Client> lc = new ArrayList<Client>();
//		c1.setCompteco(cco1);
//		cco1.setSolde(1000);
//		lc.add(c1);
//		when(cs.trouverToutClient()).thenReturn(lc);
//		boolean result = bsi.auditer();
//		verify(cs).trouverToutClient();
//		assertTrue(result);
//	}

	

//	@Test
//	public void virement_Should_Cancel_If_Remains_Over_Limit() {
//		cco1.setSolde(800);
//		cco2.setSolde(500);
//		boolean result = bsi.faireVirement(cco1, cco2, 2000L);
//		assertFalse(result);
//	}
}
