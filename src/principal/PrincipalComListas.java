package principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.jogos.jogo.Jogo;
import br.com.jogos.modelos.Digital;
import br.com.jogos.modelos.Tabuleiro;

public class PrincipalComListas {
	public static void main(String[] args) {
		
		Digital red = new Digital("Red Dead Redemption");	
		red.curte(1100);
		Digital cod = new Digital("Call of Duty");
		cod.curte(300);
		Tabuleiro war = new Tabuleiro("War");	
		war.curte(650);
		
		ArrayList<Jogo> listaDeAssistidos = new ArrayList<>();
		listaDeAssistidos.add(red);
		listaDeAssistidos.add(cod);
		listaDeAssistidos.add(war);
		Collections.sort(listaDeAssistidos);
		
		for(Jogo item : listaDeAssistidos) {
		    System.out.println("Nome: " + item.getTitulo());
		    if (item instanceof Digital filme && filme.getClassificacao() > 5) {
		        System.out.println("Classificação: " +filme.getClassificacao());
		    }
		}
		
		List<String> buscarDesenvolvedor = new ArrayList<>();
		buscarDesenvolvedor.add("Rockstar Games");
		buscarDesenvolvedor.add("Activision");
		buscarDesenvolvedor.add("Sony");
		Collections.sort(buscarDesenvolvedor);
		System.out.println(buscarDesenvolvedor);
		
		
		
		
		
		
		
	}
}