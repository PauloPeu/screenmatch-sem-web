package br.com.alura.screenmatch;

import br.com.alura.screenmatch.principal.Principal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

//		var consumoApi = new ConsumoAPI();
//		//modelando séries
//		var json = consumoApi.obterDados("https://www.omdbapi.com/?t=heroes&apikey=9101b678");
//		System.out.println(json);
//		ConverteDados conversor = new ConverteDados();
//		DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
//		System.out.println(dados);
//
//		// modelando episódios
//		json = consumoApi.obterDados("https://omdbapi.com/?t=heroes&season=1&episode=2&apikey=6585022c");
//		DadosEpisodio dadosEpisodio = conversor.obterDados(json, DadosEpisodio.class);
//		System.out.println(dadosEpisodio);

//		// modelando temporadas
//		List<DadosTemporadas> temporadas= new ArrayList<>();
//		for (int i = 1; i <= dados.totalTemporadas(); i++) {
//			json = consumoApi.obterDados("https://omdbapi.com/?t=heroes&season=" + i + "&apikey=6585022c");
//			DadosTemporadas dadosTemporadas = conversor.obterDados(json, DadosTemporadas.class);
//			temporadas.add(dadosTemporadas);
//		}
//		temporadas.forEach(System.out::println);

		Principal principal = new Principal();
		principal.exibeMenu();

		//Exemplo com dados genéricos
		//System.out.println(json);
		//json = consumoApi.obterDados("https://coffee.alexflipnote.dev/random.json");
	}
}
