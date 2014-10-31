package engine.network.snmp;

import engine.network.PolicyReader;

/**
 * Reads policies through SNMP
 * 
 * @author Adrian Bergler
 * @version 2014-10-23
 */
public interface SNMPReader extends PolicyReader {

	/**
	 * Opens the SNMP
	 */
	public void open();

	/**
	 * Closes the SNMP
	 */
	public void close();
}
