package CapturarExcecoes;



	public class ClasseMain {
		public static void main(String[] args) {
			try {
				
				ExceptionB.lancarExcecao();
			} catch (ExceptionA e) { 
				System.out.println(e.getMessage()); 
			}
			try {
				
				ExceptionC.lancarExcecao();
			} catch (ExceptionA e) {
				System.out.println(e.getMessage()); 
		  }
			
	   }
	}
