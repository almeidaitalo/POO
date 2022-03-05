package CapturarExcecoes;



	public class ExceptionA extends Exception {
		
		private static final long serialVersionUID = 1L;

		public ExceptionA(String message) {
			super(message);
		}
		
		public static void lancarExcecao() throws ExceptionA {
			
			throw new ExceptionA("Capturando exece��o pela classe Exece��o A");
		}
	}

