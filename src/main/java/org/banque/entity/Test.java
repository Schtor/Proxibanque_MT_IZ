package org.banque.entity;

import org.banque.persistence.DAOScenario;
import org.banque.service.BanqueService;
import org.banque.service.BanqueServiceImplementation;
import org.banque.service.CompteService;
import org.banque.service.CompteServiceImplementation;

public class Test {

	public static void main(String[] args) {
//		DAOScenario dao = new DAOScenario();
//		
//		dao.scenario();
//		
		BanqueService bs = new BanqueServiceImplementation();
		
		Compte cco = new CompteCourant(525, 1L, "uob");
		
		Compte ce = new CompteEpargne(200, 2L, "b");
		
		bs.faireVirement(cco, ce,300L);
		
		System.out.println("je suis le main");
		
	}

}
