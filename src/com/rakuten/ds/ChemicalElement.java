package com.rakuten.ds;
	public class ChemicalElement {

		private int atomicNumber;
		private String symbol;
		private String name;

		private static boolean[] alkaliMetals = new boolean[120];
		
		static {
			alkaliMetals[3] = true;
			alkaliMetals[11] = true;
			alkaliMetals[19] = true;
			alkaliMetals[37] = true;
			alkaliMetals[55] = true;
			alkaliMetals[87] = true;
		}

		public ChemicalElement(int atomicNumber, String symbol, String name) {
			super();
			this.atomicNumber = atomicNumber;
			this.symbol = symbol;
			this.name = name;
		}

		public boolean isAlkaliMetal() {

			return alkaliMetals[atomicNumber];
		}

		public boolean isTransitionMetal() {
			return (atomicNumber >= 21 && atomicNumber <= 31)
					||(atomicNumber >= 39 && atomicNumber <= 48)
					|| (atomicNumber >= 72 && atomicNumber <= 80)
					|| (atomicNumber >= 104 && atomicNumber <= 112);
		}

		
		public boolean isMetal() {
			switch(atomicNumber) {
			case 13:
			case 49:
			case 50:
			case 81:
			case 82:
			case 83:
			case 113:
			case 114:
			case 115:
			case 116:
				return true;
			default:
				return false;
			}
		}

		
		public int getAtomicNumber() {
			return atomicNumber;
		}

		public String getSymbol() {
			return symbol;
		}

		public String getName() {
			return name;
		}

		
		
		
	}


