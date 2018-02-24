public class DBG {
	
	private String className;
	private String methodName;
	private String beginTag;

	private final String tag = "*-dbg-*";
	private String endTag = " " + tag;
	private boolean dbgStatus = false;
	
	
	public DBG( String pClassName, boolean pStatus) {
		this.init(pClassName);
		dbgStatus = pStatus;
	}
	
	public void on( ) {
		dbgStatus = true;
	}

	public void off( ) {
		dbgStatus = false;
	}
	
	public void init(String pClassName) {
		this.className = pClassName;
	}
	
	public void methodNm(String pMethodName ) {
		this.methodName =  pMethodName;
		beginTag = tag + " " + className + "." + methodName + ": " ;
	}	
	
	public void enter() {
		if ( dbgStatus ) { 
			System.out.println("\n" + beginTag + "entering...==> " + endTag);
		}
	}

	public void enter(String pMethodName) {		// accept the methodname also
		methodNm(pMethodName );
		if ( dbgStatus ) { 
			System.out.println("\n" + beginTag + "entering...==> " + endTag);
		}
	}
	public
	void enter(String pMethodName, String pMsg) {		// accept the methodname and a message also
		methodNm(pMethodName );
		if ( dbgStatus ) { 
			System.out.println("\n" + beginTag + "entering...==> " + pMsg + "  " + endTag);
		}
	}
	
	public void exit() {
		if ( dbgStatus ) { 
			System.out.println(beginTag + "==> ... exiting... " + endTag);
		}
	}

	public void exit(String pMsg) {
		if ( dbgStatus ) { 
			this.msg(pMsg);
			System.out.println(beginTag + "==> ... exiting... " + endTag);
		}
	}
	
	public void msg (String txt) {
		if ( dbgStatus ) { 
			System.out.println( beginTag + txt + endTag);
		}
	}
	
	public void MSG (String txt) {
			System.out.println( beginTag + txt + endTag);
	}
	
	public String tTF(boolean condition, String txtTrue, String txtFalse) {
		return (condition ? txtTrue : txtFalse);	
	}
	
	
}
