package Exercicio4;

public class ControleRemoto {
	private Televisao televisao = new Televisao();
	
	public void aumentaVolume() {
		televisao.setVolume(televisao.getVolume() + 1);
	}
	
	public void diminuiVolume() {
		if(televisao.getVolume() > 0) {
			televisao.setVolume(televisao.getVolume() - 1);	
		} else {
			System.out.println("Volume já está no zero!");
		}
	}
	
	public void trocaCanal(int canalNovo) {
		if(televisao.getCanal() != canalNovo) {
			televisao.setCanal(canalNovo);
		} else {
			System.out.println("Já está neste canal!");
		}
	}
	
	public void getVolumeECanal() {
		System.out.println("Volume: " + televisao.getVolume());
		System.out.println("Canal: " + televisao.getCanal());
	}
}
