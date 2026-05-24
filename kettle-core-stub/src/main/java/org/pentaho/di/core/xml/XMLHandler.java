package org.pentaho.di.core.xml;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
public class XMLHandler {
    public static String addTagValue(String tag, String val) {
        return "      <" + tag + ">" + (val != null ? val : "") + "</" + tag + ">" + System.lineSeparator();
    }
    public static String getTagValue(Node n, String tag) {
        if (n == null) return null;
        NodeList children = n.getChildNodes();
        for (int i = 0; i < children.getLength(); i++) {
            Node child = children.item(i);
            if (tag.equals(child.getNodeName())) {
                Node text = child.getFirstChild();
                return text != null ? text.getNodeValue() : null;
            }
        }
        return null;
    }
}
