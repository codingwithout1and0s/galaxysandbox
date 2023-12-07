package org.comit.galaxysandbox.enums;

public enum LoanType {
		CSFA,
		ABDL,
		NSDL;
	
		private String value;
		
		private void LoanRegionType(String value) {
			this.value = value;
		}
		public String getValue() {
			return this.value;
		}

}
