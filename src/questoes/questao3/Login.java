package questao3;

public class Login {
	private String usuario;
	private String senha;
	
	public Login(String usuario, String senha) {
		
		this.usuario = usuario;
		this.senha = senha;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getUsuario() {
		return usuario;
	}
	
	public boolean fazerLogin(String usuarioT, String senhaT) {
		try {
			if(!usuarioT.equals(usuario)|| !senhaT.equals(senha))throw new Exception();
			
			System.out.println("Login realizado");
			return true;
		}catch(Exception e){
			System.out.println("Nome de usuario ou senha incorretos");
			return false;
		}
	}
	
}
