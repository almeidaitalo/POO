package CapturarExcecoes;

	public class ExceptionC extends ExceptionB {

		private static final long serialVersionUID = 1L;
		
		public ExceptionC(String message) {
			super(message);
			// TODO Auto-generated constructor stub
		}
			public static void lancarExcecao() throws ExceptionC {
				
				throw new ExceptionC("Capturando execeção pela classe Execeção C");
			}
	   }

