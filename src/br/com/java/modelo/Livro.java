package br.com.java.modelo;

import br.com.java.Interface.Publicacao;

public class Livro implements Publicacao{
	
	private String titulo;
	private String autor;
	private int totalPaginas;
	private int paginaAtual;
	private boolean aberto;
	private Pessoa leitor;
	
	// Construtor
	public Livro() {
		
	}
	
	public Livro(String titulo, String autor, int totalPaginas, Pessoa leitor) {
		super();
		this.setTitulo(titulo);
		this.setAutor(autor);
		this.setTotalPaginas(totalPaginas);
		this.setAberto(false);
		this.setPaginaAtual(0);
		this.leitor = leitor;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getTotalPaginas() {
		return totalPaginas;
	}
	public void setTotalPaginas(int totalPaginas) {
		this.totalPaginas = totalPaginas;
	}
	public int getPaginaAtual() {
		return paginaAtual;
	}
	public void setPaginaAtual(int paginaAtual) {
		this.paginaAtual = paginaAtual;
	}
	public boolean isAberto() {
		return aberto;
	}
	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}
	public Pessoa getLeitor() {
		return leitor;
	}
	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}
	
	// Métodos Personalizados
	public String detalhes() {
		
			return "Livro {" + 
			        "Titulo = " + titulo +
			        ", autor = " + autor +
			        ", \n totalPaginas = " + totalPaginas + 
			        ", \n aberto = " + aberto + 
			        ", leitor = " + leitor.getNome() +
			        ", idade = " + leitor.getIdade() +
			        ", sexo = " + leitor.getSexo() +
					"}"; 
	}
	@Override
	public void abrir() {
		// TODO Auto-generated method stub
		this.setAberto(true);
		
	}
	@Override
	public void fechar() {
		// TODO Auto-generated method stub
		this.setAberto(false);
		
	}
	@Override
	public void folhear(int pagina) {
		// TODO Auto-generated method stub
		if (pagina > this.getTotalPaginas()) {
			System.out.println("O número da página excede o número total de páginas do livro..!");
			
		} else if (this.isAberto()) {
			this.setPaginaAtual(pagina);
			
		} else {
			System.out.println("Para folhear, o livro precisa estar aberto..!");
		}
		
	}
	@Override
	public void avancarPagina() {
		// TODO Auto-generated method stub
		if (this.isAberto()) {
			this.setPaginaAtual(this.getPaginaAtual() + 1);
			
		} else {
			System.out.println("Para avançar, o livro precisa estar aberto..!");
		}
		
	}
	@Override
	public void voltarPagina() {
		// TODO Auto-generated method stub
		if (this.isAberto()) {
			this.setPaginaAtual(this.getPaginaAtual() - 1);
			
		} else {
			System.out.println("Para voltar, o livro precisa estar aberto..!");
		}
		
	}
	
	
}
