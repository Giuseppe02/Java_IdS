package it.unipr.informatica.exam;

public class ConnectorHandler extends ElementHandler {
	public MapElement newElement() {
		return new Connector();
	}
	public void connect(Connector conn, Place origin ,Place destionation) {
		conn.setPlacesConnected(origin, destionation);
	}
}
