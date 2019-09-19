package Uri;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URI;
import java.net.URISyntaxException;

public class Url {
	private String url;
	private String html;
	Pessoa pessoa = new Pessoa();
	
	public String getHtml() {
		return html;
	}

	public void setHtml() {
		this.html = retornaHtml();
	}

	public String getUrl() {
		return url;
	}
	
	public Url(String url) {
		setUrl(url);
		setHtml();
	}

	public void setUrl(String url) {
		this.url = url;
	}
	public String retornaHtml () {
		String qualquer = null;
		int TAM = 50;
		String array[] = new String[TAM];
		String array2[] = new String[TAM];
		try {         
			URL url = new URL(this.url);         
			URI uri = url.toURI();          
			BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));          
			String s;        
			int cont = 0;
			//105 linhas diferença
			while ((s = br.readLine()) != null) { 
				
				if (cont == 139) {
					array = s.split(">");
					array2 = array[1].split("</");
					pessoa.setNome(array2[0]);
					qualquer = qualquer+"\n" + s;
					}
				
				if (cont == 146) {
					array = s.split("                ");
					array2 =array[1].split("            </li>");
					if(array2[0].equals("Desconhecido")) {
						pessoa.setPosiçao(array2[0]);}
					else {
						array = s.split("                ");
						array2 =array[1].split("&ordm;            </li>");
						pessoa.setPosiçao(array2[0]);
					}
					qualquer = qualquer+"\n" + s;
					}
				
				
				if (cont == 149) {
					array2 =s.split("</li>");
					if(array2[0].equals("                -            ")) {
						array2 = array2[0].split("                ");
						array2 = array2[1].split("            ");
						pessoa.setPais(array2[0]);}
					else {
						array = s.split(">");
						array2 =array[1].split("</");
						pessoa.setPais(array2[0]);
					}
					qualquer = qualquer+"\n" + s;
					}
				
				if (cont == 152) {
					array = s.split("'name'>");
					array2 =array[1].split("</");
					if(array2[0].equals("'name'><")) {
						pessoa.setUniversidade("Desconhecido");}
					else {
						pessoa.setUniversidade(array2[0]);
					}
					qualquer = qualquer+"\n" + s;
					}
				
				if (cont == 155) {
					array = s.split("                ");
					array2 =array[1].split("            </");
					pessoa.setDesde(array2[0]);
					qualquer = qualquer+"\n" + s;
					}
				
				if (cont == 158) {
					array = s.split("                ");
					array2 =array[1].split("            </");
					pessoa.setPontos(array2[0]);
					qualquer = qualquer+"\n" + s;
					}
				
				if (cont == 161) {
					array = s.split("                ");
					array2 =array[1].split("            </");
					pessoa.setResolvidos(array2[0]);
					qualquer = qualquer+"\n" + s;
					}
				
				if (cont == 164) {
					array = s.split("                ");
					array2 =array[1].split("            </");
					pessoa.setTentado(array2[0]);
					qualquer = qualquer+"\n" + s;
					}
				
				if (cont == 167) {
					array = s.split("                ");
					array2 =array[1].split("            </");
					pessoa.setSubmissoes(array2[0]);
					qualquer = qualquer+"\n" + s;
					}
				
			  cont++;
			}
			
			br.close();      
			} 
		catch (MalformedURLException excecao) {          
			excecao.printStackTrace();      
			} 
		catch (URISyntaxException excecao) {          
			excecao.printStackTrace();      
			} 
		catch (IOException excecao) {          
			excecao.printStackTrace();      
			}
		return qualquer;
	}

	

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Url [url=");
		builder.append(url);
		builder.append("]\n");
		builder.append(pessoa.toString()); 
		return builder.toString();
	}
}

