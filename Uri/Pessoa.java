package Uri;

public class Pessoa {
	private String nome;
	private String posi�ao;
	private String pais;
	private String universidade;
	private String desde;
	private String pontos;
	private String resolvidos;
	private String tentado;
	private String submissoes;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPosi�ao() {
		return posi�ao;
	}
	public void setPosi�ao(String posi�ao) {
		this.posi�ao = posi�ao;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getUniversidade() {
		return universidade;
	}
	public void setUniversidade(String universidade) {
		this.universidade = universidade;
	}
	public String getDesde() {
		return desde;
	}
	public void setDesde(String desde) {
		this.desde = desde;
	}
	public String getPontos() {
		return pontos;
	}
	public void setPontos(String pontos) {
		this.pontos = pontos;
	}
	public String getResolvidos() {
		return resolvidos;
	}
	public void setResolvidos(String resolvidos) {
		this.resolvidos = resolvidos;
	}
	public String getTentado() {
		return tentado;
	}
	public void setTentado(String tentado) {
		this.tentado = tentado;
	}
	public String getSubmissoes() {
		return submissoes;
	}
	public void setSubmissoes(String subimissoes) {
		this.submissoes = subimissoes;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pessoa [Nome=");
		builder.append(nome);
		builder.append(", Posi��o=");
		builder.append(posi�ao);
		builder.append(", Pa�s=");
		builder.append(pais);
		builder.append(", Universidade=");
		builder.append(universidade);
		builder.append(", Desde=");
		builder.append(desde);
		builder.append(", Pontos=");
		builder.append(pontos);
		builder.append(", Resolvidos=");
		builder.append(resolvidos);
		builder.append(", Tentado=");
		builder.append(tentado);
		builder.append(", Submiss�es=");
		builder.append(submissoes);
		builder.append("]");
		return builder.toString();
	}
	
	
	

}
