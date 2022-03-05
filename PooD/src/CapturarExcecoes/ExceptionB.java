package CapturarExcecoes;

	public class ExceptionB extends ExceptionA {

		private static final long serialVersionUID = 1L;
		
		public ExceptionB(String message) {
			super(message);
			// TODO Auto-generated constructor stub
		}
	    public static void lancarExcecao() throws ExceptionB {
			
			throw new ExceptionB("Capturando execeção pela classe Execeção B");
		}
			
	}

