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
    public static Node getSubNode(Node n, String tag) {
        if (n == null) return null;
        NodeList children = n.getChildNodes();
        for (int i = 0; i < children.getLength(); i++) {
            Node child = children.item(i);
            if (tag.equals(child.getNodeName())) return child;
        }
        return null;
    }
    public static int countNodes(Node n, String tag) {
        if (n == null) return 0;
        int count = 0;
        NodeList children = n.getChildNodes();
        for (int i = 0; i < children.getLength(); i++) {
            if (tag.equals(children.item(i).getNodeName())) count++;
        }
        return count;
    }
    public static Node getSubNodeByNr(Node n, String tag, int nr) {
        if (n == null) return null;
        int found = 0;
        NodeList children = n.getChildNodes();
        for (int i = 0; i < children.getLength(); i++) {
            Node child = children.item(i);
            if (tag.equals(child.getNodeName())) {
                if (found == nr) return child;
                found++;
            }
        }
        return null;
    }
}
